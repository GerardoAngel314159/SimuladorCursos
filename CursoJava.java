

/**
*Clase que representa a CursoJava implementando metodos de las interfaces Sujeto y Curso
*/
import java.util.ArrayList;
import java.util.List;

public class CursoJava implements Sujeto, Curso {
    
    /**
    * Atributos de la clase 
    */
    
    /**
    *Representa la lista de alumnos inscritos en el curso
    */
    private List<Alumno> listaAlumnos;
    
    /**
    *Representa al nombre del curso con un String
    */
    private String nombre;
    
    /**
    *Representa al mensaje actual del curso
    */
    private String mensaje;
    
    /**
    *Representa la duración que va a tener el curso 
    */
    private int duracionMeses;
    
    /**
    *Representa la dificultad que tendrá el curso con un numero entero de 1-3
    */
    private int dificultad;
    
    /**
    *Representa la modalidad que tendrá el curso con un String
    */
    private String modalidad;
    
    /**
    *Representa un objeto de la clase mensaje 
    */
    private Mensajes msj;


    /**
    *Metodos de la clase 
    */

    /**
    *Metodo constructor de la clase CursoJava
    *@param nombre del curso en un String
    *@param dificultad del curso representada por un número entero del 1-3
    *@param modalidad del curso usando un String
    */
    public CursoJava (String nombre, int dificultad, int modalidad){
        this.nombre = nombre;
        this.mensaje= "";
        this.duracionMeses = 12;
        this.dificultad = dificultad;
        this.listaAlumnos = new ArrayList<>();
        this.setModalidad(modalidad);
        msj = new Mensajes();
    }

    /**
     * Metodo que devuelve el nombre de la clase
     * @return nombre de la clase en un String
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Metodo que obtiene el mensaje actual del curso
     * @return Un string con el mensaje actual del curso
     */
    public String getMensaje(){
        return mensaje;
    }

    /**
     * Metodo el cual devuelve la dificultad del curso
     * @return un entero tq 1<=x<=3 que es la dificultad 
     */
    public int getDificultad(){
        return dificultad;
    }

    /**
     * Metodo que devuelve la duracion del curso
     * @return un entero con valor de cuantos meses dura el curso
     */
    public int getDuracionMeses(){
        return duracionMeses;
    }

    /**
     * Metodo que devuelve la modalidad del curso en un String
     * @return String con valor a la modalidad que el curso tiene
     */
    public String getModalidad(){
        return modalidad;
    }

    /**
     * Metodo que cambia la dificultad del curso con un entero
     * @param dificultad un entero del 1 al 3
     */
    public void setDificultad(int dificultad){
        this.dificultad = dificultad;
    }

    /**
     * Metodo que cambia el mensaje actual del curso 
     * @param mensaje, un string con el nuevo mensaje para el curso
     */
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }   


    //metodos de la interfaz sujeto 
    /**
     * Metodo que registra un alumno a la lista de alumnos del curso 
     * @param alumno de tipo alumno que va a ser registrado
     */
    public void registrar(Alumno alumno) {
        int costo = this.getPrecio();

        if (alumno.getDinero() < costo) {
            System.out.println(msj.faltaDeFondos(alumno, this));
            return;
        }

        listaAlumnos.add(alumno);
        alumno.setDinero(alumno.getDinero() - this.getPrecio());
        alumno.incribirCurso(this);

        System.out.println(msj.saludo(alumno,this));
        System.out.println(msj.dineroRestante(alumno, this));
    }

    /**
     * Metodo que elimina a un alumno del curso eliminandolo de la lista de alumnos 
     * @param alumno de tipo alumno que se va a eliminar
     */
	public void remover(Alumno alumno){
        listaAlumnos.remove(alumno);
        System.out.println(msj.despedida(alumno));
    }

    /**
     * Metodo que notifica a todos los estudiantes el nuevo mensaje del curso 
     * recorre la lista y llama al metodo actualizar para cada alumno en la lista para que se imprima
     */
	public void notificar(){
        if(listaAlumnos.size() > 0){
			for(Alumno alumno : listaAlumnos){
				// alumno.actualizar();
                alumno.añadirNotificación(mensaje);
			}
		}
    }

    // @Override

    /**
     * Metodo que cambia la modalidad que maneja el curso 
     * @param numero con un valor del 1 al 3 dependiendo la modalidad nueva 
     * 1 = teorico
     * 2 = practico
     * 3 = visual
     */
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
     * Metodo que obtiene el precio del curso de java dependiento de la dificultad 
     * @return un entero con valor al precio del curso 
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
     * Metodo que cobra al alumno le resta al alumno dinero por el pago del curso 
     * recorre la lista de alumnos del curso y les cobra a todos, en caso de que el alumno no tenga dinero para pagar
     * el curso este lo elimina del curso, en caso de que si tenga dinero solo le resta dinero al alumno e
     * imrpime en pantalla cuanto dinero le queda
     */
    public void cobrar() {
        for (Alumno alumno : listaAlumnos) {
            if (this.getPrecio() > alumno.getDinero()) {
                System.out.println(msj.faltaDeFondos(alumno, this));
                remover(alumno);
            } else {
                alumno.setDinero(alumno.getDinero() - this.getPrecio());    
                System.out.println(msj.dineroRestante(alumno,this));
            }
        }
    }
}