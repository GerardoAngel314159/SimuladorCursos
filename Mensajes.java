public class Mensajes{

    public String saludo (Alumno alumno){
        return ("Bienvenido al curso " + alumno.getNombre());
    }

    public String despedida (Alumno alumno){
        return (alumno.getNombre() + " ha sido removido del curso");
    }

    public String graduacion (Alumno alumno){
        return "FELICIDADES, " + alumno.getNombre() + " ha sido removido del curso";
    }

    public String faltaDeFondos (Alumno alumno, Curso curso){
        return ("Infortunadamente, " + alumno.getNombre() + " ha sido removido del curso "
            curso.getNombre() + " por falta de fondos");
    }
    
    public String dineroRestante(Alumno alumno){
        return ("Gracias por su pago " + alumno.getNombre() + ". Su saldo restante es de: $"
            alumno.getDinero());
    }

    public String cambioModalidad(Curso curso){
        return ("la modalidad de " + curso.getNombre() + " ha cambiado a" + curso.getModalidad());
    }
}