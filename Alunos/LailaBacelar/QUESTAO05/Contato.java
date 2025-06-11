package QUESTAO05;
import java.util.HashSet;
import java.util.Objects;

public class Contato {

    String nome;
    String email;
    double telefone;

    public Contato(String nome, String email, double telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               ", E-mail: " + email +
               ", Telefone: " + telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contato)) return false;
        Contato outro = (Contato) obj;
        return Objects.equals(email, outro.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        System.out.println("Adicionando contatos...\n");
                Contato c1 = new Contato("LúciaBarreto", "lucia@empresa.com", 9988-5544);
        Contato c2 = new Contato("Felipe Amorim", "felipe@empresa.com", 9977-3322);
        Contato c3 = new Contato("Marcos Barreto", "lucia@empresa.com", 9966-2211); // mesmo email de Lúcia

        contatos.add(c1);
        contatos.add(c2);
        boolean adicionado = contatos.add(c3);

        if (!adicionado) {
            System.out.println("Contato com e-mail 'lucia@empresa.com' já existe. Marcos não foi adicionado.\n");
        }

        System.out.println("Lista de contatos armazenados no conjunto:");

        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
}

