package Q9;

public class Carta extends Documento {

    public Carta(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo carta: " + titulo);
        System.out.println("Exibindo conteúdo da correspondência...");
    }
}
