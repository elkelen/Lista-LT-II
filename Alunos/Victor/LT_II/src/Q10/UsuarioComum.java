package Q10;

public class UsuarioComum extends Usuario {
    
    private static final int LIMITE_EMPRESTIMOS = 3;

    public UsuarioComum(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        
        return this.livrosEmprestados.size() < LIMITE_EMPRESTIMOS;
    }
}