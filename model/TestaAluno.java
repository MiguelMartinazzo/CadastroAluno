/*
 * Representa uma pessoa.
 * 
 * @author Miguel Martinazzo e Sergio Mateus Tagawa
 * @version 24/03/2022
 */

package model;
import model.*;


import javax.swing.JOptionPane;

public class TestaAluno
{
    public static void main(String args[])
    {   
        String nome = JOptionPane.showInputDialog("Forneça o nome: ");;
        String ra = JOptionPane.showInputDialog("Forneça o ra: ");;
        String curso = JOptionPane.showInputDialog("Forneça o curso: ");;
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça a idade: "));;
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Forneça a nota: "));;
        
        // Instancia um objeto Aluno
        Aluno a = new Aluno(nome,idade,ra,curso,nota);
        
        System.out.println(a);
        
        // Cria um vetor de alunos
        Aluno vetor[] = new Aluno[5];
        
        // Inicia como NULL
        for(int j=0;j<vetor.length;j++)
        {
            vetor[j] = null;
        }
        
        // Mostra vetor
        for(int i=0; i < vetor.length; i++)
        {
            if(vetor[i] != null)
            {
               System.out.println(vetor[i]); 
            }
        }
        
    }
}
