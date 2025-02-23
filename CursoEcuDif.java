import java.util.ArrayList;
import java.util.List;

public class CursoEcuDif implements Sujeto, Curso {
    
    private List<Alumno> listaAlumnos;
    private String nombre;
    private String mensaje;
    private int duracionMeses;
    private int dificultad;
    private String modalidad;  
    private Mensajes msj;

    //Constructor
    public CursoEcuDif (String nombre, int dificultad, int modalidad){
        if ((dificultad< 1) || dificultad >2) throw new ExceptionInInitializerError("dificultad debe ser establecida entre 1 y 3");
        this.nombre = nombre;
        this.mensaje= "";
        this.duracionMeses = 12;
        this.dificultad = dificultad;
        this.listaAlumnos = new ArrayList<>();
        this.setModalidad(modalidad);
        msj = new Mensajes();
    }

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

    public String getModalidad(){
        return modalidad;
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
			for(Alumno alumno : listaAlumnos){
				alumno.actualizar();
			}
		}
    }

    // @Override
    public void setModalidad (int numero){
        switch (numero){
            case 1:
                modalidad = "Teorico";
                return;
            case 2:
                modalidad = "Practico";
                return;
            case 3:
                modalidad = "Visual";
                return;
            default:
                System.out.println("Elije una modalidad válida");
                return;
        }
    }

    private int getPrecio (){
        int precio = 0;
        if (this.dificultad == 1){
            precio = 140;
        } else if (this.dificultad == 2){
            precio = 155;
        } else if (this.dificultad == 3){
            precio = 200;
        }
        return precio;
    }

    public void cobrar(){

        for (Alumno alumno : listaAlumnos){
            if (this.getPrecio() > alumno.getDinero()){
                System.out.println(msj.faltaDeFondos(alumno, this));
                remover(alumno);
            }
            else {
                alumno.setDinero(alumno.getDinero() - this.getPrecio());
                System.out.println(msj.dineroRestante(alumno));
            }
        }
    }
}