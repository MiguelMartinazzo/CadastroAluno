/*
 * Representa uma pessoa.
 * 
 * @author Miguel Martinazzo e Sergio Mateus Tagawa
 * @version 24/03/2022
 */

package model;
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestaNome {
    public static void main(String[] args) {
         
        // Entrada de um nome (atraves do teclado)
        String nome = JOptionPane.showInputDialog("Forneça o nome de uma pessoa: ");

        // Criacao de uma instancia da classe nome (criacao do objeto)
        NomePessoa nm = new NomePessoa(nome); // Chama o metodo construtor com o nome fornecido

        // Mostra os dados
        System.out.println("             Nome: " + nm.getNome() + " (" + nm.getQtdePalavras()+ " palavras)");
        System.out.println("   Nome invertido: " + nm.getNomeInvertido());
        System.out.println("Nome bibliografia: " + nm.getNomeBiblio());
    }
}
