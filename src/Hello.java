import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author lucas
 */
public interface Hello extends Remote {
    void printMsg() throws RemoteException;
}

/*
    Interface comum para o servidor e para o cliente.
    Em caso de estarem separados, devem ter a mesma implementação.
*/