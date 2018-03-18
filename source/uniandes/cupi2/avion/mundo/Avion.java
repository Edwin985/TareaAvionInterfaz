package uniandes.cupi2.avion.mundo;

import uniandes.cupi2.avion.mundo.Silla.Clase;
import uniandes.cupi2.avion.mundo.Silla.Ubicacion;

/**
 * Avión de pasajeros.
 */
public class Avion
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Número de sillas ejecutivas.
     */
    public final static int SILLAS_EJECUTIVAS = 8;

    /**
     * Número de sillas económicas.
     */
    public final static int SILLAS_ECONOMICAS = 42;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Sillas de la clase ejecutiva del avión.
     */

    private Silla[] sillasEjecutivas;

    /**
     * Sillas de la clase económica del avión.
     */
    private Silla[] sillasEconomicas;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el avión. <br>
     * <b>post: </b> Se inicializan las listas de sillas ejecutivas y económicas.
     */
    public Avion( )
    {
        Ubicacion ubicacion;

        // Crea las sillas ejecutivas
        sillasEjecutivas = new Silla[SILLAS_EJECUTIVAS];

        // Crea las sillas económicas
        sillasEconomicas = new Silla[SILLAS_ECONOMICAS];

        sillasEjecutivas[ 0 ] = new Silla( 1, Clase.EJECUTIVA, Ubicacion.VENTANA );
        sillasEjecutivas[ 1 ] = new Silla( 2, Clase.EJECUTIVA, Ubicacion.PASILLO );
        sillasEjecutivas[ 2 ] = new Silla( 3, Clase.EJECUTIVA, Ubicacion.PASILLO );
        sillasEjecutivas[ 3 ] = new Silla( 4, Clase.EJECUTIVA, Ubicacion.VENTANA );
        sillasEjecutivas[ 4 ] = new Silla( 5, Clase.EJECUTIVA, Ubicacion.VENTANA );
        sillasEjecutivas[ 5 ] = new Silla( 6, Clase.EJECUTIVA, Ubicacion.PASILLO );
        sillasEjecutivas[ 6 ] = new Silla( 7, Clase.EJECUTIVA, Ubicacion.PASILLO );
        sillasEjecutivas[ 7 ] = new Silla( 8, Clase.EJECUTIVA, Ubicacion.VENTANA );

        for( int numSilla = 1 + SILLAS_EJECUTIVAS, j = 1; j <= SILLAS_ECONOMICAS; numSilla++, j++ )
        {
            // Sillas ventana
            if( j % 6 == 1 || j % 6 == 0 )
                ubicacion = Ubicacion.VENTANA;
            // Sillas centrales
            else if( j % 6 == 2 || j % 6 == 5 )
                ubicacion = Ubicacion.CENTRAL;
            // Sillas pasillo
            else
                ubicacion = Ubicacion.PASILLO;

            sillasEconomicas[ j - 1 ] = new Silla( numSilla, Clase.ECONOMICA, ubicacion );
        }
    }
    /**
     * Retorna las sillas ejecutivas del avión.
     * @return Sillas ejecutivas del avión.
     */
    public Silla[] obtenerSillasEjecutivas( )
    {
        return sillasEjecutivas;
    }

    /**
     * Retorna las sillas económicas del avión.
     * @return Sillas económicas del avión.
     */
    public Silla[] obtenerSillasEconomicas( )
    {
        return sillasEconomicas;
    }
}
