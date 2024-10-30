/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

/**
 *
 * @author CLEBERDASILVAFERNAND
 */
public class Eletronicos extends Produto {
    public Eletronicos(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getTipo() {
        return "Eletrônico";
    }
}
    

