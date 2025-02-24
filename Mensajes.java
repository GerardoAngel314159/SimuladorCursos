/**
 * La clase {@code Mensajes} proporciona metodos para generar distintos mensajes 
 * relacionados con la interacción de un alumno en un curso.
 */
public class Mensajes{

    /**
     * Genera un mensaje de bienvenida para un alumno en un curso.
     *
     * @param alumno alumno que se inscribe en el curso
     * @param curso el curso al que se inscribe el alumno
     * @return un mensaje de bienvenida
     */
    public String saludo (Alumno alumno, Curso curso){
        return ("Bienvenido al curso " + curso.getNombre() + ", " + alumno.getNombre());
    }

    /**
     * Genera un mensaje de despedida cuando un alumno es sacado del curso.
     *
     * @param alumno el alumno que es sacado
     * @return un mensaje indicando que el alumno ha sido sacado del curso
     */
    public String despedida (Alumno alumno){
        return (alumno.getNombre() + " ha sido removido del curso");
    }

    /**
     * Genera un mensaje de felicitaciones cuando un alumno se gradua de un curso.
     *
     * @param alumno el alumno que se gradua
     * @param curso el curso del cual se gradua el alumno
     * @return un mensaje de felicitaciones personalizado
     */
    public String graduacion (Alumno alumno, Curso curso){
        return "FELICIDADES, " + alumno.getNombre() + " se ha graduado del curso " + curso.getNombre();
    }

    /**
     * Genera un mensaje cuando un alumno es removido de un curso por falta de fondos.
     *
     * @param alumno el alumno que es removido
     * @param curso el curso del cual es removido el alumno
     * @return un mensaje indicando la remoción por falta de fondos
     */
    public String faltaDeFondos (Alumno alumno, Curso curso){
        return ("Infortunadamente, " + alumno.getNombre() + " ha sido removido del curso "
            + curso.getNombre() + " por falta de fondos");
    }
    
    /**
     * Genera un mensaje informando sobre el dinero restante de un alumno tras pagar un curso.
     *
     * @param alumno el alumno que realizo el pago
     * @param curso el curso que ha sido pagado
     * @return un mensaje indicando el dinero restante del alumno
     */
    public String dineroRestante(Alumno alumno, Curso curso){
        return ("El pago del curso " + curso.getNombre() + " ha sido completado. " + alumno.getNombre() + ", su saldo restante es de: $"
            + alumno.getDinero());
    }

    /**
     * Genera un mensaje notificando el cambio de modalidad de un curso.
     *
     * @param curso el curso cuya modalidad ha cambiado
     * @return un mensaje indicando la nueva modalidad del curso
     */
    public String cambioModalidad(Curso curso){
        return ("la modalidad de " + curso.getNombre() + " ha cambiado a" + curso.getModalidad());
    }

    /**
     * Genera un mensaje de inicio.
     *
     * @return un mensaje de bienvenida al sistema del Politécnico Nacional de Springfield
     */
    public String inicioSimulador(){
        return ("ENTRANDO AL SISTEMA DE EL POLITÉCNICO NACIONAL DE SPRIENGFIELD\n");
    }

    /**
     * Genera un mensaje de salida del sistema.
     *
     * @return un mensaje de despedida del sistema del Politécnico Nacional de Springfield
     */
    public String salidaSimulador(){
        return ("GRACIAS POR USAR EL SISTEMA DE EL POLITÉCNICO NACIONAL DE SPRIENGFIELD\n");
    }

}