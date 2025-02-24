/**
 * Interfaz que define el comportamiento de un observador en el patrón de diseño "Observer".
 */
public interface Observador{

	/**
     * Método que se invoca cuando el sujeto observado cambia su estado
     * o realiza una acción que debe ser comunicada a los observadores.
     */
	public void actualizar();
}