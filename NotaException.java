/**
 * Escreva uma descrição da classe IdadeValida aqui.
 * 
 * @author Miguel Martinazzo
 * @version 22/06/2026
 */
public class NotaException extends Exception{
    
    NotaException(){
        super("Nota invalida.Digite uma nota de 0 a 10.");
    }
    
    NotaException(String msg){
        super(msg);
    }
}