/**
 * Escreva uma descrição da classe IdadeValida aqui.
 * 
 * @author Miguel Martinazzo
 * @version 22/06/2026
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class InterfaceGrafica {
    public static void main(String[] args) {
        Botao botoes = new Botao();

        botoes.setBounds(500, 300, 400, 450); // Seta posição e tamanho
        botoes.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        botoes.getContentPane().setBackground(Color.cyan);
        botoes.setVisible(true);
    }
}