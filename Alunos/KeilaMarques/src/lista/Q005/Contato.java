
package lista.Q005;

import java.util.Objects;

public class Contato {
    private String nome;
    private  String telefone;
    private  String email;
    
    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "CONTATO | " + "NOME: " + nome.toUpperCase() + " - " + "EMAIL: " + email.toUpperCase() + " | " + "TELEFONE - " + telefone.toUpperCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
    
}
