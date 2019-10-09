package instituto;

/**
 * 
 * @brief Es la clase de la que derivaran otras clases
 * 
 * Define las caracter�sticas b�sicas de la clase gen�rica persona de la 
 * cual partir�n otras dos m�s espec�ficas
 * 
 * Los atributos a definir son el nombre y la edad
 * 
 * @author a16marleneod
 * @version 1.0
 *
 */
public class Persoa {
	protected String nome;
	protected int idade;

	
	public Persoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	/**
	 * @brief M�todo para obtener el nombre
	 * 
	 * Este m�todo nos permite extraer el atributo nombre de la clase persona
	 * en cada uno se sus objetos
	 * @return nos devuelve el atributo nombre
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @brief M�todo para modificar nombre
	 * 
	 * Este m�todo nos permite la modificaci�n del atributo nombre
	 * de un objeto perteneciente a la clase persona
	 * @param nome Atributo en donde se guarda el nombre del objeto
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 *  @brief M�todo para obtener la edad
	 * 
	 * Este m�todo nos permite extraer el atributo edad de la clase persona
	 * en cada uno se sus objetos
	 * @return nos devuelve el atributo edad
	 * 
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @brief M�todo para modificar edad
	 * 
	 * Este m�todo nos permite la modificaci�n del atributo edad
	 * de un objeto perteneciente a la clase persona
	 * @param idade Atributo en donde se guarda la edad del objeto
	 */
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @brief M�todo para mostrar la informaci�n
	 * 
	 * Este m�todo nos permite extraer la informaci�n de los atributos
	 * de un objeto, de una manera concatenada y ordenada
	 * @return devuelve una cadena de String con los atributos
	 */
	
	public String toString() {
		return "Persoa [nome=" + nome + ", idade=" + idade + "]";
	}
}
