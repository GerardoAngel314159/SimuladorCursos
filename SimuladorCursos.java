import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimuladorCursos{
    public static void main(String[] args) {
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


    }
}