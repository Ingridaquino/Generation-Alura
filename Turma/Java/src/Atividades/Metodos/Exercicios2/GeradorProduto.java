package Atividades.Metodos.Exercicios2;

import java.util.ArrayList;
import java.util.List;

public class GeradorProduto {
    public static void main(String[] args) {
        ClassProduto produtos = new ClassProduto();
        ClassProduto produtos2 = new ClassProduto();

        produtos.setProduto("Geladeira");
        produtos.setMarca("Consul");
        produtos.setValor(2252.5);

        produtos2.setProduto("Fogão");
        produtos2.setMarca("Consul");
        produtos2.setValor(1600.5);

        System.out.println(produtos.getProduto());
        System.out.println(produtos.getMarca());
        System.out.println(produtos.getValor());

        System.out.println("----------------\n");

        System.out.println(produtos2.getProduto());
        System.out.println(produtos2.getMarca());
        System.out.println(produtos2.getValor());
        produtos.listCompra();
    }
}
