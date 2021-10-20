
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class UrrutikoKlasea extends UnicastRemoteObject implements UrrutikoInterfazea {

    public UrrutikoKlasea( ) throws RemoteException {
        super( );
    }    
    
    @Override
    public int[] kalkulatuErrepikapenMaximoa( int[ ] arrayZenbakiak ) throws RemoteException {
        int max[ ] = new int[ 2 ];
        int errepikapenak[ ] = new int[ arrayZenbakiak.length ];
        
        for ( int i = 0; i < arrayZenbakiak.length; i++ ) {
            for ( int j = i + 1; j < arrayZenbakiak.length; j++ ) {
                if ( arrayZenbakiak[ i ] == arrayZenbakiak[ j ] ) {
                    errepikapenak[ i ]++;
                }
            }
        }
        int zenbaltuena = arrayZenbakiak[ 0 ],errepkop = errepikapenak[ 0 ];
        max[ 0 ] = zenbaltuena;
        max[ 1 ] = errepkop;
        for ( int i = 0; i < arrayZenbakiak.length; i++ ) {
            if ( arrayZenbakiak[ i ] > zenbaltuena ) {
                zenbaltuena = arrayZenbakiak[ i ];
                errepkop = errepikapenak[ i ];
                max[ 0 ] = zenbaltuena;
                max[ 1 ] = errepkop;
            }
        }
        
        return max;
    }
    
}
