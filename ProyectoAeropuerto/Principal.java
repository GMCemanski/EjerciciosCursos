
package ProyectoAeropuerto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Proyecto Aeropuerto - POO
 * Actividad de integración de conceptos. No incluye Tratamiento de excepciones, interfaz gráfica, archivos y base de datos.
 * CONSIGNA: Diseñar y codificar una app informática para una compañía de gestión aeroportuaria.
 * - Para cada aeropuerto se debe conocer: Todas las compañías de vuelos que operan en él, el bnombre, la ciudad donde se ubica y el país al que pertenece.
 * - Cada compañía se caracteriza por el nombre y la lista de vuelos que ofrece.
 * - Los vuelos están definidos por su identificador, la ciudad de origen, la ciudad de destino, el precio del viaje, la lista de pasajeros, el número máximo
 * de pasajeros permitidos en el vuelo y el número real de pasajeros que ha reservado asiento en el avión.
 * - Los aeropuertos pueden ser privados o públicos
 *      - Los privados tienen una serie de empresas patrocinadoras y se debe saber el nombre de cada una.
 *      - Los públicos recibne dinero de subvención gubernamental y se requiere saber cuánto.
 * - Se necesita gestionar la información de los pasajeros.
 *      -Para cada pasajero se requiere nombre, número de pasaporte y nacionalidad.
 * 
 * Menú requerido:
 * 1) Consultar los aeropuertos gestionados, indicando separadamente los públicos y privados. PAra cada uno mostrar nombre, ciudad de ubicación y país.
 * 2) Visualizar según corresponda la subvención gubernamental o los patrocinadores del aeropuerto elegido.
 * 3) Para un determinado aeropuerto mostrar la lista de compañías que vuelan desde el mismo.
 * 4) Para una determinada compañía que opera en un aeropuerto concreto listar todos los vuelos posibles que ofrece, mostrando ID, ciudad de origen y destino
 * y el precio del vuelo.
 * 5) Mostrar todos los vueltos (id) que parte de una ciudad origen a otra destino (indicadas por el usuario) y mostrar el precio.
 * CARGA DE DATOS: Se realiza por código no por consola.
 * @author Gustavo
 */
public class Principal {
    
    // Atributos
    Scanner entrada = new Scanner(System.in);
    
    ArrayList<aPublico> aeropuertos_pub;
    ArrayList<aPrivado> aeropuertos_priv;
    int opc=0;
    int opc2=0;
    
    /**
     * Método principal
     */
     
    public static void main(String[]args){
        Principal principio = new Principal();
       
        principio.run(args);
        
        
    }
    
    /**
     * Método Constructor
     */
    public Principal() {
        this.aeropuertos_pub = new ArrayList<>();
        this.aeropuertos_priv = new ArrayList<>();
        this.opc=0;
        this.opc2=0;
    }
    
