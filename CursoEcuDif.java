import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa el curso de ecuaciones dif. que implementa las clase {@code Sujeto} y {@code Curso}.
 * @author  
 *    BonziBuddy
 * @since 2025-02-23
 */
public class CursoEcuDif implements Sujeto, Curso {
    
    /**
     * Lista de alumnos inscritos en el curso.
     */
    private List<Alumno> listaAlumnos;

    /**
     * Nombre del curso.
     */
    private String nombre;

    /**
     * Mensaje de estado o aviso que se asocia al curso.
     */
    private String mensaje;

    /**
     * Duración del curso en meses.
     */
    private int duracionMeses;

    /**
     * Dificultad del curso
     */
    private int dificultad;

    /*
     * Modalidad del curso en el que este registrado/a
     */
    private String modalidad;  

    /**
     * Objeto auxiliar para generar mensajes de salida.
     */
    private Mensajes msj;

    // Contructor
    /**
     * Crea una nueva instancia de {@code CursoCanto} con el nombre, la dificultad
     * y la modalidad especificadas.
     * <p>
     * La duración del curso se establece por defecto en 12 meses. Se inicializa la
     * lista de alumnos y se asigna un objeto {@link Mensajes} para la generación
     * de salidas de texto.
     * </p>
     *
     * @param nombre      Nombre del curso. (Curso canto)
     * @param dificultad  Dificultad del curso (1 = fácil, 2 = intermedio, 3 = avanzado).
     * @param modalidad   Modalidad numérica que se convertirá en la cadena descriptiva.
     *                    1 = "Teorico", 2 = "Practico", 3 = "Visual".
     */
    public CursoEcuDif (String nombre, int dificultad, int modalidad){
        if ((dificultad< 1) || dificultad >3) throw new ExceptionInInitializerError("dificultad debe ser establecida entre 1 y 3");
        this.nombre = nombre;
        this.mensaje= "";
        this.duracionMeses = 12;
        this.dificultad = dificultad;
        this.listaAlumnos = new ArrayList<>();
        this.setModalidad(modalidad);
        msj = new Mensajes();
    }

    //getter y setter
    /**
     * calcula el costo del curso dependiendo de la dificultad de este.
     * @return El precio calculado en función de la dificultad.
     */
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

    /**
     * Te devuelve el nombre del curso
     * 
     * @return el nombre del curso
     */
    public String getNombre(){
        return nombre;
    }


    /**
     * devuelve una lista de los alumnos inscritos en el curso
     * 
     * @return Una lista de objetos {@code Alumno}
     */
    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    /**
     * Devuelve un mensaje 
     *
     * @return El mensaje actual del curso.
     */
    public String getMensaje(){
        return mensaje;
    }

    /**
     * calcula el costo del curso dependiendo de la dificultad de este.
     * @return El precio calculado en función de la dificultad.
     */
    public int getDificultad(){
        return dificultad;
    }

    /**
     * Devuelve la duracion del curso en meses
     * 
     * @return la duracion del curso
     */
    public int getDuracionMeses(){
        return duracionMeses;
    }

    /**
     * Devuelve la Moldalidad del curso en el que se esta cursando
     * en ese momento
     * 
     * @return Modalidad del curso
     */
    public String getModalidad(){
        return modalidad;
    }

    /**
     * Establece la dificultad del curso.
     *
     * @param dificultad Nueva dificultad (1, 2 o 3).
     */    
    public void setDificultad(int dificultad){
        this.dificultad = dificultad;
    }

    /**
     * Establece un mensaje 
     *
     * @param mensaje El nuevo mensaje que se asignará al curso.
     */
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }   

    //metodos de la interfaz sujeto

    /**
     * Registra a un nuevo alumno en el curso si tiene el dinero suficiente.
     * <p>
     * Si el alumno no tiene dinero suficientes, se muestra un mensaje
     * que no puede inscribirse.
     * </p>
     *
     * @param alumno El alumno que se desea registrar.
     */
    @Override
    public void registrar(Alumno alumno) {
        int costo = this.getPrecio();

        if (alumno.getDinero() < costo) {
            System.out.println(msj.faltaDeFondos(alumno, this));
            return;
        }

        listaAlumnos.add(alumno);
        System.out.println(msj.saludo(alumno,this));
    }

    /**
     * Remueve a un alumno de la lista de alumnos inscritos.
     *
     * @param alumno El alumno que se desea remover.
     */
    @Override
	public void remover(Alumno alumno){
        listaAlumnos.remove(alumno);
        System.out.println(msj.despedida(alumno));
        
    }

    /**
     * Notifica a todos los alumnos inscritos en el curso, llamando a su método
     * {@code actualizar()}.
     */
    @Override
	public void notificar(){
        if(listaAlumnos.size() > 0){
			for(Alumno alumno : listaAlumnos){
				alumno.actualizar();
			}
		}
    }

    /**
     * Establece la modalidad del curso en función de un número entero.
     * Si el número no coincide con ninguna de las opciones, se muestra un mensaje
     * pidiendo una modalidad válida.
     * </p>
     *
     * @param numero Valor numérico que determina la modalidad.
     */
    @Override
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

    /**
     * Cobra el precio del curso a cada alumno inscrito. Si un alumno no tiene
     * el suficientes dinero, se le notifica y se removera de la lista.
     */
    public void cobrar(){

        for (Alumno alumno : listaAlumnos){
            if (this.getPrecio() > alumno.getDinero()){
                System.out.println(msj.faltaDeFondos(alumno, this));
                remover(alumno);
            }
            else {
                alumno.setDinero(alumno.getDinero() - this.getPrecio());
                System.out.println(msj.dineroRestante(alumno,this));
            }
        }
    }
}