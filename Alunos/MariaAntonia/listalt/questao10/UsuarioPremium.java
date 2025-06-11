/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao10;

import listalt.questao10.Usuario;

/**
 *
 * @author Maria Antônia
 */
public class UsuarioPremium extends Usuario{
    
    //construtor usando super pois ta herdando os atributos da classe mãe Usuario 
    public UsuarioPremium(String nome, int id){
        super(nome,id);
    }
    
    @Override
    public boolean podeEmprestar(){
        return true; // sem limites para emprestimmo 
    }
}
