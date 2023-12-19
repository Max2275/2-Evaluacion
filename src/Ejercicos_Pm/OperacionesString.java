package Ejercicos_Pm;

import java.util.StringTokenizer;

public class OperacionesString {

    public static String Inicial(String x, String y, String z) {
        String resultado = new String();

        return resultado.concat(String.valueOf(x.charAt(0)).concat(String.valueOf(y.charAt(0)).concat(String.valueOf(z.charAt(0)))));
    }

    public static String ConcatenacionMayuscula(String x, String y) {
        String resultado = new String();
        return resultado.concat(x.toUpperCase()).concat(y.toUpperCase());
    }

    public static void ContadorPalabras(String x) {
        StringTokenizer contador = new StringTokenizer(x);
        System.out.println("Esta oración tiene " + contador.countTokens() + "palabras.");
    }

    public static int contarApariciones(String x, String y) {
        int apariciones = 0;
        int indice = 0;

        while ((indice = x.indexOf(y, indice)) != -1) {
            apariciones++;
            indice += y.length();
        }

        return apariciones;
    }
}
