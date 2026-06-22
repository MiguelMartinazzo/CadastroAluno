/**
 * Escreva uma descrição da classe IdadeValida aqui.
 * 
 * @author Miguel Martinazzo
 * @version 22/06/2026
 */

public class IdadeException extends Exception{

    IdadeException(){
        super("Idade invalida.Digite uma idade entre 16 e 100.");
    }
    
    IdadeException(String msg){
        super(msg);
    }
}