package Q9;

public class Relatorio extends Documento {

    public Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo relatório: " + titulo);
        System.out.println("Carregando gráficos e tabelas...");
    }
}
