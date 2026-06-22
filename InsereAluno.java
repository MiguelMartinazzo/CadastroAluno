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

public class InsereAluno implements ActionListener
{
    private TextField campo1,campo2,campo3,campo4,campo5;
    private JButton ok;
    private CadastroGrafico cad = new CadastroGrafico(5);
    private int j = 0;
    public void Insere(){

        JDialog frame = new JDialog();
        frame.setLayout(new GridLayout(6,1));

        Label nome = new Label("Forneça o nome: ");
        campo1 = new TextField(15);
        frame.add(nome); frame.add(campo1); 

        Label RA = new Label("Forneça o RA: ");
        campo2 = new TextField(15);
        frame.add(RA); frame.add(campo2);

        Label curso = new Label("Forneça o curso: ");
        campo3 = new TextField(15);
        frame.add(curso); frame.add(campo3);

        Label idade = new Label("Forneça a idade: ");
        campo4 = new TextField(15);
        frame.add(idade); frame.add(campo4);

        Label nota = new Label("Forneça a nota: ");
        campo5 = new TextField(15);
        frame.add(nota); frame.add(campo5);

        ok = new JButton("Inserir na lista");

        ok.addActionListener(this);
        frame.add(ok);

        frame.setBounds(100, 150, 450, 200); // Seta posição e tamanho
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae) {

        try{
            String nometxt= campo1.getText();
            String ratxt= campo2.getText();
            String cursotxt= campo3.getText();
            String idadetxt= campo4.getText();
            String notatxt= campo5.getText();
            cad.inserir(nometxt,ratxt,cursotxt,idadetxt,notatxt);

        }catch(Exception e){

        }

    }
    
    public CadastroGrafico retornaCad(){
        return cad;
    }
}
