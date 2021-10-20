
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU
 */
public class RMIBezeroa {
    
    public static void main( String[ ] parametroak ) {

        try {
            UrrutikoInterfazea urrutikoa = ( UrrutikoInterfazea ) Naming.lookup( "UrrutikoInterfazea" );
            int zenbakiak[ ] = {20, 120, 10, 120, 30, 30, 1, 2, 3, 4, 120, 40 };
            int emaitza[ ] = urrutikoa.kalkulatuErrepikapenMaximoa( zenbakiak );

            /*emaitza[1] zenbakia zenbat aldiz errepikatzen den izango da eta ez zenbat aldiz agertzen den. emaitza[ 0 ] arrayan dagoen zenbakirik altuena izango da  */
            System.out.println( "Zenbaki altuena: "+emaitza[ 0 ]+"  Errepikapen kopurua: "+emaitza[ 1 ] );
        } 
        catch( NotBoundException s ) {
		System.out.println( s.getMessage( ) );
        } 
        catch( MalformedURLException s ) {
		System.out.println( s.getMessage( ) );
        } 
        catch( RemoteException s ) {
		System.out.println( s.getMessage( ) );
            
        }       
    }    
}
