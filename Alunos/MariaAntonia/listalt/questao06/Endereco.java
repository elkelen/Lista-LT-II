/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao06;

/**
 *
 * @author Maria Antônia
 */
public class Endereco {
    String rua; 
    int numero; 
    String cidade; 
    String cep; 
    
    //  construtor 
    public Endereco(String rua, int numero, String cidade, String cep){
        this.rua= rua; 
        this. numero = numero; 
        this.cidade= cidade; 
        this.cep = cep; 
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    @Override
    public String toString(){
        return "\nRua: "+rua+"\n"+
               "Numero: "+numero+"\n"+
               "Cidade: "+cidade+"\n"+
               "Rua: "+cep+"\n";
                
               
    }
    
}
