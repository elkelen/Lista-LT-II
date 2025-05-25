package lista.wallace.Q06;

public class Endereco {
    String rua;
    int numero;
    String cidade;
    String cep;
    
    public Endereco(String rua, int numero, String cep, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.cep =cep;
        this.cidade = cidade;
    }    

     @Override
    public String toString() {
        return rua + ", " + numero + " - " + cidade + " | CEP: " + cep;
    }  
}
