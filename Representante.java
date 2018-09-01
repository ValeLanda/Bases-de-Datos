/**
 * Clase que crea objetos de tipo representante
 * @author: García Landa Valeria
 *--------- Rebollar Pérez Ailyn 
 *--------- Reyes Granados Naomi Itzel
 * @version: 1.0
 */


public class Representante{

    //Nombre del representante
    private String nombre;

    //Apellido paterno del representante
    private String apellidoP;

    //Apellido materno del representante 
    private String apellidoM;

    //Calidad de representante
    private String calidR;

    //Casilla al que fue asignado el representante
    private Casilla casilla;

    //Sección de la casilla que fue asignado el representante
    private String seccion;

    /*Constructor de un Representante*/
    public Representante(String[] arreglo, Casilla c){
	this.nombre = arreglo[0];
	this.apellidoP = arreglo[1];
	this.apellidoM= arreglo[2];
	if(arreglo[3].equals("Propietario") ||
	   arreglo[3].equals("Suplente")){
	    this.calidR = arreglo[3];
	}else{
	    System.out.println("El representante solo puede tener calidad de Propietario o Suplente");}
	this.casilla = c;
	this.seccion = c.getSeccion();
    }

    /** Metodo que regresa el nombre de un representante.
     *@return el nombre de un representante
     */

    public String getNombre(){
	return this.nombre;
    }

    /** Define el nombre de un representante.
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /** Metodo que regresa el apellido Paterno de un representante.
     *@return el apellidoP de un representante
     */

    public String getApellidoP(){
	return this.apellidoP;
    }

    /** Define el apellido paterno  de un representante.
     */
    public void setApellidoP(String apellidoP){
	this.apellidoP = apellidoP;
    }

    /** Metodo que regresa el apellido materno de un representante.
     *@return el apellidoM de un representante
     */

    public String getApellidoM(){
	return this.apellidoM;
    }

    /** Define el apellido materno de un representante.
     */
    public void setApellidoM(String apellidoM){
	this.apellidoM = apellidoM;
    }

    /** Metodo que regresa la calidad de un representante.
     *@return la calidad de un representante
     */

    public String getCalidadR(){
	return this.calidR;
    }

    /** Define la calidad de un representante.
     */
    public void setCalidadR(String calidR){
	this.calidR = calidR;
    }
    
    /** Método que regresa la casilla de un representante.
     *@return la casilla de un representante
     */

    public Casilla getCasilla(){
	return this.casilla;
    }

    /** Define la casilla de un representante.
     */
    public void setCasilla(Casilla casilla){
	this.casilla = casilla;
    }

    /** Método que regresa la seccióna de un representante.
     *@return la sección de un representante
     */

    public String getSeccion(){
	return this.seccion;
    }

    /** Define la sección de un representante.
     */
    public void setSeccion(String seccion){
	this.seccion = seccion;
    }
}