    /**
     * Método donde corre la carga de datos y el menú
     * 
     */
    public void run(String[]args){
              
        // CARGA DE DATOS POR SISTEMA
        
        // Aeropuerto Privado
        
        aeropuertos_priv.add(new aPrivado("Aeropuerto Internacional Ezeiza","Ezeiza","Argentina",3,2)); 
        aeropuertos_priv.get(0).setPatrocinadores(0, "Cherubito Loreans");
        aeropuertos_priv.get(0).setPatrocinadores(1, "Querubín");
        aeropuertos_priv.get(0).setPatrocinadores(2, "El Gran Policía");
        
        // Compañía 1
        aeropuertos_priv.get(0).setCompania(0, "Culé Airline", 2);
        

        aeropuertos_priv.get(0).getCompañia(0).setVuelos(0, "CA01", "Ezeiza", "Bariloche", 100.5, 30, 3);
        aeropuertos_priv.get(0).getCompañia(0).getVuelo(0).setPasajeros(0, "Cosme Fulanito", "31KA16", "Argentino");
        aeropuertos_priv.get(0).getCompañia(0).getVuelo(0).setPasajeros(1, "Humberto Trapito", "145KL2", "Argentino");
        aeropuertos_priv.get(0).getCompañia(0).getVuelo(0).setPasajeros(2, "Ramiro Cosinovich", "SA14245", "Boliviano");
        
        aeropuertos_priv.get(0).getCompañia(0).setVuelos(1, "CA14", "Ezeiza", "Madrid", 230, 25, 1);
        aeropuertos_priv.get(0).getCompañia(0).getVuelo(1).setPasajeros(0, "Jaime Casimiro", "9512LMS", "Ecuatoriano");
        
             
        
        // Compañía 2
        aeropuertos_priv.get(0).setCompania(1, "Corporativo SA", 1);
        
        aeropuertos_priv.get(0).getCompañia(1).setVuelos(0, "14TRSA", "Ezeiza", "Guadalajara", 130.8, 20, 4);
        aeropuertos_priv.get(0).getCompañia(1).getVuelo(0).setPasajeros(0, "Jacinto Bonavena", "321FARC", "Colombiano");
        aeropuertos_priv.get(0).getCompañia(1).getVuelo(0).setPasajeros(1, "Ramiro Funes Mortis", "NO9GJE12", "Argentino");
        aeropuertos_priv.get(0).getCompañia(1).getVuelo(0).setPasajeros(2, "Ariel Pami", "6512AL", "Mexicano");
        aeropuertos_priv.get(0).getCompañia(1).getVuelo(0).setPasajeros(3, "Dagoberto Troncio", "99999", "Peruano");
       
        // Aeropuerto Privado 2
        
        aeropuertos_priv.add(new aPrivado("El Palomar","Palomar","Argentina",1,1)); 
        aeropuertos_priv.get(1).setPatrocinadores(0, "Manaos");
        
        // Compañía 1
        aeropuertos_priv.get(1).setCompania(0, "Maicrin-Kt", 3);
        

        aeropuertos_priv.get(1).getCompañia(0).setVuelos(0, "MM05", "Palomar", "Tierra del Fuego", 40.2, 20, 4);
        aeropuertos_priv.get(1).getCompañia(0).getVuelo(0).setPasajeros(0, "Tramberto Bolaños", "KAS1216", "Paraguayo");
        aeropuertos_priv.get(1).getCompañia(0).getVuelo(0).setPasajeros(1, "Dario Roca", "NAS12s4", "Argentino");
        aeropuertos_priv.get(1).getCompañia(0).getVuelo(0).setPasajeros(2, "Juan Ortega", "412341JA", "Paraguayo");
        aeropuertos_priv.get(1).getCompañia(0).getVuelo(0).setPasajeros(3, "Camilo Sinfuentes", "QW123412", "Boliviano");
        
        aeropuertos_priv.get(1).getCompañia(0).setVuelos(1, "MM10", "Palomar", "Salta", 25.2, 20, 3);
        aeropuertos_priv.get(1).getCompañia(0).getVuelo(1).setPasajeros(0, "Esteban Etchebarne", "OP10421", "Argentino");
        aeropuertos_priv.get(1).getCompañia(0).getVuelo(1).setPasajeros(1, "Agustín Drago", "KJ12513", "Colombiano");
        aeropuertos_priv.get(1).getCompañia(0).getVuelo(1).setPasajeros(2, "Pepito Trombo", "IU88111", "Peruano");
        
        aeropuertos_priv.get(1).getCompañia(0).setVuelos(2, "MM30", "Palomar", "Resistencia", 15.2, 15, 2);
        aeropuertos_priv.get(1).getCompañia(0).getVuelo(2).setPasajeros(0, "Facundo Stiusso", "OP10421", "Argentino");
        aeropuertos_priv.get(1).getCompañia(0).getVuelo(2).setPasajeros(1, "Alberto Milaño", "KJ12313", "Colombiano");
        
        // Aeropuerto publico 1
        
        aeropuertos_pub.add(new aPublico("Aerolíneas Argentinas", "Buenos Aires", "Argentina", 500000, 1));
        
        aeropuertos_pub.get(0).setCompania(0, "Pretric Noruegas", 2);
        
        aeropuertos_pub.get(0).getCompañia(0).setVuelos(0, "PN 20", "Buenos Aires", "Puerto Madryn", 100.8, 40, 2);
        aeropuertos_pub.get(0).getCompañia(0).getVuelo(0).setPasajeros(0, "Javier Fernillo", "1294AL", "Argentino");
        aeropuertos_pub.get(0).getCompañia(0).getVuelo(0).setPasajeros(1, "Dante Parlante", "N782S4", "Argentino");
        
        aeropuertos_pub.get(0).getCompañia(0).setVuelos(1, "PN 1000", "Buenos Aires", "Formosa", 150.1, 30, 3);
        aeropuertos_pub.get(0).getCompañia(0).getVuelo(1).setPasajeros(0, "Pedro Diaz De Vivar", "8512JK", "Argentino");
        aeropuertos_pub.get(0).getCompañia(0).getVuelo(1).setPasajeros(1, "Yamiel Rodriguez", "ÑL98213", "Paraguayo");
        aeropuertos_pub.get(0).getCompañia(0).getVuelo(1).setPasajeros(2, "Ismael Jusbito", "OI65012", "Venezolano");
        
            
        
    System.out.println("***SISTEMA DE GESTIÓN AEROPORTUARIA***");
    /**
     * Menú de consulta
     * 1. Consultar Aeropuertos
     * 2. Visualización de patrocinadores/subvenciones gubernamentales
     * 3. Consulta de compañías de un aeropuerto
     * 4. Vuelos de una compañía
     * 5. Consulta de vuelos a ciudades y el precio.
     * 6. Salir
     */
    do{
        System.out.println("");
        System.out.println("MENÚ DEL SISTEMA DE GESTIÓN AEROPORTUARIA"); 
        System.out.print(" 1. Consultar aeropuerto \n 2. Patrocinadores/subvención gubernamental del aeropuerto \n 3. Compañías de un aeropuerto \n 4. Vuelos de compañía \n 5. Consulta de viaje desde ciudad a otra y precio \n 6. Salir \nOpción elegida: ");
        opc = entrada.nextInt();
        System.out.println("");
        
        switch(opc){
            case 1 -> consultarAeropuerto();
            case 2 -> visualizarPatSub();
            case 3 -> compañíasAeropuerto();
            case 4 -> vuelosCompañia();
            case 5 -> consultaCiudadesPrecio();
            case 6 -> {}
            default -> System.out.println("Ingresa una opción correcta");

        }
    }while(opc!=6);
    
    
    }
        
    
    
