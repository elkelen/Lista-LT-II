package LISTA.questão5;
import java.util.HashSet;
import java.util.Objects;

public class contato {
    private String nome;
    private String email;
    private int telefone;

    public contato(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String toString() {
        return "Nome: "+nome+",\nEmail: "+email+",\nTelefone: "+telefone+"";
                }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof contato)) return false;
        contato outro = (contato) obj;
        return Objects.equals(email, outro.email);
    }
    @Override
        public int hashCode() {
        return Objects.hash(email);
        }
    
    public static void main(String[] args) {
    HashSet<contato> contatos = new HashSet<>();

    contato c = new contato("Kaio", "kasjhfkasjfhskjd", 324534534);
    System.out.println(c);

    contatos.add(c);

    for (contato ct : contatos) {
        System.out.println(ct);
    }
}
        
    }
    
    

