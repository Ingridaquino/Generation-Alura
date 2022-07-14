package Atividades.Metodos.Exercicios2;

public class ClassProduto {

        private String produto;
        private String marca;
        private Double valor;


    //Vai receber o valor
        public void setProduto(String produto){
            this.produto = produto;
        }

        //Devolve o valor
        public String getProduto(){
            return produto;
        }


        ///Sobrenome
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }


        //Idade
        public void setValor(Double valor){
            this.valor = valor;
        }

        public Double getValor(){
            return valor;
        }

        public void listCompra() {
            System.out.println("Produtos já comprado");
        }

    }
