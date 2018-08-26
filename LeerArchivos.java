import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *Clase que lee archivos y se queda con las características de cada  
 *representante.
 *@author: García Landa Valeria
 *------- Rebollar Pérez Ailyn
 *------- Reyer Granados Naomi Itzel
 *@version: 1.0
 */


public class LeerArchivos{
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException{
	String cadena;
	FileReader f = new FileReader(archivo);
	BufferedReader b = new BufferedReader(f);
	while((cadena = b.readLine()) != null){
	    System.out.println(cadena);
	}
	b.close();
    }

    public static void main(String[] args) throws IOException{
	muestraContenido("casilla.csv");
    }
}
			 



