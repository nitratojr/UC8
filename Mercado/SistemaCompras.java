/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

import java.util.Scanner;

/**
 *
 * @author CLEBERDASILVAFERNAND
 */
public class SistemaCompras {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Carrinho carrinho = new Carrinho();
            boolean executar = true;
            while (executar) {
                int opcao;

                System.out.println("\nMenu de Compras:");
                System.out.println("1 - Adicionar produto ao carrinho");
                System.out.println("2 - Remover produto do carrinho");
                System.out.println("3 - Mostrar carrinho");
                System.out.println("4 - Finalizar compra");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Selecione o tipo de produto:");
                        System.out.println("1 - Eletrônico");
                        System.out.println("2 - Vestuário");
                        System.out.println("3 - Alimento");
                        System.out.println("4 - Nsei");
                        System.out.println("5 - Periférico");
                        System.out.print("Escolha o tipo: ");
                        int tipo = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o preço do produto: ");
                        double preco = scanner.nextDouble();
                   

                        Produto produto = null;
                        switch (tipo) {
                            case 1:
                                produto = new Eletronicos(nome, preco);
                                break;
                            case 2:
                                produto = new Vestuario(nome, preco);
                                break;
                            case 3:
                                produto = new Alimento(nome, preco);
                                break;
                            case 4:
                                produto = new Nsei(nome, preco);
                                break;
                            case 5:
                                produto = new Periferico(nome, preco);
                                break;
                            default:
                                System.out.println("Tipo inválido!");
                                break;
                        }
                        if (produto != null) {
                            carrinho.adicionarProduto(produto);
                        }
                        break;

                    case 2:
                        System.out.print("Digite o nome do produto para remover: ");
                        String nomeRemover = scanner.nextLine();
                        carrinho.removerProduto(nomeRemover);
                        break;

                    case 3:
                        carrinho.mostrarCarrinho();
                        break;

                    case 4:
                        carrinho.mostrarCarrinho();
                        double total = carrinho.calcularTotal();
                        System.out.println("Total a pagar: R$" + total);
                        System.out.print("Confirmar pagamento? (s/n): ");
                        char confirmacao = scanner.next().charAt(0);
                        if (confirmacao == 's' || confirmacao == 'S') {
                            System.out.println("Compra finalizada com sucesso!");
                            carrinho = new Carrinho(); 
                        } else {
                            System.out.println("Compra cancelada.");
                        }
                        break;

                    case 0:
                        System.out.println("Saindo do sistema...");
                        executar = false;
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            }
        }
    }
}
