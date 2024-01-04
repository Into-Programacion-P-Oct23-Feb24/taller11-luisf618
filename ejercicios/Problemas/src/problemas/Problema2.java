/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema2 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entrada.useLocale(Locale.US);
        int proceso;
        System.out.println("Ingrese que area desea calcular");
        proceso = entrada.nextInt();
        if (proceso == 1) {
            obtenerAreaCuadrado();
        } else {
            if (proceso == 2) {
                obtenerAreaTriangulo();
            } else {
                if (proceso == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Error");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        entrada.useLocale(Locale.US);
        double l;
        double area;
        System.out.println("Ingrese el lado del cuadrado");
        l = entrada.nextDouble();
        area = l * l * l * l;
        System.out.println(area);
    }

    public static void obtenerAreaTriangulo() {
        entrada.useLocale(Locale.US);
        double b;
        double h;
        double area;
        System.out.println("Ingrese la base del triangulo");
        b = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        h = entrada.nextDouble();
        area = (b * h) / 2;
        System.out.println(area);
    }

    public static void obtenerAreaRectangulo() {
        entrada.useLocale(Locale.US);
        double b;
        double h;
        double area;
        System.out.println("Ingrese la base del rectangulo");
        b = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        h = entrada.nextDouble();
        area = b * h;
        System.out.println(area);
    }
}
