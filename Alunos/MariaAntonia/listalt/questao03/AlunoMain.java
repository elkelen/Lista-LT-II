/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listalt.questao03;

import listalt.questao03.Aluno;
import java.util.Scanner;

/**
 *
 * @author Maria Antônia
 */
public class AlunoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        // aluno com construtor sem parametros (objeto)  
        Aluno a1 = new Aluno();
        System.out.println("Aluno sem parametros: "); 
        a1.exibirInformacoes();
        
        
        // aluno com construtor com parâmetros 
        System.out.println("--- ALUNO COM PARAMETRO ---");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine(); 
        System.out.println("Digite o seu numero de matricula: "); 
        String matricula = scanner.nextLine(); 
        System.out.println("Digite o seu curso: "); 
        String curso = scanner.nextLine();
        
        Aluno a2 = new Aluno(nome,matricula,curso);
        a2.exibirInformacoes();
        
    }
    
}
