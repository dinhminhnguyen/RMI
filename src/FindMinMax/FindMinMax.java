package FindMinMax;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FindMinMax extends Remote {
    Pair getMinMax(int[] array) throws RemoteException;
}
