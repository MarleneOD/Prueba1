package instituto;

/**
 * @brief Clase Alumno que deriva de Persoa
 * 
 * Esta clase define a una persona que es alumno,
 * la cual desciende de persona. En ella se crearan objetos
 * que ser�n los alumnos del instituto
 * 
 * @author a16marleneod
 *@version 1.0
 *
 */
public class Alumno extends Persoa{

	
	static int numExpedienteActual = 0;
	private int numExpediente;

	/**
	 * @brief M�todo constructor Alumno
	 * 
	 * Este m�todo nos permite crear objetos de la clase Alumno
	 * con todos sus atributos
	 * @param nome Atributo heredado de Persoa
	 * @param idade Atributo heredado de Persoa
	 */
	public Alumno(String nome, int idade) {
		super(nome, idade);
		Alumno.numExpedienteActual++;
		this.numExpediente = Alumno.numExpedienteActual;
	}

	/**
	 * @brief M�todo para obtener el n�mero de expediente
	 * 
	 * Este m�todo permite que podamos extraer el atributo del objeto perteneciente
	 * a Alumno, en concreto el n�mero de expediente que se le adjudica
	 * autom�ticamente
	 *
	 * @return nos devuelve el atributo numero expediente
	 */
	public int getNumExpediente() {
		return numExpediente;
	}
	
	/**
	 * @brief M�todo para mostrar la informaci�n
	 * 
	 * Este m�todo nos permite extraer la informaci�n de los atributos
	 * de un objeto, de una manera concatenada y ordenada
	 * @return devuelve una cadena de String con los atributos, tanto del padre como del hijo
	 */

	public String toString() {
		return "Alumno [numExpediente=" + numExpediente + ", nome=" + nome + ", idade=" + idade + "]";
	}
}
