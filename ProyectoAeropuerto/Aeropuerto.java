
package ProyectoAeropuerto;

/**
 * Superclase Aeropuerto
 * @Gustavo
 */
public class Aeropuerto {
    // ATRIBUTOS
    
    String nombre;
    String ciudad_or;
    String pais_or;
    Compañia[] compañias;
    
    // MÉTODOS

    /**
     * Nombre del aeropuerto
     * @return string
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve la ciudad de origen del aeropuerto
     * @return string
     */
    public String getCiudad_or() {
        return ciudad_or;
    }
    
    /**
     * Devuelve el país de origen del aeropuerto
     * @return string
     */
    public String getPais_or() {
        return pais_or;
    }
    
    
}
