/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao9;

/**
 *
 * @author curso
 */
public class Carta extends Documento{

    public Carta() {
    }

    public Carta(String titulo) {
        super(titulo);
    }
    
    @Override
    public void abrir(){
        System.out.println("Carta de titulo - " + titulo + " - aberta!");
    }
}
