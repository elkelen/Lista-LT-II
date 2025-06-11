/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao05;
import java.util.Objects;
/**
 *
 * @author Maria Antônia
 */
public class Contato {
    String nome; 
    String email;
    String telefone; 
    
    
    // construtor
    public Contato (String nome, String email, String telefone){
        this.nome = nome; 
        this.email = email; 
        this.telefone = telefone; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    // método toString(), pelo que entendi ele vai facilitar a exibição dos contatos, ao inves de colocar tudo no println, chamo o método 
    @Override
    public String toString(){
        return "--- O contato e: --- \n "+
                "Nome: "+nome+ "\n"+
                "Email: "+email+ "\n"+
                "Telefone: "+telefone+"\n";
    }
    
    // método equals que vai comparar os objetos para saber se são iguais 
    @Override
    public boolean equals(Object objeto){
        if (this == objeto) 
            return true; 
        if(objeto == null || getClass() != objeto.getClass())
            return false;
        
        Contato contato = (Contato)objeto;
        return email.equals(contato.email);
    }
    
    // método hashCode()
    @Override
    public int hashCode(){
        return Objects.hash(email);
    }
}
