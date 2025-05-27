package lista.wallace.Q05;

import java.util.Objects;
public class Contato {
    String nome;
    String email;
    String telefone;
    
    public Contato(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Telefone: " + telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contato contato = (Contato) obj;
        return email.equals(contato.email); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(email); 
    }
    
}
