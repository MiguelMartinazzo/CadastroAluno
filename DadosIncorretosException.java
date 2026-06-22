/**
 * Escreva uma descrição da classe IdadeValida aqui.
 * 
 * @author Miguel Martinazzo
 * @version 22/06/2026
 */

public class DadosIncorretosException extends Exception {

    private static final long serialVersionUID = 1L;
    
    DadosIncorretosException() {
        super("Arquivo texto com dados incorretos.");
    }
    DadosIncorretosException(String msg) {
        super(msg);
    }
}