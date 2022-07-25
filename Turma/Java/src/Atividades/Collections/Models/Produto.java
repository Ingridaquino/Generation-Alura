package Atividades.Collections.Models;

public class Produto {


    private String produto;
    private String marca;

    public Produto(String produto, String marca){
        this.produto = produto;
        this.marca = marca;
    }

    public Produto(){

    }

    public String getProduto() {

        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
