import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimuladorCursos{
    public static void main(String[] args) {
        Mensajes msj = new Mensajes();

        List<Curso> listaCursos = new LinkedList<Curso>();
        
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

        System.out.println(msj.inicioSimulador());

        cursoCanto1.registrar(omar);
        cursoEcuDif1.registrar(omar);
        cursoJava1.registrar(omar);
        cursoJava1.registrar(maria);
        cursoEcuDif1.registrar(sara);

        // for(int i = 0, ){

        // }
        
        System.out.println("\n" + msj.salidaSimulador());


    }
}

