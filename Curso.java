/**
 * Interfaz Curso la cual define los metodos que realizaran los cursos que la implementen
 */
public interface Curso{

    /**
     * Metodo que cobra al alumno el dinero que cuesta el curso al incribirse un mes 
     */
    public void cobrar();

    /**
     * Metodo que modifica la modalidad con la que trabaja el curso 
     * @param numero un entero que va del 1 al 3
     */
    public void setModalidad (int numero);

    /**
     * Metodo que da el nombre del curso 
     * @return el nombre del curso 
     */
    public String getNombre();

    /**
     * Metodo que devuelve la modalidad con la que trabaja el curso
     * @return un string con la modalidad del curso
     */
    public String getModalidad();

    /**
     * Metodo que devuelve el mensaje que va dar el curso a los alumno 
     * @return un String con el mensaje que se va a dar 
     */
    public String getMensaje();

    /**
     * Metodo que registrar a el alumno recibido en la lista de Alumnos del curso 
     * @param alumno, recibe un alumno de tipo alumno 
     */
    public void registrar(Alumno alumno);

    /**
     * Este metodo elimina al alumno recibido de la lista de alumnos del curso
     * @param alumno, recibe un alumno de tipo alumno
     */
    public void remover(Alumno alumno);

    /**
     * Este método notifica a los alumnos con el mensaje nuevo del curso imprimiendo en pantalla el mensaje
     */
    public void notificar();

}