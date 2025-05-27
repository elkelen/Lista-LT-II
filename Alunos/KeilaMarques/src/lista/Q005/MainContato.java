package lista.Q005;

import java.util.HashSet;

public class MainContato {

    public static void main(String[] args) {
        
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("KEILA ", "KEILA@EMAIL.COM", "123456");
        Contato c2 = new Contato("WALLACE ", "WALLACE@EMAIL.COM", "654321");
        Contato c3 = new Contato("LUCAS ", "LUCAS@EMAIL.COM", "987654");

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);

        System.out.println("CONTATOS NO HASHSET:");
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
}