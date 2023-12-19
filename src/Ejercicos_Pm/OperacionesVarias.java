package Ejercicos_Pm;

public class OperacionesVarias {

    public static int perfecto(int x) {
        int suma = 0;

        for (int i = 1; i <= x / 2; i++) {

            if (x % i == 0) {
                suma += i;
            }

        }

        return suma;
    }

    public static void Primo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("Es un número primo");
        } else {
            System.out.println("No es un número primo");
        }
    }

    public static void Piramide(int numeroFilas) {
        for (int i = 1; i <= numeroFilas; i++) {
            for (int j = 1; j <= numeroFilas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }


}

