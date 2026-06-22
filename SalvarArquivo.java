
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

public class SalvarArquivo implements ActionListener
{
    private TextField campo1;
    private CadastroGrafico cad = new CadastroGrafico(5);
    private JButton salvar;
    public void salvar(CadastroGrafico cad1){
        this.cad = cad1;
        
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(6,1));

        Label nomeA = new Label("Forneça o nome do arquivo: ");
        campo1 = new TextField(15);
        frame.add(nomeA); frame.add(campo1);

        salvar = new JButton("Salvar");

        salvar.addActionListener(this);
        frame.add(salvar);

        frame.setBounds(100, 150, 450, 200); // Seta posição e tamanho
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        try{
            String nomeArquivo = campo1.getText();
            cad.escreverArquivo(nomeArquivo);

        }catch(Exception e){

        }

    }
}
