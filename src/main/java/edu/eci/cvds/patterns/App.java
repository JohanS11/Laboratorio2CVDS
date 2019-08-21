package edu.eci.cvds.patterns;

/**
 * Esta clase permite imprimir un hello personalizado con el nombre
 *
 */
public class App 
{
	/**
	 * @param String[] args es un arreglo con todos los nombres
	 */
    public static void main( String[] args )
    {	
    	System.out.println( "Hello "+args[0]+" "+args[1]+"!" );
    }
}
