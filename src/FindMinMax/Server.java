package FindMinMax;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements FindMinMax{
    public Server(){};

    public Pair getMinMax(int[] array)  {
        int min = array[0];
        int max = array[0];
        for(int i = 1 ; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return new PairOb(min, max);
    }

    public static void main(String[] args) throws Exception{
        Server server = new Server();
        FindMinMax stub = (FindMinMax) UnicastRemoteObject.exportObject(server, 0);
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("FindMinMax", stub);
        System.out.println("Server ready!");
    }
}
