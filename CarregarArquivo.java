/**
 * Escreva uma descrição da classe IdadeValida aqui.
 * 
 * @author Miguel Martinazzo
 * @version 22/06/2026
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class CarregarArquivo implements ActionListener
{
    private TextField campo1;
    private CadastroGrafico cad = new CadastroGrafico(5);
    private String nomeArquivo = "";
    private JButton carregar;
    
    public void carregar(){
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(6,1));

        Label Ra = new Label("Forneça o nome do arquivo: ");
        campo1 = new TextField(15);
        frame.add(Ra); frame.add(campo1);

        carregar = new JButton("Carregar");

        carregar.addActionListener(this);
        frame.add(carregar);

        frame.setBounds(100, 150, 450, 200); // Seta posição e tamanho
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {

        try{
            nomeArquivo = campo1.getText();
            cad.lerArquivo(nomeArquivo);
        }catch(Exception e){

        }

    }
    
    public CadastroGrafico retornaCad2(){
        return cad;
    }
}
