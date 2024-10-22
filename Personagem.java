/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GamesWar;

/**
 *
 * @author CLEBERDASILVAFERNAND
 */
public class Personagem {
    public String nome;
    public int vida;
    public int ataque;
    
    public Personagem(String nome,int vida,int ataque){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        

    }
            public void atacar(Personagem oponente){
             oponente.vida -= this.ataque;
                   
        }
            public boolean estarVivo(){
                if(vida > 0){
                    System.out.println(" ainda esta vivo");
                    return true;
                }else{
                     System.out.println("Morreuuu");
                     return false;
                }
                    
            }
    
}
