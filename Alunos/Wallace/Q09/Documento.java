package lista.wallace.Q09;


public abstract class Documento {
    String titulo;
    
    public Documento(String titulo){
        this.titulo = titulo;
    }
    
     public abstract void abrir();
}
