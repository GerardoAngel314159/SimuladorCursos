public class Mensajes{

    public String saludo (Alumno alumno, Curso curso){
        return ("Bienvenido al curso " + curso.getNombre() + ", " + alumno.getNombre());
    }

    public String despedida (Alumno alumno){
        return (alumno.getNombre() + " ha sido removido del curso");
    }

    public String graduacion (Alumno alumno, Curso curso){
        return "FELICIDADES, " + alumno.getNombre() + " se ha graduado del curso " + curso.getNombre();
    }

    public String faltaDeFondos (Alumno alumno, Curso curso){
        return ("Infortunadamente, " + alumno.getNombre() + " ha sido removido del curso "
            + curso.getNombre() + " por falta de fondos");
    }
    
    public String dineroRestante(Alumno alumno, Curso curso){
        return ("El pago del curso " + curso.getNombre() + " ha sido completado. " + alumno.getNombre() + ", su saldo restante es de: $"
            + alumno.getDinero());
    }

    public String cambioModalidad(Curso curso){
        return ("la modalidad de " + curso.getNombre() + " ha cambiado a" + curso.getModalidad());
    }

    public String inicioSimulador(){
        return ("ENTRANDO AL SISTEMA DE EL POLITÉCNICO NACIONAL DE SPRIENGFIELD\n");
    }

    public String salidaSimulador(){
        return ("GRACIAS POR USAR EL SISTEMA DE EL POLITÉCNICO NACIONAL DE SPRIENGFIELD\n");
    }

}