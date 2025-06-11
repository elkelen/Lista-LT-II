/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao06;

import listalt.questao06.Endereco;

/**
 *
 * @author Maria Antônia
 */
public class Pessoa {
    String nome; 
    int idade; 
    Endereco endereco; 
    
    public Pessoa(String nome, int idade, Endereco endereco){
        this.nome=nome; 
        this.idade= idade; 
        this.endereco=endereco; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return "--- PESSOA ---"+
               "\nNome: "+nome+"\n"+
               "Idade: "+idade+" anos \n"+
               "--- ENDERECO ---"+endereco.toString()+"\n";
                
    }
}
