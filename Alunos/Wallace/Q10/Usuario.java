package lista.wallace.Q10;


public abstract class Usuario {
    String nome;
    String id;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
        public abstract boolean podeEmprestar();
    
}
