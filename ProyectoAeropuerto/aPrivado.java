
package ProyectoAeropuerto;

/**
 *  Clase hija de Aeropuerto de  tipo privado.
 * @Gustavo
 */
public class aPrivado extends Aeropuerto{
    
    // ATRIBUTOS
    private String[] patrocinadores;

   // MÉTODOS
     
    /**
     * Constructor de aeropuerto privado
     * @param nombre
     * @param ciudad_or
     * @param pais_or
     * @param patro
     * @param compañia
     */
    public aPrivado(String nombre, String ciudad_or, String pais_or, int patro,int compañia) {
        this.nombre = nombre;
        this.ciudad_or = ciudad_or;
        this.pais_or = pais_or;
        this.patrocinadores = new String[patro];
        this.compañias = new Compañia[compañia];
    }
    
    
    //SETTERS
    
    
    /**
     * Método para ingresar compañías al aeropuerto
     * @param index Índice en el objeto compañías que se va a llenar
     * @param nomb Nombre de la compañía
     * @param ind_vuelos Cantidad de vuelos que opera
     */
    public void setCompania(int index, String nomb, int ind_vuelos){
        this.compañias[index] = new Compañia(nomb,ind_vuelos);
    }
    
      
    
    /**
     * Carga de Patrocinador
     * @param index Índice del array de patrocinadores a cargar
     * @param nombre Nombre del patrocinador
     */
    public void setPatrocinadores(int index, String nombre){
            this.patrocinadores[index]= nombre;
        
    }
    

    
    // Getters
    
    /**
     * Devuelve el nombre del aeropuerto
     * @return string
    */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la ciudad de origen del aeropuerto
     * @return string
    */
    @Override
    public String getCiudad_or() {
        return ciudad_or;
    }

    /**
     * Devuelve el país del aeropuerto
     * @return string
     */
    @Override
    public String getPais_or() {
        return pais_or;
    }
    
    /**
     * Devuelve la cantidad de compañías del aeropuerto
     * @return un int 
     */
    public int getCompañiaLength(){
        int length = this.compañias.length;
        return length;
    }
    
    /**
     * Devuelve 1 patrocinador específico
     * @param numero = número de patrocinador del 1 al max.
     * @return devuelve el nombre del patrocinador solicitado
     */
    public String getPatrocinador(int numero) {
        return patrocinadores[numero-1];
    }
    /**
     * Arroja en consola todos los patrocinadores 
     * @return string
     */
    public String getAllPatrocinadores(){
        String mensaje="\n";
        for (int i=0;i<patrocinadores.length;i++){
            mensaje = mensaje + ("Patrocinador Nº"+(i+1)+": "+patrocinadores[i]+".\n");
           
            
        }
        return mensaje;
    }
    
     /**
     * Devuelve el objeto compañía especificado
     * @param indice Índice en el array de compañías
     * @return Devuelve una compañía
     */
    public Compañia getCompañia(int indice) {
        return compañias[indice];
    }
    
    /**
     * Arroja el nombre de todas las compañías
     * @return 
     */
    public String getAllCompañias(){
        String mensaje="";
        for (int i=0;i<compañias.length;i++){
            mensaje = mensaje + ("Compañia Nº"+(i+1)+": "+compañias[i].getNombre()+".\n");
            
        }
        return mensaje;
    }
    
    

    

        
    
}
