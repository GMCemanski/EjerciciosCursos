
package ProyectoAeropuerto;



/**
 *  Clase vuelo.
 * @Gustavo
 */
public class Vuelo {
    
    // ATRIBUTOS
    private String id;
    private String ciudad_or,ciudad_dest;
    private double precio;
    private Pasajero[] pasajeros;
    private int max_pasajeros;
    private int real_pasajeros;        
    
    
    // MÉTODOS
    
    
    // Constructor
    /**
     * Constructor de Vuelos
     * @param id número de identificación
     * @param ciudad_or ciudad de origen del vuelo
     * @param ciudad_dest ciudad del destino del vuelo
     * @param precio precio del vuelo
     * @param max_pasajeros cantidad máxima de pasajeros para el vuelo
     * @param real_pasajeros cantidad de pasajeros abonados
     */
    public Vuelo(String id, String ciudad_or, String ciudad_dest, double precio, int max_pasajeros, int real_pasajeros) {
        this.id = id;
        this.ciudad_or = ciudad_or;
        this.ciudad_dest = ciudad_dest;
        this.precio = precio;
        this.max_pasajeros = max_pasajeros;
        this.real_pasajeros = real_pasajeros;
        this.pasajeros = new Pasajero[max_pasajeros];
    }
    
    
    /**
     * Se ingresa un pasajero
     * @param index Índice en el array de pasajeros a llenar
     * @param nombre Nombre del pasajero
     * @param pasaporte Pasaporte del pasajero
     * @param nac Nacionalidad del Pasajero
     */
    public void setPasajeros(int index, String nombre, String pasaporte, String nac){
        this.pasajeros[index]= new Pasajero(nombre,pasaporte,nac) ;
        
    }

    
    // GETTERS
    
    /**
     * Id del vuelo
     * @return String
     */
    public String getId() {
        return id;
    }
    
    /**
     * Obtiene la ciudad de origen del vuelo
     * @return String
     */
    public String getCiudad_or() {
        return ciudad_or;
    }
    
    /**
     * Obtiene la ciudad de destino del vuelo
     * @return String
     */
    public String getCiudad_dest() {
        return ciudad_dest;
    }

    /**
     * Obtiene el precio del vuelo
     * @return double
     */
    public double getPrecio() {
        return precio;
    }
    
        
/**
 * getPasajeros
 * Muestra en consola los pasajeros del vuelo
 */        
    public void getPasajeros() {
        System.out.println("Pasajeros del vuelo: ");
        for(int i=0;i<pasajeros.length;i++){
                System.out.println((i+1)+". "+pasajeros[i].getNombre()+" de nacionalidad "+pasajeros[i].getNac()+". Nro de pasaporte: "+pasajeros[i].getPasaporte()+".");
        }
    }
    

/**
 * Devuelve el máximo de pasajeros admitido en el vuelo
 * @return 
 */
    public int getMax_pasajeros() {
        return max_pasajeros;
    }
/**
 * Devuelve la cantidad de pasajeros asignados al vuelo
 * @return 
 */
    public int getReal_pasajeros() {
        return real_pasajeros;
    }
    
}
