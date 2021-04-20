package ProyectoAeropuerto;

/**
*  Clase hija de Aeropuerto de  tipo publico.
 * @Gustavo
 */
public class aPublico extends Aeropuerto {
    // ATRIBUTOS    
    private double subv_gob;
    
   // MÉTODOS
     
   
   /**
    * Método Constructor de aeropuertos privados 
    * @param nombre nombre del aeropuerto
    * @param ciudad_or ciudad de origen
    * @param pais_or país de origen
    * @param subv_gob monto de subvencion gubernamental
    * @param compañias cantidad de compañías que operan
    */
   public aPublico(String nombre, String ciudad_or, String pais_or, double subv_gob, int compañias) {
        this.nombre = nombre;
        this.ciudad_or = ciudad_or;
        this.pais_or = pais_or;
        this.subv_gob = subv_gob;
        this.compañias = new Compañia[compañias];
    }
    
   
    // SETTERS
   /**
    * Método para ingresar una compañía
    * @param index índice del array compañía del aeropuerto 
    * @param nomb nombre de la compañía
    * @param ind_vuelos cantidad de vuelos de la compañía
    */
    public void setCompania(int index, String nomb, int ind_vuelos){
        this.compañias[index] = new Compañia(nomb,ind_vuelos);
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
     * Devuelve la subvención destinada al aeropuerto
     * @return 
     */
    public double getSubv_gob(){
        return subv_gob;
    }
    

    
    /**
     * Devuelve la cantidad de compañías del aeropuerto
     * @return 
     */
    public int getCompañiaLength(){
        int length = this.compañias.length;
        return length;
    }
    
    /**
     * Devuelve la compañía solicitada
     * @param indice el índice del array de compañias
     * @return devuelve el objeto compañía
     */
    public Compañia getCompañia(int indice) {
        return compañias[indice];
    }
    

    /**
     * Devuelve el nombre de todas las compañías
     * @return devuelve un string 
     */
    public String getAllCompañias(){
        String mensaje="";
        for (int i=0;i<compañias.length;i++){
            mensaje = mensaje + ("Compañia Nº"+(i+1)+": "+compañias[i].getNombre()+".\n");
            
        }
        return mensaje;
    }
}
