/**
 * Escreva uma descrição da classe TestaPessoa aqui.
 * 
 * @author Miguel Martinazzo 
 * @version 24/03/2022
 */

package model;
import model.*;

import javax.swing.JOptionPane;

public class TestaPessoa
{
    public static void main(String[] args) {
        // Entradas via teclado

        String nome = JOptionPane.showInputDialog("Forneça o nome: ");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça a idade: "));

        // Atributos

        Pessoa p = new Pessoa(nome,idade);

        // Prints

        System.out.println("Pessoa: " + nome);
        System.out.println("Idade: " + idade); 
        System.out.println("Nome Bibliográfico: " + p.getNomeBiblio());
        System.out.println("Nome Invertido: " + p.getNomeInvertido());

    }
}
