package lista.Q010;

class UsuarioComum extends Usuario {

    public UsuarioComum(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados.size() < 3;
    }
}
