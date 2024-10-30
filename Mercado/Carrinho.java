package Mercado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author CLEBERDASILVAFERNAND
 */
public class Carrinho{

    private ArrayList<Produto> itens = new ArrayList<>();


    public void adicionarProduto(Produto produto) {
        itens.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }

    public void removerProduto(String nome) {
        for (Produto produto : itens) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                itens.remove(produto);
                System.out.println(produto.getNome() + " removido do carrinho.");
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho.");
    }

    public void mostrarCarrinho() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Produto produto : itens) {
                System.out.println(produto.getNome() + " - " + produto.getTipo() + " - R$" + produto.getPreco());
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }
}
