
package LISTA.quetãoo10;
import java.util.ArrayList;

public class usuario {
    
   
    protected String nome;
    protected String id;
    protected ArrayList<livro> livrosEmprestados;

    public usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public boolean podeEmprestar() {
        return true; // Sobrescrito nas subclasses
    }

    public void emprestarLivro(livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(livro livro) {
        livrosEmprestados.remove(livro);
    }
}
    
