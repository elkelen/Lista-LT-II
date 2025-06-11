/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao9;

/**
 *
 * @author curso
 */
public class Relatorio extends Documento{

    public Relatorio() {
    }

    public Relatorio(String titulo) {
        super(titulo);
    }
    
    @Override
    public void abrir(){
        System.out.println("Relatório de titulo - " + titulo + " - aberto!");
    }
}
