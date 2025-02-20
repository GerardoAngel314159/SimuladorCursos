import java.util.ArrayList;
import java.util.List;

public class Alumno{
    
    //Atributos
    private String nombre;
    private int dinero ;
    private List<Cursos> listaCursos;

    //metodos 

    //constructor
    public Alumno (String nombre, int dinero, List<Cursos> listaCursos){
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

    public void incribirCurso(Curso curso){
        listaCursos.add(curso);
    }

}