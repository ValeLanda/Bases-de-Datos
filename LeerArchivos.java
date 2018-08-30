import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *Clase que lee archivos y se queda con las características de cada  
 *representante.
 *@author: García Landa Valeria
 *------- Rebollar Pérez Ailyn
 *------- Reyer Granados Naomi Itzel
 *@version: 1.0
 */


public class LeerArchivos{
    private ArrayList<Casilla> casillas = new ArrayList<Casilla>();
     private ArrayList<Representante> representantes = new ArrayList<Representante>();
    
    public static void muestraContenido(String archivo, int n) throws FileNotFoundException, IOException{
	String cadena;
	FileReader f = new FileReader(archivo);
	BufferedReader b = new BufferedReader(f);
	while((cadena = b.readLine()) != null){
	    String[] a = separa(cadena);
	    if(n == 1){
		Casilla casilla = new Casilla(a);
		casilas.add(casilla);
	    }else{
		Representante r = new Representante(a);
		representantes.add(r);
	    }
	}
	b.close();
    }

    private String[] separa(String cadena){
	return cadena.split(",");
    }
    public static void main(String[] args) throws IOException{
	muestraContenido("casilla.csv");
    }
}
			 



