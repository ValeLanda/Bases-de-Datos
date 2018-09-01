/**
 * Clase que crea objetos de tipo casilla
 *@author: García Landa Valeria
 *------- Rebollar Pérez Ailyn
 *------- Reyer Granados Naomi Itzel
 *@version: 1.0
 */

public class Casilla{
    // Estado al que corresponde la casilla.
    private String estado;
    // Distrito al que corresponde la casilla.
    private String distrito;
    // Sección al que corresponde la casilla.
    private String seccion;
    // Tipo que es la casilla.
    private String tipo;
    // Nos dice si está aprobada la casilla o no.
    private String aprobado;

    /** Constructor de una Casilla
     */
    public Casilla(String[] arreglo){
	this.estado = arreglo[0];
	this.distrito = arreglo[1];
	this.seccion = arreglo[2];
	if(arreglo[3].equals("B1") ||
	   arreglo[3].equals("C1") ||
	   arreglo[3].equals("C2") ||
	   arreglo[3].equals("C3")){
	    this.tipo = arreglo[3];
	}else{System.out.println("Es un tipo de casilla no válido");}
	if(arreglo[4].equals("S") || arreglo[4].equals("N")){
	    this.aprobado = arreglo[4];
	}else{System.out.println("Sólo podemos aceptar casillas aprobado S o N");}
    }

    /** Define el estado de una casilla.
     */
    public void setEstado(String estado){
	this.estado = estado;
    }
    
    /** Regresa el estado de una casilla.
     * @return el estado de una casilla.
     */
    public String getEstado(){
	return this.estado;
    }
    
    /** Define el distrito de una casilla.
     */
    public void setDistrito(String distrito){
	this.distrito = distrito;
    }
    
    /** Regresa el distrito de una casilla.
     * @return el distrito de una casilla.
     */
    public String getDistrito(){
	return this.distrito;
    }
    
    /** Define el sección de una casilla.
     */
    public void setSeccion(String seccion){
	this.seccion = seccion;
    }
    
    /** Regresa el sección de una casilla.
     * @return el sección de una casilla.
     */
    public String getSeccion(){
	return this.seccion;
    }
    
     /** Define el tipo de una casilla.
     */
    public void setTipo(String tipo){
	this.tipo = tipo;
    }
    
    /** Regresa el tipo de una casilla.
     * @return el tipo de una casilla.
     */
    public String getTipo(){
	return this.tipo;
    }
    
     /** Define el estado de aprobación de una casilla.
     */
    public void setAprobado(String aprobado){
	this.aprobado = aprobado;
    }
    
    /** Regresa el estado de aprobación de una casilla.
     * @return el estado de aprobación de una casilla.
     */
    public String getAprobado(){
	return this.aprobado;
    }

    

}
