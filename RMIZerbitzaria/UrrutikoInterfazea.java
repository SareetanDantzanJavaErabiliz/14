
import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public interface UrrutikoInterfazea extends Remote {
    
    int[ ] kalkulatuErrepikapenMaximoa( int arrayZenbakiak[ ] ) throws RemoteException;
    
}
