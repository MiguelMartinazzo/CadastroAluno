
/*
 * Aplicativo de cadastro.
 * 
 * @author Miguel Martinazzo e Sergio Mateus Tagawa
 * @version 30/03/2022
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class InterfaceConsole
{
    // Aplicativo de cadastro do aluno
    public static void main(String[] args) {
        // Atributos
        Cadastro cad = new Cadastro(5);
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        
        // Loop do menu enquanto a pessoa nao selecionar a opcao 4
        while(opcao != 6)
        {
            // Pegando a opcao da pessoa
            System.out.println("Menu\n 1:Inserir\n 2:Remover\n 3:Listar\n 4:Salvar lista\n 5:Carregar lista\n 6:Sair\n");
            opcao = scan.nextInt();
            // Menu de opcoes
            switch(opcao)
            {
                // Inserir dados do aluno
                case 1 : 
                    cad.inserir();
                    break;
                
                // Remover dados de um aluno especifico
                case 2:
                    cad.remover();
                    break;

                // Exibindo a lista
                case 3:
                    cad.lista();
                    break;
                
                // Criando um arquivo txt
                case 4:
                    cad.escreverArquivo();
                    break;
                    
                // Lendo um arquivo txt    
                case 5:
                    cad.lerArquivo();
                    break;
                    
                // Saida do menu
                case 6: 
                    break;
            }
        }   

    }
}
