/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

/**
 *
 * @author CLEBERDASILVAFERNAND
 */
public class Alimento extends Produto {
      public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getTipo() {
        return "Alimento";
    }
}

    

