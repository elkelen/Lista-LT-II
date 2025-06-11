/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao3;

/**
 *
 * @author curso
 */
public class Princiapal3 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("Evelyn", "20211ireinfint0006", "Informatica");
        
        System.out.println("--------Aluno 1 (sem parametros)-----------");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Matricula: " + a1.getMatricula());
        System.out.println("Curso: " + a1.getCurso());
        
        System.out.println("--------Aluno 2 (com parametros)-----------");
        System.out.println("Nome: " + a2.getNome());
        System.out.println("Matricula: " + a2.getMatricula());
        System.out.println("Curso: " + a2.getCurso());
    }
}
