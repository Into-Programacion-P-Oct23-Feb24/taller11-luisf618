/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {

        String[] arregloCiudades;
        arregloCiudades = obtenerArreglo();

        imprimirCiudades(arregloCiudades);
    }

    public static String[] obtenerArreglo() {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese el número de ciudades:");
        numero = entrada.nextInt();
        entrada.nextLine();

        String[] ciudad = new String[numero];

        for (int i = 0; i < ciudad.length; i++) {
            System.out.println("Ingrese la ciudad");
            ciudad[i] = entrada.nextLine();
        }

        return ciudad;
    }

    public static void imprimirCiudades(String[] ciudad) {
        int longitud;
        String cadena;
        System.out.println("Ciudades con 4 o 5 caracteres:");
        for (int i = 0; i < ciudad.length; i++) {
            cadena = ciudad[i];
            longitud = cadena.length();
            if (longitud == 4 || longitud == 5) {
                System.out.println(cadena);
            }
        }
    }
}
