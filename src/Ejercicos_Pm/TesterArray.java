package Ejercicos_Pm;

import java.util.Random;
import java.util.Scanner;

public class TesterArray {
    public static void main(String[] args) {


        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        boolean salir = false;
        int opcion;
        do {
            System.out.println("1.Cargar un array y mostrarlo");
            System.out.println("2.Ordenar un array");
            System.out.println("3.Calcular la media de un array");
            System.out.println("4.Devolver la copia de un array invertido");
            System.out.println("5.Decir si está o no está un número");
            System.out.println("0.Salir");
            System.out.print("Seleccione una opción:");
            opcion = lector.nextInt();
            lector.nextLine();
            switch (opcion) {
                //Carga y visualización
                case 1:
                    System.out.println("Determine la longitud del vector");
                    int longitud = lector.nextInt();
                    int vector[] = new int[longitud];
                    OperacionesArray.carga(vector);
                    break;
                //Ordenar
                case 2:
                    int vector2[] = new int[0];
                    OperacionesArray.ordenar(vector2);
                    break;
                case 0:
                    salir = true;
                    break;
            }
        } while (!salir);
    }
}