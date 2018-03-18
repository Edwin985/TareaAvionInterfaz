
package uniandes.cupi2.avion.mundo;

/**
 * Silla del avi�n.
 */
public class Silla
{
    // -----------------------------------------------------------------
    // Enumeraciones
    // -----------------------------------------------------------------

    /**
     * Enumeradores para las clases a las que pertenece una silla.
     */
    public enum Clase {
        /**
         * Representa la clase ejecutiva.
         */
        EJECUTIVA,

        /**
         * Representa la clase econ�mica.
         */
        ECONOMICA
    }

    /**
     * Enumeradores para las ubicaciones de las sillas.
     */
    public enum Ubicacion {
        /**
         * Representa la ubicaci�n ventana.
         */
        VENTANA,

        /**
         * Representa la ubicaci�n centro.
         */
        CENTRAL,

        /**
         * Representa la ubicaci�n pasillo.
         */
        PASILLO
    }

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * N�mero de la silla.
     */
    private int numero;

    /**
     * Clase de la silla.
     */
    private Clase clase;

    /**
     * Ubicaci�n de la silla.
     */
    private Ubicacion ubicacion;

    /**
     * Pasajero asignado a la silla.
     */


    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la silla con su n�mero identificador. <br>
     * <b>post: </b> El objeto silla tiene sus datos b�sicos n�mero, clase y ubicaci�n asignados. El pasajero no est� asignado y tiene valor null.
     * @param pNumero N�mero de silla. pNumero > 0.
     * @param pClase Clase de silla. pClase pertenece {EJECUTIVA,ECONOMICA}.
     * @param pUbicacion Ubicaci�n de la silla. pUbicacion pertenece {VENTANA, CENTRAL, PASILLO}.
     */
    public Silla( int pNumero, Clase pClase, Ubicacion pUbicacion )
    {
        numero = pNumero;
        clase = pClase;
        ubicacion = pUbicacion;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------



    /**
     * Retorna el n�mero de la silla.
     * @return N�mero de la silla.
     */
    public int darNumero( )
    {
        return numero;
    }

    /**
     * Retorna la clase de la silla.
     * @return Clase de la silla.
     */
    public Clase darClase( )
    {
        return clase;
    }

    /**
     * Retorna la ubicaci�n de la silla.
     * @return Ubicaci�n de la silla.
     */
    public Ubicacion darUbicacion( )
    {
        return ubicacion;
    }

    /**
     * Retorna el pasajero asignado a la silla.
     * @return Pasajero asignado a la silla. Si no hay pasajero retorna null.
     */
    
}