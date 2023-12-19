package Ejercicos_Pm;

import java.util.Arrays;
import java.util.Random;


public class OperacionesArray {
    static Random random = new Random();

    public static void carga(int vector[]) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(0, 11);

        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void ordenar(int x[]) {
        x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(0, 10);
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println(" ");
        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(+x[i] + " ");
        }
        System.out.println(" ");
    }
}