    /**
     * Método para ver subvenciones/patrocinadores
     */
    public void visualizarPatSub(){
        System.out.println("");
                System.out.print("Eliga qué listado de aeropuertos desea seleccionar \n1. Privado \n2. Público ");
                do{
                System.out.print("\nOpción:");
                opc2=entrada.nextInt();
                System.out.println("");
                }while(opc2!=1&&opc2!=2);
                switch(opc2){
                    case 1: int opc3=0;
                            for(int j=0;j<aeropuertos_priv.size();j++){
                            System.out.println((j+1)+". "+aeropuertos_priv.get(j).getNombre());
                            }
                            do{
                            System.out.print("Opción elegida: ");
                            opc3=entrada.nextInt();
                            }while(opc3>aeropuertos_priv.size()||opc3<=0);
                            System.out.println("Los patrocinadores del aeropuerto "+aeropuertos_priv.get(opc3-1).getNombre()+" son:");
                            System.out.println(aeropuertos_priv.get(opc3-1).getAllPatrocinadores());
                            System.out.println("");
                            break;
                    case 2: int opc4=0;
                            for(int j=0;j<aeropuertos_pub.size();j++){
                                System.out.println((j+1)+". "+aeropuertos_pub.get(j).getNombre());
                                }
                            do{System.out.print("Opción elegida: ");
                            opc4=entrada.nextInt();
                            }while(opc4>aeropuertos_pub.size()||opc4<=0);
                            System.out.print("La subvención del gobierno del aeropuerto "+aeropuertos_pub.get(opc4-1).getNombre()+" es:"+aeropuertos_pub.get(opc4-1).getSubv_gob()+" dólares.");
                            System.out.println("");
                            break;
                    default: System.out.println("Opción incorrecta");        
                }
        opc2=0;
                
}
    
