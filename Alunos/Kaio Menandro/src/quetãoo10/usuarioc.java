package LISTA.quetãoo10;

public class usuarioc extends usuario {
  
    public usuarioc(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados.size() < 3;
    }
}
