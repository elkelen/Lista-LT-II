package quest005;

import java.util.HashSet;

public class TestContato {
    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Ana", "ana@email.com", "1111-1111");
        Contato c2 = new Contato("Ana Silva", "ana@email.com", "2222-2222"); // mesmo e-mail para testar wild
        Contato c3 = new Contato("João", "joao@email.com", "3333-3333");

        contatos.add(c1);
        contatos.add(c2); // ignorado porque o e-mail é igual ao c1
        contatos.add(c3);

        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
}
