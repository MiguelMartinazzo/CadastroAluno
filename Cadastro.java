/* Funcoes de cadastro do aluno
 * .
 * 
 * @author Miguel Martinazzo e Sergio Mateus Tagawa
 * @version 31/03/2022
 */

import model.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Cadastro

{
    // Atributos
    Aluno vetor[];
    Cadastro(int qtd)
    {
        vetor= new Aluno[qtd];
        for(int j=0;j<vetor.length;j++)
        {
            vetor[j] = null;
        }
    }

    // Inserir dados do aluno
    public void inserir()
    {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        for(int j = 0; j < vetor.length; j++)
        {
            if(vetor[j] == null)
            {
                System.out.println("Forneça o nome: ");
                String nome = scan.next();
                System.out.println("Forneça o ra: ");
                String ra = scan.next();
                System.out.println("Forneça o curso: ");
                String curso = scan.next();
                int idade = 0;
                boolean numberOrNot = false;
                boolean teste = false;
                // Verificacao de idade
                do{
                    try{
                        System.out.println("Forneça a idade: ");
                        String idadeAux = scan.next();
                        if(idadeAux != null)
                        {
                            numberOrNot = idadeAux.matches("-?\\d+");   
                        }
                        if(idadeAux != null && numberOrNot != false)
                        {
                            idade = Integer.parseInt(idadeAux);
                        }
                        test2(idade);
                        teste = false;
                    }catch(IdadeException e){
                        teste = true;
                    }
                }while(teste!=false || numberOrNot != true);
                float nota = 0;
                // Verificacao de nota
                do{
                    try{
                        System.out.println("Forneça a nota: ");
                        String notaAux = scan.next();

                        if(notaAux != null)
                        {
                            try{
                                Double.parseDouble(notaAux);
                                numberOrNot = true;
                            }
                            catch(NumberFormatException e){
                                numberOrNot = false;
                            }
                        }
                        if(notaAux != null && numberOrNot != false)
                        {
                            nota = Float.parseFloat(notaAux);
                            numberOrNot = true;
                        }   
                        test1(nota);
                        teste = false;
                    }catch(NotaException e){
                        teste = true;
                    }
                }while(teste != false || numberOrNot==false);

                vetor[j] = new Aluno(nome,idade,ra,curso,nota);
                j = vetor.length;
            }else{
                i++;                
            }
            // Caso a lista esteja lotada . . .
            if(i==5 && vetor[j] != null)
            {
                System.out.println("\nA lista de alunos esta lotada!");
            }
        }
    }

    // Limpa as informacoes de um aluno expecifico
    public void remover()
    {
        // Atribuindo o RA escolhido a variavel ra
        String ra = JOptionPane.showInputDialog("Forneça o ra: ");
        int i = 0;
        String aux = " ";

        // Varrendo a lista de alunos e verificando se ha nela algum aluno com o RA escolhido
        for(int j = 0; j < vetor.length; j++)
        {
            if(vetor[j]!= null)
            {
                aux = vetor[j].getRa();   
            }

            if(aux.equals(ra))
            {
                vetor[j] = null;
                j = vetor.length;
            }else{
                i++;
            }

            // Caso nao encontre o RA digitado na lista . . .
            if(i==5)
            {
                System.out.println("\nO RA digitado nao se encontra na lista."); 
            }
        }
    }

    // Exibindo a lista de alunos
    public void lista()
    {
        int i = 0;
        // Percorrendo a lista e exibindo os alunos cadastrados
        for(int j = 0; j < vetor.length; j++)
        {
            if(vetor[j] != null)
            {
                System.out.println(vetor[j]);   
            }else
            {
                i++;
            }

            // Caso a lista esteja vazia . . .
            if(i==5)
            {
                System.out.println("A lista esta vazia!");
            }
        }
    }

    public void lerArquivo(){
        File f = null;
        String arquivo = null;
        boolean repetir = false;
        Scanner scan = new Scanner(System.in);
        
        String nome = "";
        String ra = "";
        String curso = "";
        int idade = 0;
        float nota = 0;

        do {
            repetir = false;
            System.out.println("Arquivo: ");
            arquivo = scan.next();
            f = new File(arquivo);
            if (!f.exists()) { // Verifica se o qruivo existe
                System.out.println("Arquivo:" + arquivo + " inexistente, deseja tentar de novo?(s/n): ");
                String sn = scan.next();
                if (sn.toUpperCase().charAt(0) == 'S') {
                    repetir = true;
                } else {
                    System.exit(0);
                }
            }
        } while(repetir);

        // Classes para leitura de dados
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
        } catch(FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: " + arquivo);
            return;
        } catch(Exception ex) {
            System.out.println("Erro inesperado ao tentar abrir o arquivo: " + arquivo);
            ex.printStackTrace();
            return;
        }

        try {
            String line = br.readLine();
            int i = 0;
            while(line != null) { // Enquanto existir linha no arquivo
                String separadores = "\n"+ "|"; //"\t\n\r\f"+ "|";
                StringTokenizer st = new StringTokenizer(line, separadores);

                // String    
                if (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    nome = s;
                    System.out.println("Leu o String: " + s + " do disco");
                } else {
                    throw new DadosIncorretosException();
                }
                
                // inteiro
                if (st.hasMoreTokens()) {
                    String tok = st.nextToken();
                    int a = Integer.parseInt(tok);
                    idade = a;
                    System.out.println("Leu o inteiro: " + a + " do disco");
                } else {
                    throw new DadosIncorretosException();
                }

                // String    
                if (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    ra = s;
                    System.out.println("Leu o String: " + s + " do disco");
                } else {
                    throw new DadosIncorretosException();
                }

                // String    
                if (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    curso = s;
                    System.out.println("Leu o String: " + s + " do disco");
                } else {
                    throw new DadosIncorretosException();
                }
                
                // float
                if (st.hasMoreTokens()) {
                    String tok = st.nextToken();
                    float b = Float.parseFloat(tok);
                    nota = b;
                    System.out.println("Leu o float: " + b + " do disco");
                } else {
                    throw new DadosIncorretosException();
                }

                vetor[i] = new Aluno(nome,idade,ra,curso,nota);
                i++;
                line = br.readLine(); // Le a proxima linha
            }

        } catch(DadosIncorretosException ex) {
            System.out.println("Erro: " + ex.getMessage());
            return;
        } catch(EOFException ex) {
            System.out.println("Atingiu prematuramente o final do arquivo: " + arquivo);
            return;
        } catch(IOException ex) {
            System.out.println("Nao conseguiu ler do arquivo: " + arquivo);
            return;
        } catch(Exception ex) {
            System.out.println("Erro inesperado ao tentar ler o arquivo: " + arquivo);
            ex.printStackTrace();
            return;
        } finally {
            try {
                br.close();
            } catch(Exception ex) {
                // Nao faz nada !
            }
            try {
                fr.close();
            } catch(Exception ex) {
                // Nao faz nada !
            }
        }
    }

    public void escreverArquivo(){
        File file = null;
        String arquivo = null;
        String sn = "S";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Arquivo: ");
            arquivo = scan.next();
            file = new File(arquivo);
            if (file.exists()) {
                System.out.println("Arquivo: " + arquivo + " ja existe, pode sobrescreve-lo?(s/n): ");
                sn = scan.next();
            }

        } while(sn.toUpperCase().charAt(0) == 'N');

        char separador = '|'; // caractere que sera utilizado para separar os dados

        // Classes de gravacao de dados
        PrintWriter pw = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
        } catch(IOException ex) {
            System.out.println("Nao conseguiu abrir o arquivo: " + arquivo);
            return;
        } catch(Exception ex) {
            System.out.println("Erro inesperado ao tentar abrir o arquivo: " + arquivo);
            return;
        }

        for (int i = 0; i < 5; i++) { //para gravar algumas linhas
            System.out.println("Teste 0");
            try{
                String nome = vetor[i].getNome();
                pw.print(nome);
                pw.print(separador); 
            }catch(Exception ex){

            }

            System.out.println("Teste 1");
            try{

                int idade = vetor[i].getIdade();
                pw.print(idade);
                pw.print(separador); 
            }catch(Exception ex){

            }

            System.out.println("Teste 2");
            try{
                String ra = vetor[i].getRa();
                pw.print(ra);
                pw.print(separador); 
            }catch(Exception ex){

            }

            System.out.println("Teste 3");
            try{
                String curso = vetor[i].getCurso();
                pw.print(curso);
                pw.print(separador); 
            }catch(Exception ex){

            }

            System.out.println("Teste 4");
            try{
                float nota = vetor[i].getNota();
                pw.print(nota);
                pw.println(separador); // muda de linha
            }catch(Exception ex){

            }
        }

        try {
            pw.close();
        } catch(Exception ex) {
            // Nao faz nada!
        }
        try {
            fos.close();
        } catch(Exception ex) {
            // Nao faz nada!
        }

    }

    public static void test1(float x) throws NotaException{
        if(x<0 || x>10){
            throw new NotaException("Nota invalida,digite uma nota de 0 a 10.\n");
        }
    }

    public static void test2(int x) throws IdadeException{
        if(x<16 || x>100){
            throw new IdadeException("Idade invalida,digite uma idade de 16 a 100.\n");
        }
    }
}
