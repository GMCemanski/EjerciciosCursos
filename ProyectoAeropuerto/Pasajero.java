package ProyectoAeropuerto;

/**
 * Clase Pasajero
 * @Gustavo
 */
public class Pasajero {
    private String nombre;
    private String pasaporte;
    private String nac;

    /**
     * Se ingresa los datos de un pasajero
     * @param nombre El nombre
     * @param pasaporte El número de pasaporte
     * @param nac La nacionalidad de la persona
     */
    public Pasajero(String nombre, String pasaporte, String nac) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nac = nac;
    }
    
    /**
     * Devuelve el nombre del pasajero
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve el pasaporte del pasajero
     * @return string
     */
    public String getPasaporte() {
        return pasaporte;
    }
    
    /**
     * Devuelve la nacionalidad del pasajero
     * @return String
     */
    public String getNac() {
        return nac;
    }
    
}
