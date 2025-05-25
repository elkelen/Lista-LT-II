package lista.wallace.Q10;

import lista.wallace.Q10.Usuario;


public class UsuarioPremium extends Usuario {
    
     public UsuarioPremium(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return true; 
    }
    
}
