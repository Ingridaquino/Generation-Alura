package Atividades.Polimorfismo;

public abstract class Animal  implements  AnimailEmitir{

    private String nome;
    private Integer idade;


    public abstract void correr();

    @Override
    public void emitir() {

    }
}
