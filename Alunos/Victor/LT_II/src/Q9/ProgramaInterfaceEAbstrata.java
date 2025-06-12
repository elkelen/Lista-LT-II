package Q9;

public class ProgramaInterfaceEAbstrata {
    public static void main(String[] args) {
       
        Imprimivel prod = new Produto("Notebook", 3500.00);
        Imprimivel func = new Funcionario("Victor", "123.456.789-00", 2800.00);

        prod.imprimir();
        System.out.println("----------------------");
        func.imprimir();

        System.out.println("======================");

        
        Documento relatorio = new Relatorio("Relatório Mensal de Vendas");
        Documento carta = new Carta("Carta de Apresentação");

        relatorio.abrir();
        System.out.println("----------------------");
        carta.abrir();
    }
}