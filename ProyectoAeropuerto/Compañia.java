
package ProyectoAeropuerto;

/**
 * Clase Compañía
 * @author Gustavo
 */
public class Compañia {
    
    // ATRIBUTOS
    private String nombre;
    private Vuelo[] vuelos;
    
    // MÉTODOS
    
    
    /**
     * Método Constructor de Compañias
     * @param nomb el nombre de la companía
     * @param ind_vuelos la cantidad de vuelos que opera
     */
    public Compañia(String nomb, int ind_vuelos) {
        this.nombre = nomb;
        this.vuelos = new Vuelo[ind_vuelos];
    }
    
    /**
     * Método para crear un vuelo de una compañía
     * @param index Índice del array de vuelo de la compañía
     * @param id Identificador del vuelo
     * @param ciudad_or Ciudad de origen del vuelo
     * @param ciudad_dest Ciudad de destino del vuelo
     * @param precio Precio del vuelo
     * @param max_pasajeros Cantidad máxima de pasajeros
     * @param real_pasajeros Cantidad real de pasajeros
     */
    public void setVuelos(int index, String id, String ciudad_or, String ciudad_dest, double precio, int max_pasajeros, int real_pasajeros){
        vuelos[index] = new Vuelo(id,ciudad_or,ciudad_dest,precio,max_pasajeros,real_pasajeros);
           
    }
    
      
    /**
     * Devuelve el nombre de la compañía
     * @return string
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el objeto vuelos de la compañía
     * @return string
     */
    public Vuelo[] getVuelos() {
        return vuelos;
    }
    
    /**
     * Devuelve el vuelo elegido de la compañía
     * @param index Índice de vuelo requerido
     * @return String
     */
    public Vuelo getVuelo(int index) {
        return vuelos[index];
    }
}
