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

public class Botao extends JFrame{
    private JButton inserir = new JButton("Inserir"); 
    private JButton remover = new JButton("Remover");
    private JButton listar = new JButton("Listar"); 
    private JButton salvar = new JButton("Salvar"); 
    private JButton carregar = new JButton("Carregar");
    private JButton sair = new JButton("Sair");
    private ButtonHandler handler;

    public Botao(){
        super("Cadastro Aluno");
        
        GridLayout grid = new GridLayout(10,1); // Define o layout do

        JLabel label = new JLabel("                                               CADASTRO ALUNO");
        add(label);
        
        setLayout(new GridLayout(10,1));
        handler=new ButtonHandler(inserir, remover, listar, salvar, carregar, sair);

        inserir.addActionListener(handler);
        add(inserir);

        remover.addActionListener(handler);
        add(remover);
        
        listar.addActionListener(handler);
        add(listar);
        
        salvar.addActionListener(handler);
        add(salvar);
        
        carregar.addActionListener(handler);
        add(carregar);

        sair.addActionListener(handler);
        add(sair);
    }

}