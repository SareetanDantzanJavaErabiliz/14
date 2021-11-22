/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UrrutikoInterfazea extends Remote{
    
    int[ ] kalkulatuErrepikapenMaximoa( int arrayZenbakiak[ ] ) throws RemoteException;
    
}
