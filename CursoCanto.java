import java.util.ArrayList;
import java.util.List;

public class CursoCanto implements Sujeto, Curso {
    
    private List<Alumno> listaAlumnos;
    private String nombre;
    private String mensaje;
    private int duracionMeses;
    private int dificultad;
    private String modalidad;
    private Mensajes msj;

    //Constructor
    public CursoCanto (String nombre, int dificultad, int modalidad){
        this.nombre = nombre;
        this.mensaje= "";
        this.duracionMeses = 12;
        this.dificultad = dificultad;
        this.listaAlumnos = new ArrayList<>();
        this.setModalidad(modalidad);
        msj = new Mensajes();
    }

    private int getPrecio() {
        int precio = 0;
        switch (this.dificultad) {
            case 1:
                precio = 100;
                break;
            case 2:
                precio = 125;
                break;
            case 3:
                precio = 150;
                break;
            default:
                precio = 0; 
                break;
        }
        return precio;
    }
    
    

    //getter y setter
    public String getNombre(){
        return nombre;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
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
    public void registrar(Alumno alumno) {
        int costo = this.getPrecio();

        if (alumno.getDinero() < costo) {
            System.out.println(msj.faltaDeFondos(alumno, this));
            return;
        }

        listaAlumnos.add(alumno);
        System.out.println(msj.saludo(alumno,this));
    }

	public void remover(Alumno alumno){
        listaAlumnos.remove(alumno);
        System.out.println(msj.despedida(alumno));
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

    public void cobrar() {
        for (Alumno alumno : listaAlumnos) {
            if (this.getPrecio() > alumno.getDinero()) {
                System.out.println(msj.faltaDeFondos(alumno, this));
                remover(alumno);
            } else {
                alumno.setDinero(alumno.getDinero() - this.getPrecio());
                System.out.println(msj.dineroRestante(alumno, this));
            }
        }
    }
    
}