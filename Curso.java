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

    public void registrar(Alumno alumno);

    public void remover(Alumno alumno);

    public void notificar();

}