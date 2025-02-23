/**
 * clase que representa al "sujeto" en el patron Observer
 */
public interface Sujeto{

	/**
	 * Metodo que agrega a un alumno a la lista de alumnos que estan inscritos en el curso 
	 * @param alumno de la clase 
	 */
    public void registrar(Alumno alumno);

	/**
	 * Metodo que elimina a un alumno de la lista de alumnos que estan en el curso
	 */
	public void remover(Alumno alumno);

	/**
	 * Metodo que notifica a los alumnos de los mensajes mandados por el curso
	 */
	public void notificar();

}