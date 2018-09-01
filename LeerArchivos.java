import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *Clase que lee archivos y se queda con las características de cada  
 *casilla y/o representante.
 *@author: García Landa Valeria
 *------- Rebollar Pérez Ailyn
 *------- Reyer Granados Naomi Itzel
 *@version: 1.0
 */


public class LeerArchivos{
    // Lista de casillas de acuerdo a nuestro archivo .csv
    private static ArrayList<Casilla> casillas;
    // Lista de representantes de acuerdo a nuestro archivo .csv
    private static ArrayList<Representante> representantes;
    
    public LeerArchivos(){
	this.casillas = new ArrayList<Casilla>();
	this.representantes = new ArrayList<Representante>();
    }
    
    /** Define la lista de casillas de nuestro archivo .csv 
     */
    public void setCasillas(ArrayList<Casilla> casillas){
	this.casillas = casillas;
    }
    
    /** Regresa la lista de casillas de nuestro archivo .csv
     * @return la lista de casillas de nuestro archivo .csv
     */
    public ArrayList<Casilla> getCasillas(){
	return this.casillas;
    }
    
    /** Define la lista de representantes preliminares
     * de nuestro archivo .csv 
     */
    public void setRepresentantes(ArrayList<Representante> representantes){
    	this.representantes = representantes;
    }
    
    /** Regresa la lista de representantes de nuestro archivo .csv
     * @return la lista de representantes de nuestro archivo .csv
     */
    public ArrayList<Representante> getRepresentantes(){
	return this.representantes;
    }
    
    /**
     * Realiza lectura del archivo Casillas.csv y vamos creando de
     * acuerdo al archivo una lista de casillas para el programa. 
     */
    public static void leeArchivoC(String archivo) throws FileNotFoundException, IOException{
	String cadena;
	FileReader f = new FileReader(archivo);
	BufferedReader b = new BufferedReader(f);
	while((cadena = b.readLine()) != null){
	    String[] a = separa(cadena);
	    Casilla casilla = new Casilla(a, contador);
	    casillas.add(casilla);
	    contador++;
	}
	b.close();
    }
    
    /**
     * Realiza lectura del archivo Representantes.csv y vamos
     * creando una lista de representantes para el programa. 
     */
    public static void leeArchivoR(String archivo) throws FileNotFoundException, IOException{
	String cadena;
	FileReader f = new FileReader(archivo);
	BufferedReader b = new BufferedReader(f);
	while((cadena = b.readLine()) != null){
	    String[] a = separa(cadena);
	    int indice = casillas.indexOf(a[4]);
	    if(indice != -1){
		Representante r = new Representante(a, casillas.get(indice));
		casillas.add(casilla);
	    }else{
		System.out.println("La casilla a la que se quiere agregar
                                      el representante no es válida")
		    }
	}
	b.close();
    }
    

    /**
     * Separamos los atributos de cada registro que puede ser
     * un representante o casilla.
     * @return un arreglo con los atributos separados.
     */ 
    private static String[] separa(String cadena){
	return cadena.split(",");
    }

    /** Ejecuta el programa
     */
    public static void main(String[] args) throws IOException{
	LeerArchivos l = new LeerArchivos();
        leeArchivoC("casilla.csv");
	
      
    }
}


