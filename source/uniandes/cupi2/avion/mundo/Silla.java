
package uniandes.cupi2.avion.mundo;

/**
 * Silla del avión.
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
         * Representa la clase económica.
         */
        ECONOMICA
    }

    /**
     * Enumeradores para las ubicaciones de las sillas.
     */
    public enum Ubicacion {
        /**
         * Representa la ubicación ventana.
         */
        VENTANA,

        /**
         * Representa la ubicación centro.
         */
        CENTRAL,

        /**
         * Representa la ubicación pasillo.
         */
        PASILLO
    }

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Número de la silla.
     */
    private int numero;

    /**
     * Clase de la silla.
     */
    private Clase clase;

    /**
     * Ubicación de la silla.
     */
    private Ubicacion ubicacion;

    /**
     * Pasajero asignado a la silla.
     */


    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la silla con su número identificador. <br>
     * <b>post: </b> El objeto silla tiene sus datos básicos número, clase y ubicación asignados. El pasajero no está asignado y tiene valor null.
     * @param pNumero Número de silla. pNumero > 0.
     * @param pClase Clase de silla. pClase pertenece {EJECUTIVA,ECONOMICA}.
     * @param pUbicacion Ubicación de la silla. pUbicacion pertenece {VENTANA, CENTRAL, PASILLO}.
     */
    public Silla( int pNumero, Clase pClase, Ubicacion pUbicacion )
    {
        numero = pNumero;
        clase = pClase;
        ubicacion = pUbicacion;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------



    /**
     * Retorna el número de la silla.
     * @return Número de la silla.
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
     * Retorna la ubicación de la silla.
     * @return Ubicación de la silla.
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