package instituto;
/**
 * @brief Clase Profesor que deriva de Persoa
 * 
 * Esta clase define a una persona que es profesor,
 * la cual desciende de persona. En ella se crearan objetos
 * que serán los profesores del instituto
 * 
 * @author a16marleneod
 * @version 1.0
 *
 */
public class Profesor extends Persoa {

	private int salario;

	/**
	 * @brief Método constructor Profesor
	 * 
	 * Este método nos permite crear objetos de la clase Profesor
	 * con todos sus atributos
	 * @param nome Atributo heredado de Persoa
	 * @param idade Atributo heredado de Persoa
	 * @param salario Atributo propio que indica el salario de cada objeto
	 */
	public Profesor(String nome, int idade, int salario) {
		super(nome, idade);
		this.salario = salario;
	}

	/**
	 * @brief Método para obtener el salario de cada profasor
	 * 
	 * Este método permite que podamos extraer el atributo del objeto perteneciente
	 * a Profesor, en concreto el salario que se le adjudica a cada objeto
	 *
	 * @return salario nos devuelve el atributo salario
	 */
	public int getSalario() {
		return salario;
	}
	/**
	 * @brief Método para modificar el salario de cada profesor
	 * 
	 * Este método permite que podamos modificar el objeto perteneciente
	 * a Profesor, en concreto el salario que se le adjudica a cada objeto
	 * 
	 * @param salario atributo a modificar
	 */

	public void setSalario(int salario) {
		this.salario = salario;
	}
	/**
	 * @brief Método para mostrar la información
	 * 
	 * Este método nos permite extraer la información de los atributos
	 * de un objeto, de una manera concatenada y ordenada
	 * @return devuelve una cadena de String con los atributos, tanto del padre como del hijo
	 */

	public String toString() {
		return "Profesor [salario=" + salario + ", nome=" + nome + ", idade=" + idade + "]";
	}
}
