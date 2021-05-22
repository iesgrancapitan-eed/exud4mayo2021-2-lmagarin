package pgn.exUD4;

/**
 * La clase Gato representa a un gato con nombre y edad que maulla.
 * 
 * @author María Lourdes Magarín Corvillo
 *
 */
public class Gato extends Mamifero {
	/**
	 * La cadena que devuelve un gato cuando maúlla. Representa el maullido de un
	 * Gato.
	 */
	private static final String MIAUUUUUUUUUUUUU = "Miauuuuuuuuuuuuu";

	/**
	 * Genera un nuevo gato. El estado del gato consta de nombre y edad.
	 * 
	 * @param nombre identificador del nuevo gato
	 * @param edad   edad del nuevo gato
	 * @throws EdadErroneaException si la edad es errónea
	 */
	public Gato(String nombre, int edad) throws EdadErroneaException {
		setAge(edad);
		this.nombre = nombre;
	}

	/**
	 * Maulla el gato
	 * 
	 * @return el maullido
	 */
	public String maullar() {
		return Gato.MIAUUUUUUUUUUUUU;
	}

}
