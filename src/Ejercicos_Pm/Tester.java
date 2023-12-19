package Ejercicos_Pm;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1.Ver si el número es primo o perfecto.");
        System.out.println("2.Crear una pirámide");
        System.out.println("3.Salir");
        int opcion = lector.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduce un número");
                int num1 = lector.nextInt();

                //Perfecto
                int sumat = OperacionesVarias.perfecto(num1);
                if (num1 == sumat) {
                    System.out.println("Es un numero perfecto");
                } else {
                    System.out.println("No es un numero perfecto");
                }
                System.out.println(" ");

                //Primo
                OperacionesVarias.Primo(num1);
                break;

            case 2:
                //Pirámide
                System.out.print("Ingrese el número de filas para la pirámide: ");
                int numeroFilas = lector.nextInt();
                OperacionesVarias.Piramide(numeroFilas);
                break;


        }
    }
}
