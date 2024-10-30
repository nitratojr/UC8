package Mercado;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CLEBERDASILVAFERNAND
 */
public class Periferico extends Produto {

    public Periferico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getTipo() {
        return "Periférico";
    }
}
