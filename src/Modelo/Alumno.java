/**
 * 
 */
package Modelo;

/**
 * @author juan_
 *
 */
public class Alumno {
	
	String nombre;
	String apellido;
	int edad;
	double nota;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param nota
	 */
	public Alumno(String nombre, String apellido, int edad, double nota) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.nota = nota;
	}
	
	/**
	 * @param nombre
	 * @param apellido
	 */
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = 0;
		this.nota = 0;
	}
	
	/**
	 * @param edad
	 */
	public Alumno(int edad) {
		this.nombre = "nombre";
		this.apellido = "apellido";
		this.edad = edad;
		this.nota = 0;
	}
	
	/**
	 * @param nota
	 */
	public Alumno(double nota) {
		this.nombre = "nombre";
		this.apellido = "apellido";
		this.edad = 0;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
