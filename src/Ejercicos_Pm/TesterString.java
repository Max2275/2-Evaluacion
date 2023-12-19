package Ejercicos_Pm;

import java.util.Scanner;

import static Ejercicos_Pm.OperacionesString.contarApariciones;

public class TesterString {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1.Iniciales de nombre y apellidos");
            System.out.println("2.Concatenacion en mayusculas");
            System.out.println("3.Contador de palabras");
            System.out.println("4.Contador de apariciones de un string dentro de otro");
            System.out.println("0.Salir");
            opcion = lector.nextInt();
            lector.nextLine();
            switch (opcion) {
                case 1:
                    //Iniciales
                    System.out.println("Introduzca su nombre");
                    String nombre = lector.nextLine();
                    System.out.println("Introduzca su primer apellido");
                    String apellido = lector.nextLine();
                    System.out.println("Introduzca su segundo apellido (si tiene)");
                    String sapellido = lector.nextLine();
                    System.out.println(OperacionesString.Inicial(nombre, apellido, sapellido));
                    break;
                case 2:
                    //Concatenacion en mayusculas
                    System.out.println("Introduzca una oracion o una palabra");
                    String palabra1 = lector.nextLine();
                    System.out.println("Introduzca otra oracion u otra palabra");
                    String palabra2 = lector.nextLine();
                    System.out.println(OperacionesString.ConcatenacionMayuscula(palabra1, palabra2));
                    break;
                case 3:
                    //Contador de palabras
                    System.out.println("Introduzca una oración");
                    String oracion = lector.nextLine();
                    OperacionesString.ContadorPalabras(oracion);
                    break;
                case 4:
                    //Contador de string dentro de otro string
                    System.out.println("Introduzca la oración principal");
                    String stringP = lector.nextLine();
                    System.out.println("Introduzca la oración secundaria");
                    String stringS = lector.nextLine();
                    int apariciones = contarApariciones(stringP, stringS);
                    System.out.println("Aparece " + apariciones + "veces.");
                    break;
                case 0:
                    System.out.println("Ha salido del programa.");
                    salir = true;
                    break;
                default:
                    System.out.println("No es una opción valida.");
                    break;
            }
        } while (!salir);
    }
}


