/**
 * Esta clase representa a un alumno que puede inscribirse y desinscribirse de un curso,
 * como tambien recibir notificaciones de dichos cursos
 */
import java.util.ArrayList;
import java.util.List;

public class Alumno implements Observador{
    
    
    /**
     * Atributos de la clase alumno
     */

    /**
     * Representa el nombre del Alumno 
     */
    private String nombre;

    /**
     * Representa el dinero que tiene el ALumno 
     */
    private int dinero ;

    /**
     * Representa la lista de cursos a los que esta incrito el alumno
     */
    private List <Curso> listaCursos;

    /**
     * Representa las notificaciones que recibe de los profesores 
     */
    private String notificacion;


    /**
     * Metodos de la clase Alumno
     */
    /**
     * Metodo Contructor de la clase Alumno
     * @param nombre, recibe un String que es el nombre del alumno
     * @param dinero, recibe un entero que es el dinero del alumno
     */
    public Alumno (String nombre, int dinero){
        this.nombre = nombre;
        this.dinero = dinero;
        this.listaCursos = new ArrayList<>();
    }

    /**
     * Metodo que regresa el nombre del alumno
     * @return nombre del alumno en un String
     */
    public  String getNombre(){
        return nombre;
    }

    /**
     * Metodo que regresa el dinero del alumno 
     * @return regresa un enteor con valkor al dinero que tiene el alumno
     */
    public int getDinero(){
        return dinero;
    }

    /**
     * Metodo que cambia el dinero que tiene el alumno
     * @param dinero, recibe un entero con la cantidad de dinero a sustituir 
     */
    public void setDinero(int dinero){
        this.dinero = dinero;
    }

    /**
     * Metodo que agrega el curso a la lista de los cursos del Alumno el curso recibido
     * @param curso, recibe un curso de tipo Curso 
     */
    public void incribirCurso(Curso curso){
        listaCursos.add(curso);
    }

    /**
     * Este metodo recorre la lista de los cursos e imprime sus notificaciones
     */
	public void actualizar(){
        notificacion = "notificaciones de " + getNombre()+":";
        for (Curso curso : listaCursos){
            notificacion += curso.getNombre() +":"+  curso.getMensaje() + "\n";

        }        
        verNotificacion();
	}

    /**
     * Metodo que imprime en terminal la notificacion que tiene el alumno
     */
    public void verNotificacion(){
        System.out.println(notificacion);
    }

    /**
     * Metodo que elimina de la lista de curso del alumno el curso recibido
     * @param curso, recibe un curso de tipo Curso
     */
    public void desinscribirse (Curso curso){
        if (listaCursos.size() ==0){

        }else{
            listaCursos.add(curso);
        }
    }
}