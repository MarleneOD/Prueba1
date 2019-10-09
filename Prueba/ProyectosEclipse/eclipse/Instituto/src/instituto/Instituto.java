package instituto;

/**
 * @brief Es la clase main en donde operaremos con las clases
 * 
 * Esta clase es la main de instituto. En ella crearemos objetos
 * de las clases pertenecientes a instituto y operaremos con ellos
 * @version 1.0
 * @author a16marleneod
 *
 */
public class Instituto {
	public static void main(String[] args) {
		Profesor[] profesores = new Profesor[2];
		Alumno[] alumnos = new Alumno[2];
		
		Profesor profe1 = new Profesor("Xiana Pérez", 36, 25000);
		Profesor profe2 = new Profesor("Antía Domínguez", 41, 30000);
		
		profesores[0] = profe1;
		profesores[1] = profe2;
		
		for (int i=0; i<profesores.length; i++) {
			System.out.println(profesores[i].toString());
		}
		
		Alumno alumno1 = new Alumno("Xurxo Gómez", 23);
		Alumno alumno2 = new Alumno("Aitor Núñez", 19);
		
		alumnos[0] = alumno1;
		alumnos[1] = alumno2;
		
		for (int i=0; i<alumnos.length; i++) {
			System.out.println(alumnos[i].toString());
		}
	}

}
