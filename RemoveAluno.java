
/**
 * Escreva uma descrição da classe RemoveAluno aqui.
 * 
 * @author Miguel Martinazzo
 * @version 22/06/2026
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class RemoveAluno implements ActionListener
{
    private TextField campo1;
    private CadastroGrafico cad = new CadastroGrafico(5);
    private JButton ok;
    public void Remove(){
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(6,1));

        Label Ra = new Label("Forneça o RA do aluno que deseja remover: ");
        campo1 = new TextField(15);
        frame.add(Ra); frame.add(campo1);

        ok = new JButton("Remover");

        ok.addActionListener(this);
        frame.add(ok);

        frame.setBounds(100, 150, 450, 200); // Seta posição e tamanho
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        try{
            String ra= campo1.getText();
            cad.remover(ra);

        }catch(Exception e){

        }

    }

    public CadastroGrafico retornaCad1(){
        return cad;
    }
}
