import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Menu{
    public static ArrayList<String> krepresentantes = new ArrayList<String>();
    public static int ncasillas;
    public static ArrayList<Casilla> casilla= new ArrayList<Casilla>();
    public static ArrayList<Representante> r= new ArrayList<Representante>();
//Opcion 1 es buscar representante opcion 0 buscar casilla
    public static boolean busca(String kc, int kcasilla,int opcion){
	if(kcasilla < casilla.size() && opcion== 0)
		return true;
	else if(opcion == 1 && (krepresentantes != null) && krepresentantes.contains(kc)){
		return true;
	}
	return false;
    }
//Regresa la casilla ala que esta asignado un representante.

    public static Casilla buscaRepresentante(String kc){
	int n;
	n= krepresentantes.indexOf(kc);
	return casilla.get((r.get(n)).getCasilla());
    }


    public static void main (String args[])throws IOException{
	LeerArchivos l = new LeerArchivos();
        l.leeArchivoC("casilla.csv");
	l.escribeArchivo();
	casilla = l.getCasillas();
	krepresentantes = l.getkRepresentantes();
	r = l.getRepresentantes();
	Scanner sn = new Scanner(System.in);
	Scanner out = new Scanner(System.in);
	String kc;
	boolean exit = false;
	int option;
	while(!exit){
	    System.out.println("ELIJA LA OPCION QUE DESEA REALIZAR:");
	    System.out.println("1.Buscar Representante");
	    System.out.println("2.Eliminar Representante");
	    System.out.println("3.Modificar Represnetante");
	    System.out.println("4.Exit");
	    try{
		System.out.print("Ingrese su opcion: ");
		option = sn.nextInt();
		switch(option){
		case 1:
		    System.out.println("\nIngrese el dentificador del Representante: ");
		    kc = out.nextLine();
		    if(busca(kc,0,1))
			System.out.println("\n"+ buscaRepresentante(kc).toString());
		    else 
			System.out.println("Lo sentimos el representante ingresado no existe\n");
		    break;
		case 2:
		    System.out.println("\nModificar por metodo Elimina\n");
		    break;
		case 3:
		    System.out.println("\nModificar por metodo Modifica\n");
		    break;
		case 4:
		    exit = true;
		    break;
		default:
		    System.out.println("\nIngresaste una entrada no valida, por favor intentalo de nuevo :)\n");
		}
	    }catch(InputMismatchException e){
		System.out.println("\nIngresaste algo que no es un numero... intental nuevamente :) :) :)\n");
		sn.next();
	    }
	}
    }
}

