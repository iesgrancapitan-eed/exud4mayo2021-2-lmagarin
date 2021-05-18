package pgn.exUD4;

/**
 * Lanzada para indicar que una edad es errónea
 * 
 * @author María Lourdes Magarín Corvillo
 *
 */
public class EdadErroneaException extends Exception {
	/**
	 * Construye una EdadErroneaException con el mensaje especificado
	 * 
	 * @param string mensaje de la excepción
	 */
	public EdadErroneaException(String string) {
		super(string);
	}

}
