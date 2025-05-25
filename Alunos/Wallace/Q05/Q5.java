package lista.wallace.Q05;

import java.util.HashSet;


public class Q5 {

    
    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Wallace", "wallace@email.com", "74999123485");
        Contato c2 = new Contato("Lucas", "lucas@email.com", "74999567828");
        Contato c3 = new Contato("Keila", "keila@email.com", "74999328945"); 
        Contato c4 = new Contato("Julia", "keila@email.com", "74999965841");

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3); 
        contatos.add(c4);

        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
    
}
