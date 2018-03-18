
package uniandes.cupi2.avion.interfaz;

import java.awt.*;
import java.text.*;
import javax.swing.*;
import uniandes.cupi2.avion.mundo.*;

/**
 * Ventana principal del avi�n.
 */
@SuppressWarnings("serial")
public class InterfazAvion extends JFrame
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Avi�n.
     */
    private Avion avion;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Panel que contiene el banner de la aplicaci�n.
     */
    private PanelImagen panelImagen;

    /**
     * Panel que contiene el avi�n.
     */
    private PanelAvion panelAvion;

    /**
     * Panel de botones.
     */
    private PanelBotonesAvion panelBotones;

    /**
     * Di�logo de nuevo pasajero.
     */
   

    /**
     * Crea la interfaz del avi�n. <br>
     * <b>post: </b> Se crea el avi�n y se presenta en una gr�fica su estado inicial.
     */
    public InterfazAvion( )
    {
        setTitle( "El Avi�n" );
        setSize( 580, 700 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // Crea al avi�n
        avion = new Avion( );

        // Configura la interfaz
        setLayout( new BorderLayout( ) );

        // Panel del banner
        panelImagen = new PanelImagen( );
        add( panelImagen, BorderLayout.NORTH );

        // Panel del avi�n
        panelAvion = new PanelAvion( avion );
        add( panelAvion, BorderLayout.CENTER );

        // Panel de botones
        panelBotones = new PanelBotonesAvion( this );
        add( panelBotones, BorderLayout.SOUTH );

        setResizable( false );
        setLocationRelativeTo( null );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Ejecuta la aplicaci�n.
     * @param pArgs Par�metros de la ejecuci�n. No son necesarios.
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