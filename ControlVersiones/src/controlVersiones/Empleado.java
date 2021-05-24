package controlVersiones;

/**
 * @author Ilia
 * @since 24/05/2021
 * @version Version 1,2021
 */
public class Empleado {

	private String nombre;
	private String apellidos;
	private double salario; 

	/**
	 * @param nombre Este atributo es el nombre del empleado
	 * @param apellido Este atrbibuto contiene los apellidos del empleado
	 * @param salario Este atributo es el salario del empleado
	 */
public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellidos = apellido;
	this.salario = salario;
}

/**
 * @return devuelve el nombre del empleado
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return devuelve los apellidos del empleado
 */
public String getApellidos() {
	return apellidos;
}
/**
 * @param apellidos
 */
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
/**
 * @return devuelve el salario del empleado
 */
public double getSalario() {
	return salario;
}
/**
 * @param salario
 */
public void setSalario(double salario) {
	this.salario = salario;
}
//Este método hace la suma del salario base con la subida de salario introducida como variable de entrada, no devuelve ningún valor
/**
 * @param subida
 */
public void subirsalario (double subida) {
	salario=salario+subida;
}


}
