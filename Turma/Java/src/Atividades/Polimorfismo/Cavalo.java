package Atividades.Polimorfismo;

public class Cavalo extends Animal{



    public void correr() {
        System.out.println("Cavalo correndo ...");
    }

    @Override
    public void emitir() {
        System.out.println("Som do cavalo ...");
    }
}
