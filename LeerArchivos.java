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
    // private ArrayList<Representante> representantes;
    
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
    // public void setRepresentantes(ArrayList<Representante> representantes){
    //	this.representantes = representantes;
    // }
    
    /** Regresa la lista de representantes de nuestro archivo .csv
     * @return la lista de representantes de nuestro archivo .csv
     */
    //public ArrayList<Representante> getRepresentantes(){
//	return this.representantes;
    //}
    
    /**
 * Realiza lectura de archivos .csv y vamos creando de acuerdo al
 * archivo una lista de representantes o de casillas para el programa. 
 */
    public static void muestraContenido(String archivo, int n) throws FileNotFoundException, IOException{
	String cadena;
	FileReader f = new FileReader(archivo);
	BufferedReader b = new BufferedReader(f);
	while((cadena = b.readLine()) != null){
	    String[] a = separa(cadena);
	    if(n == 1){
	    Casilla casilla = new Casilla(a);
	    casillas.add(casilla);
	    }else{
		Representante r = new Representante(a);
		representantes.add(r);
	    }
	}
	b.close();
    }

    /**
     * Separamos los atributos de cada registro que puede ser
     * un representante o casilla.
     */ 
    private static String[] separa(String cadena){
	return cadena.split(",");
    }

    /** Ejecuta el programa
     */
    public static void main(String[] args) throws IOException{
	muestraContenido("casilla.csv" 1);
	
	
	
        
    }
}


