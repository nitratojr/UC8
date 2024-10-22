/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GamesWar;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Guerreiro: ");
        String nomeGuerreiro = scanner.nextLine();
        Guerreiro guerreiro = new Guerreiro(nomeGuerreiro);

        System.out.print("Digite o nome do Mago: ");
        String nomeMago = scanner.nextLine();
        Mago mago = new Mago(nomeMago);

        System.out.print("Digite o nome do Arqueiro: ");
        String nomeArqueiro = scanner.nextLine();
        Arqueiro arqueiro = new Arqueiro(nomeArqueiro);

        Personagem personagem1 = null, oponente = null;
        while (true) {
            System.out.println("escolha seu personagem:");
            System.out.println("1 - Guerreiro : ");
            System.out.println("2 - Mago : ");
            System.out.println("3 - Arqueiro : ");

            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    personagem1 = guerreiro;
                    break;
                case 2:
                    personagem1 = mago;
                    break;
                case 3:
                    personagem1 = arqueiro;
                    break;
                default:
                    System.out.println("Escolha inv�lida.");
                    continue;
            }

            System.out.println("escolha seu oponente:");
            System.out.println("1 - Guerreiro");
            System.out.println("2 - Mago");
            System.out.println("3 - Arqueiro");

            int escolhaOponente = scanner.nextInt();
            scanner.nextLine();
            switch (escolhaOponente) {
                case 1:
                    oponente = guerreiro;
                    break;
                case 2:
                    oponente = mago;
                    break;
                case 3:
                    oponente = arqueiro;
                    break;
                default:
                    System.out.println("Escolha inv�lida.");
                    continue;

            }

            if (personagem1 == oponente) {
                System.out.println("Voc� n�o pode lutar contra voc� mesmo!");
                continue;

            }
            personagem1.atacar(oponente);

            if (!oponente.estarVivo()) {
                System.out.println("\n" + oponente.nome + " foi derrotado! " + personagem1.nome + " venceu a batalha!");
                break;

            }

            scanner.close();

        }
    }
}