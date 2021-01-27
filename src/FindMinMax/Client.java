package FindMinMax;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        Registry registry = LocateRegistry.getRegistry("localhost");
        FindMinMax stub = (FindMinMax) registry.lookup("FindMinMax");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your arrray length : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Pair p = stub.getMinMax(array);

        System.out.println("min : " + p.getMin() + " max : " + p.getMax());

    }
}
