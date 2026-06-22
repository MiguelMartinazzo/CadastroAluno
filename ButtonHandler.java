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

import model.*;

public class ButtonHandler implements ActionListener {
    private JButton Inserir, Remover, Listar, Salvar, Carregar, Sair;
    private CadastroGrafico cad = new CadastroGrafico(5);
    private Aluno vetor[] = new Aluno[5];
    private InsereAluno a = new InsereAluno();
    private RemoveAluno b = new RemoveAluno();
    private SalvarArquivo c = new SalvarArquivo();
    private CarregarArquivo d = new CarregarArquivo();
    private int i = 0;

    public ButtonHandler(JButton Inserir, JButton Remover, JButton Listar, JButton Salvar, JButton Carregar, JButton Sair){
        this.Inserir = Inserir;
        this.Remover = Remover;
        this.Listar = Listar;
        this.Salvar = Salvar;
        this.Carregar = Carregar;
        this.Sair = Sair;
    }

    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == Inserir){

            a.Insere();
            cad = a.retornaCad(); 
        
        }

        if(evento.getSource() == Remover){
            b.Remove();
            cad = b.retornaCad1();
        }

        if(evento.getSource() == Listar){
            cad.lista();
        }

        if(evento.getSource() == Salvar){
            c.salvar(cad);
        }

        if(evento.getSource() == Carregar){
            d.carregar();
            cad = d.retornaCad2();
        }

        if(evento.getSource() == Sair){

            System.exit(0);
        }
    }
}