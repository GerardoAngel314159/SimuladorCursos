import java.util.LinkedList;
import java.util.List;

public class SimuladorCursos{
    public static void main(String[] args) {
        Mensajes msj = new Mensajes();

        List<Curso> listaCursos = new LinkedList<Curso>();
        List<Alumno> listaAlumnos = new LinkedList<Alumno>();
        
        Curso cursoJava1 = new CursoJava("Curso Java Avanzado ", 3, 3);
        Curso cursoCanto1 = new CursoCanto("Curso Canto Avanzado", 3, 3);
        Curso cursoEcuDif1 = new CursoEcuDif("Curso Ecuaciones Diferenciales Avanzado", 3, 3);

        listaCursos.add(cursoEcuDif1);
        listaCursos.add(cursoCanto1);
        listaCursos.add(cursoJava1);

        Alumno omar,sara, maria;
        omar = new Alumno("Omar", 5000);
        sara = new Alumno("Sara", 10000);
        maria = new Alumno("Maria", 4500);

        listaAlumnos.add(maria);
        listaAlumnos.add(omar);
        listaAlumnos.add(sara);

        System.out.println(msj.inicioSimulador());

        cursoCanto1.registrar(omar);
        cursoEcuDif1.registrar(omar);
        cursoJava1.registrar(omar);
        cursoJava1.registrar(maria);
        cursoEcuDif1.registrar(sara);

        ciclo(12, 1, listaCursos, listaAlumnos);
        
        System.out.println("\n" + msj.salidaSimulador());


    }

    public static void ciclo(int meses, int mesPrimero, List<Curso> listaCursos, List<Alumno> alumnos) {
        for (int i = 0; i < meses; i++){
            System.out.println("\nBienvenidos al mes " + (i + mesPrimero));
            for (Curso curso : listaCursos){
                curso.setMensaje("Pasaste el mes " + (i+mesPrimero));
                // System.out.println(curso.getMensaje());
                // curso.notificar();
            }

            for(Alumno alumno : alumnos){
                alumno.actualizar();
            }

        }
    }
}

