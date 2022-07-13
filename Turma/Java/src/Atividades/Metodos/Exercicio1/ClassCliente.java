package Atividades.Metodos.Exercicio1;

public class ClassCliente {
    private String nome;
    private String sobrenome;
    private Integer idade;



    //Vai receber o valor
    public void setNome(String nome){
        this.nome = nome;
    }

    //Devolve o valor
    public String getNome(){
        return nome;
    }


    ///Sobrenome
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    //Idade
    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public Integer getIdade(){
        return idade;
    }


    //Método
    public static void cadastrado(){
        System.out.println("Cadastrado...");
    }


}
