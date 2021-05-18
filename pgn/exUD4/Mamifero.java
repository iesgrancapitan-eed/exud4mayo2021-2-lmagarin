package pgn.exUD4;

/**
 * La clase Mamímero representa a un mamífero con nombre y edad.
 * 
 * @author María Lourdes Magarín Corvillo
 *
 */
public class Mamifero {

	/**
	 * Edad del mamífero
	 */
	protected int edad;
	/**
	 * Nombre del mamífero
	 */
	protected String nombre;

	/**
	 * Devuelve la edad del mamífero
	 * 
	 * @return la edad del mamífero
	 */
	public int getEdad() {
		return this.edad;
	}

	/**
	 * Devuelve el nombre del mamífero
	 * 
	 * @return el nombre del mamífero
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece una nueva edad del mamífero
	 * 
	 * @param edad nueva edad del mamífero
	 * @throws EdadErroneaException si la edad es negativa
	 */
	public void setAge(int edad) throws EdadErroneaException {
		if (edad < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.edad = edad;
	}

}