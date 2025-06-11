package QUESTAO06;
public class Endereco {
    String rua;
    int numero;
    String cidade;
    double cep;

    public Endereco(String rua, int numero, String cidade, double cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }
    
    @Override
    public String toString() {
        return "Endereco{" +
                "RUA: '" + rua + '\'' +
                ", NÚMERO: " + numero +
                ", CIDADE: '" + cidade + '\'' +
                ", CEP: '" + cep + '\'' +
                '}';
    }
}

