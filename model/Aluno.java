/*
 * Representa um aluno.
 * 
 * @author Miguel Martinazzo e Sergio Mateus Tagawa 
 * @version 25/03/22
 */

package model;
import model.*;

public class Aluno extends Pessoa
{
    // Atributos
    private String ra;
    private String curso;
    private float nota;

    public Aluno(String nome, int idade, String ra, String curso, float nota)
    {
        // Chama construtor pai
        super(nome, idade);

        // Preenche dados especificos 
        setRa(ra);
        setCurso(curso);
        setNota(nota);
    }

    // Setters
    public void setRa(String ra)
    {
        this.ra = ra;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }

    public void setNota(float nota)
    {
        this.nota = nota;
    }

    // Getters
    public String getRa()
    {
        return this.ra;
    }

    public String getCurso()
    {
        return this.curso;
    }

    public float getNota()
    {
        return this.nota;
    }

    // Dados do aluno
    public String toString()
    {
       String aux = "Nome: " + getNome();
       aux = aux + "\nIdade: " + getIdade();
       aux = aux + "\nRA: : " + getRa();
       aux = aux + "\nCurso: " + getCurso();
       aux = aux + "\nNota: " + getNota();
       return aux;
    }
}

