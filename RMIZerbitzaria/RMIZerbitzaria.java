
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * 
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class RMIZerbitzaria {
    
    public static void main( String[ ] parametroak ) {
        try {
            Registry erregistroa = LocateRegistry.createRegistry( 1099 );
            UrrutikoInterfazea urrutikoa = new UrrutikoKlasea( );
            Naming.rebind("//localhost:1099/UrrutikoInterfazea", urrutikoa );
        } 
        catch( RemoteException s ) {
            System.out.println( s.getMessage( ) );
        }
        catch( MalformedURLException s ) {
            System.out.println( s.getMessage( ) );
        }
    }    
}
