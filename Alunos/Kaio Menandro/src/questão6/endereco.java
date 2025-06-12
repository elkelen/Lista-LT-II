package LISTA.questão6;

public class endereco {
       
    String rua;
    int numero;
    String cidade;
    double cep;

    public endereco(String rua, int numero, String cidade, double cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }
    
    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
    

