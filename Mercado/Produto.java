/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;



/**
 *
 * @author CLEBERDASILVAFERNAND
 */
abstract class Produto {
    
    private String nome;
    private Double preco;
  
    
     public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    

    public abstract String getTipo();
}
            
            
            
    

