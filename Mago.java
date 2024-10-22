/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GamesWar;

/**
 *
 * @author CLEBERDASILVAFERNAND
 */
public class Mago extends Personagem {
    public Mago(String nome){
        super(nome,80,25);
    }
     public void lancarFeitico(Personagem oponente) {
        if (this.estarVivo()) {
            int danoFeitico = this.ataque * 2;
            oponente.vida -= danoFeitico;
            System.out.println(this.nome + " lançou um feitiço em " + oponente.nome + " causando " + danoFeitico + " de dano.");
            if (oponente.vida <= 0) {
                oponente.vida = 0;
                System.out.println(oponente.nome + " foi derrotado!");
            } else {
                System.out.println("Vida restante de " + oponente.nome + ": " + oponente.vida);
            }
        } else {
            System.out.println(this.nome + " não pode lançar feitiço porque está morto.");
        }
        
    
     }
}
