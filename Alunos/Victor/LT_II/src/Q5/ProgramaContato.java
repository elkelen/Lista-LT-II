package Q5;

import java.util.HashSet;

public class ProgramaContato {
    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Ana", "ana@email.com", "1111-1111");
        Contato c2 = new Contato("Bruno", "bruno@email.com", "2222-2222");
        Contato c3 = new Contato("Carlos", "ana@email.com", "3333-3333"); // mesmo e-mail de c1

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3); 

        System.out.println("Contatos no HashSet:");
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
}