    /**
     * Método para consultar nombre, ciudad y país del aeropuerto elegido
     */      
    public void consultarAeropuerto(){
        System.out.println("");
        do{
        System.out.print("1. Aeropuertos Públicos \n2. Aeropuertos Privados\nOpción: ");
        opc2 = entrada.nextInt();
        } while(opc2!=1&&opc2!=2);
        if (opc2==1){
            System.out.println("");
            System.out.println("Aeropuertos públicos");
            for (int i=0;i<aeropuertos_pub.size();i++){
                if (aeropuertos_pub.get(i) instanceof aPublico){
                    System.out.println("");
                    System.out.println((i+1)+") Nombre: "+aeropuertos_pub.get(i).getNombre());
                    System.out.println("   Ciudad: "+aeropuertos_pub.get(i).getCiudad_or());
                    System.out.println("   País: "+aeropuertos_pub.get(i).getPais_or());
                    System.out.println("");
                            
                }   
            }
        }
        if (opc2==2){
            System.out.println("");
            System.out.println("Aeropuertos privados");
            for (int i=0;i<aeropuertos_priv.size();i++){
                if (aeropuertos_priv.get(i) instanceof aPrivado){
                    System.out.println("");
                    System.out.println("   Nombre: "+aeropuertos_priv.get(i).getNombre());
                    System.out.println("   Ciudad: "+aeropuertos_priv.get(i).getCiudad_or());
                    System.out.println("   País de origen: "+aeropuertos_priv.get(i).getPais_or());
                    System.out.println("");
                }   
            }                    
        }
        opc2=0;
        
    }
    
    /**
     * Método de consulta de compañías del aeropuerto elegido
     */
    public void compañíasAeropuerto(){
        System.out.println("Consulta de compañías");
        System.out.println("");
        for (int i=0;i<aeropuertos_pub.size();i++){
            System.out.println((i+1)+") "+aeropuertos_pub.get(i).getNombre());
        }
        for (int i=0;i<aeropuertos_priv.size();i++){
            System.out.println(aeropuertos_pub.size()+(i+1)+") "+aeropuertos_priv.get(i).getNombre());
        }
        System.out.println("");
        do{
        System.out.print("Opción: ");
        opc2=entrada.nextInt();
        }while(opc2>(aeropuertos_priv.size()+aeropuertos_pub.size())||opc2<=0);
        System.out.println("");
        if (opc2<=aeropuertos_pub.size()){
            System.out.println(aeropuertos_pub.get(opc2-1).getAllCompañias());
        }
        else{
            System.out.println(aeropuertos_priv.get(opc2-1-aeropuertos_pub.size()).getAllCompañias());
        }
        System.out.println("");
            
        opc2=0;                   
        }
    
    /**
     * Método de consulta de los vuelos de la compañía elegida
     */
    public void vuelosCompañia(){
        int aer;
        int comp;
        // Se muestran primero los aeropuertos públicos y luego los privados.
        for (int i=0;i<aeropuertos_pub.size();i++){
            System.out.println((i+1)+") "+aeropuertos_pub.get(i).getNombre());
        }
        for (int i=0;i<aeropuertos_priv.size();i++){
            System.out.println(aeropuertos_pub.size()+(i+1)+") "+aeropuertos_priv.get(i).getNombre());
        }
        do{
        System.out.print("Opción: ");
        aer=entrada.nextInt()-1; // Al número ingresado se le resta 1 para que se corresponda al index de los array
        }while((aer+1)>(aeropuertos_pub.size()+aeropuertos_priv.size())||(aer+1)<=0);
        
        // para los números que se corresponden a aero puertos públicos
        if (aer<aeropuertos_pub.size()){
//          
            System.out.println(aeropuertos_pub.get(aer).getAllCompañias());
        do{
            System.out.print("Opción: ");
            comp=entrada.nextInt()-1;
        }while(comp+1>aeropuertos_pub.get(aer).getCompañiaLength()||(comp+1)<0);    
            for(int i=0;i<aeropuertos_pub.get(aer).compañias[comp].getVuelos().length;i++){
                System.out.println((i+1)+") Id: "+aeropuertos_pub.get(aer).getCompañia(comp).getVuelo(i).getId()+".");
                System.out.println("  Ciudad de origen: "+aeropuertos_pub.get(aer).getCompañia(comp).getVuelo(i).getCiudad_or()+".");
                System.out.println("  Ciudad de Destino: "+aeropuertos_pub.get(aer).getCompañia(comp).getVuelo(i).getCiudad_dest()+".");
                System.out.println("  Precio: "+aeropuertos_pub.get(aer).getCompañia(comp).getVuelo(i).getPrecio()+" dólares.");
                System.out.println("");
            }
            
            
        }
        // el caso de aeropuertos privados
        else{
            aer-=aeropuertos_pub.size(); // resto el size del aeropuerto público para dar con el index correcto del privado
            System.out.println(aeropuertos_priv.get(aer).getAllCompañias());
            do{
            System.out.print("Opción: ");
            comp=entrada.nextInt()-1; // 
            }while((comp+1)>aeropuertos_priv.get(aer).getCompañiaLength()||(comp+1)<=0);
            for(int i=0;i<aeropuertos_priv.get(aer).compañias[comp].getVuelos().length;i++){
                System.out.println((i+1)+") Id:"+aeropuertos_priv.get(aer).getCompañia(comp).getVuelo(i).getId()+".");
                System.out.println("  Ciudad de origen: "+aeropuertos_priv.get(aer).getCompañia(comp).getVuelo(i).getCiudad_or()+".");
                System.out.println("  Ciudad de Destino: "+aeropuertos_priv.get(aer).getCompañia(comp).getVuelo(i).getCiudad_dest()+".");
                System.out.println("  Precio: "+aeropuertos_priv.get(aer).getCompañia(comp).getVuelo(i).getPrecio()+" dólares.");
                System.out.println("");
             }
            System.out.println("");   
        }


    }
    
