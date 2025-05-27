
package lista.Q009;

public class Relatorio extends Documento {

    public Relatorio(String titulo) {
        super(titulo); 
    }

    @Override
    public void abrir() {
        System.out.println("ABRINDO RELATORIO '" + titulo + "' EM FORMATO PDF...");
    }
}
