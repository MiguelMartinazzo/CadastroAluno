/*
 * Representa uma pessoa.
 * 
 * @author Miguel Martinazzo e Sergio Mateus Tagawa
 * @version 24/03/2022
 */

package model;
import model.*;

public class Pessoa 
{
    // Atributos
    NomePessoa nome;
    int idade;
    
    // Construtor
    public Pessoa (String nome, int idade)
    {
        setNome(nome);
        setIdade(idade);
    }
    
    // setter e getter
    public void setNome(String nome)
    {
        this.nome = new NomePessoa(nome);
    }
    
    public String getNome()
    {
        return this.nome.getNome();
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public String getNomeInvertido()
    {
        return this.nome.getNomeInvertido();
    }
    
    public String getNomeBiblio()
    {
       return this.nome.getNomeBiblio(); 
    }
    
    public String toString()
    {
        return "Nome: " + getNome() + "\nIdade: " + getIdade();
    }
}
