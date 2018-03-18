
package uniandes.cupi2.avion.interfaz;

import java.awt.*;
import java.text.*;
import javax.swing.*;
import uniandes.cupi2.avion.mundo.*;

/**
 * Ventana principal del avión.
 */
@SuppressWarnings("serial")
public class InterfazAvion extends JFrame
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Avión.
     */
    private Avion avion;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Panel que contiene el banner de la aplicación.
     */
    private PanelImagen panelImagen;

    /**
     * Panel que contiene el avión.
     */
    private PanelAvion panelAvion;

    /**
     * Panel de botones.
     */
    private PanelBotonesAvion panelBotones;

    /**
     * Diálogo de nuevo pasajero.
     */
   

    /**
     * Crea la interfaz del avión. <br>
     * <b>post: </b> Se crea el avión y se presenta en una gráfica su estado inicial.
     */
    public InterfazAvion( )
    {
        setTitle( "El Avión" );
        setSize( 580, 700 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // Crea al avión
        avion = new Avion( );

        // Configura la interfaz
        setLayout( new BorderLayout( ) );

        // Panel del banner
        panelImagen = new PanelImagen( );
        add( panelImagen, BorderLayout.NORTH );

        // Panel del avión
        panelAvion = new PanelAvion( avion );
        add( panelAvion, BorderLayout.CENTER );

        // Panel de botones
        panelBotones = new PanelBotonesAvion( this );
        add( panelBotones, BorderLayout.SOUTH );

        setResizable( false );
        setLocationRelativeTo( null );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Ejecuta la aplicación.
     * @param pArgs Parámetros de la ejecución. No son necesarios.
     */
    public static void main( String[] pArgs )
    {
        try
        {
            // Unifica la interfaz para Mac y para Windows.
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
            InterfazAvion interfaz = new InterfazAvion( );
            interfaz.setVisible( true );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
    }
}