    /**
     * Método para consultar por viajes ingresando ciudad de origen y destino.
     * Arroja aeropuerto, id y precio.
     */
    public void consultaCiudadesPrecio(){
        
        String ciudad_or, ciudad_dest;
        entrada.nextLine();
        System.out.print("Ingrese la ciudad de origen del viaje: ");
        ciudad_or=entrada.nextLine();
        System.out.print("Ingrese la ciudad de destino del viaje: ");
        ciudad_dest=entrada.nextLine();
        int iterador=1;
        
        // I = Checkea el nro de aeropuerto -- J = Checkea número de compañía -- K = checkea nro de vuelo
        for(int i=0;i<aeropuertos_pub.size();i++){ 
            for (int j=0;j<aeropuertos_pub.get(i).compañias.length;j++){
                for(int k=0;k<aeropuertos_pub.get(i).getCompañia(j).getVuelos().length;k++){
                    if(aeropuertos_pub.get(i).getCompañia(j).getVuelo(k).getCiudad_or().equalsIgnoreCase(ciudad_or)&&aeropuertos_pub.get(i).getCompañia(j).getVuelo(k).getCiudad_dest().equalsIgnoreCase(ciudad_dest)){
                        System.out.println("");
                        System.out.println("OPCIÓN "+iterador);
                        System.out.println("Aeropuerto: "+aeropuertos_pub.get(i).getNombre()+".");
                        System.out.println("Identificador: "+aeropuertos_pub.get(i).getCompañia(j).getVuelo(k).getId()+".");
                        System.out.println("Precio: "+aeropuertos_pub.get(i).getCompañia(j).getVuelo(k).getPrecio()+" dólares.");
                        iterador++;
                    }
                }
            }
        }
        for(int i=0;i<aeropuertos_priv.size();i++){ 
            for (int j=0;j<aeropuertos_priv.get(i).compañias.length;j++){
                for(int k=0;k<aeropuertos_priv.get(i).getCompañia(j).getVuelos().length;k++){
                    if(aeropuertos_priv.get(i).getCompañia(j).getVuelo(k).getCiudad_or().equalsIgnoreCase(ciudad_or)&&aeropuertos_priv.get(i).getCompañia(j).getVuelo(k).getCiudad_dest().equalsIgnoreCase(ciudad_dest)){
                        System.out.println("");
                        System.out.println("OPCIÓN "+iterador);
                        System.out.println("Aeropuerto: "+aeropuertos_priv.get(i).getNombre()+".");
                        System.out.println("Identificador: "+aeropuertos_priv.get(i).getCompañia(j).getVuelo(k).getId()+".");
                        System.out.println("Precio: "+aeropuertos_priv.get(i).getCompañia(j).getVuelo(k).getPrecio()+" dólares.");
                        iterador++;
                    }
                }
            }
        }        
        
    }
}
    

    
    

