package Atividades.Collections;

import Atividades.Collections.Models.Produto;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        Produto produto = new Produto();

        //Lista de usuários
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Geladeira", "Eletrolux"));
        produtos.add(new Produto("Fogão", "Consul"));
        produtos.add(new Produto("Máquina de lavar", "Brastemp"));


        for (Produto item : produtos){
            System.out.println(item.getProduto());
            System.out.println(item.getMarca());

            System.out.println("-----------------------------------");
        }

        //Remover
        Integer indexParaDeletar = null;

        for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getProduto().equals("Geladeira")){
                indexParaDeletar = i;
            }
        }

        if(indexParaDeletar != null){
            produtos.remove(indexParaDeletar.intValue());
        }



        //Update
        for( Produto item : produtos){
            if(item.getMarca().equals("Consul")){
                item.setMarca("Samsung");
            }

            System.out.println(item.getProduto());
            System.out.println(item.getMarca() + "\n");
        }


    }




}
