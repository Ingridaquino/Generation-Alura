package Atividades.Metodos.Exercicio1;

import Atividades.Metodos.Exercicio1.ClassCliente;

public class GeradorCliente {

    public static void main(String[] args) {
        //Instanciando o objeto do ClassCliente;
        ClassCliente cliente = new ClassCliente();


        //Cadastro
        cliente.setNome("Amora");
        cliente.setSobrenome("Lee");
        cliente.setIdade(4);


        //busca
        System.out.println(cliente.getNome());
        System.out.println(cliente.getSobrenome());
        System.out.println(cliente.getIdade());
        cliente.cadastrado();

    }
}
