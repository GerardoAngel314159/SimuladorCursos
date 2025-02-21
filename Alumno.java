import java.util.ArrayList;
import java.util.List;

public class Alumno{
    
    //Atributos
    private String nombre;
    private int dinero ;
    private List <Curso> listaCursos;
    private String notificacion;

    //metodos 

    //constructor
    public Alumno (String nombre, int dinero){
        this.nombre = nombre;
        this.dinero = dinero;
        this.listaCursos = new ArrayList<>();
    }


    public  String getNombre(){
        return nombre;
    }

    public int getDinero(){
        return dinero;
    }

    public void setDinero(int dinero){
        this.dinero = dinero;
    }

    public void incribirCurso(Curso curso){
        listaCursos.add(curso);
    }

	public void actualizar(){
		String notificacion = curso.getMensaje();
		verNotificacion();
        
	}

    public void verNotificacion(){
        System.out.println(notificacion);
    }






}