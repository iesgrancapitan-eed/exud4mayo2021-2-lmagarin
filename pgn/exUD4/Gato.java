package pgn.exUD4;

public class Gato extends Mamifero {
	private static final String MIAUUUUUUUUUUUUU = "Miauuuuuuuuuuuuu";
	public Gato(String nombre, int edad) throws EdadErroneaException {
		setAge(edad);
		this.nombre = nombre;
	}

	public String maullar() {
		return Gato.MIAUUUUUUUUUUUUU;
	}

}
