package lista.wallace.Q10;

import lista.wallace.Q10.Usuario;

public class UsuarioComum extends Usuario {
    int livrosEmprestados = 0;

     public UsuarioComum(String nome, String id) {
        super(nome, id);
    }
    
     @Override
    public boolean podeEmprestar() {
        return livrosEmprestados < 3; 
    }

    public void addLivro() {
        livrosEmprestados++;
    }

    public void removeLivro() {
        livrosEmprestados--;
    }
}
