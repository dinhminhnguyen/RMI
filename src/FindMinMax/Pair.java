package FindMinMax;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Pair extends Remote, Serializable {
    int getMin() throws RemoteException;
    int getMax() throws RemoteException;
}
