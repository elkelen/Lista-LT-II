/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao10;

/**
 *
 * @author curso
 */
public class UsuarioComum extends Usuario{
    private int limite = 3;

    public UsuarioComum(String nome, String id) {
        super(nome, id);
    }
    
    @Override
    public boolean podePegarEmprestado(){
        return livros.size()<3;
    }
}
