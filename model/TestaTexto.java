/**
 * Escreva uma descrição da classe TestaPessoa aqui.
 * 
 * @author Miguel Martinazzo 
 * @version 24/03/2022
 */

//import java.util.Scanner;
package model;
import javax.swing.JOptionPane;
import model.Texto;

public class TestaTexto {
    public static void main(String[] args) {
        // cria objeto para entrada pelo teclado (standard input) 
        //Scanner sc = new Scanner(System.in); 
  
        //System.out.println("Forneca um nome: ");
        //String nome = sc.nextLine(); 
         
        // Entrada de um texto (atraves do teclado)
        String str = JOptionPane.showInputDialog("Forneca um texto: ");

        // Criacao de uma instancia da classe nome (criacao do objeto)
        Texto txt = new Texto(str); // Chama o metodo construtor com o nome fornecido

        // Mostra os dados
        System.out.println("          Texto: " + txt + " (" + txt.getQtdePalavras()+ " palavras)");
        //System.out.println("          Texto: " + txt.getTxt() + " (" + txt.getQtdePalavras()+ " palavras)");
        System.out.println("Texto invertido: " + txt.getTextoInvertido());
    }
}
