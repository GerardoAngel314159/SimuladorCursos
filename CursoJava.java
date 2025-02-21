import java.util.ArrayList;
import java.util.List;

public class CursoJava implements Sujeto, Curso{
    
    private List<Alumno> listaAlumnos;
    private String nombre;
    private String mensaje;
    private int duracionMeses;
    private int dificultad;

    //Constructor
    
    //getter y setter
    public String getNombre(){
        return nombre;
    }

    public String getMensaje(){
        return mensaje;
    }

    public int getDificultad(){
        return dificultad;
    }

    public int getDuracionMeses(){
        return duracionMeses;
    }


    public void setDificultad(int dificultad){
        this.dificultad = dificultad;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    //metodos de la interfaz sujeto 
    public void registrar(Alumno alumno){
        listaAlumnos.add(alumno);
    }

	public void remover(Alumno alumno){
        listaAlumnos.remove(alumno);
    }

	public void notificar(){
        if(listaAlumnos.size() > 0){

			for(Alumno alumno : alumno){
				alumno.actualizar();
			}
		}
    }



    




}