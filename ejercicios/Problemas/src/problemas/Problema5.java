/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] arreglo = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int suma;
        suma = calcularSuma(arreglo);
        System.out.printf("La suma de los elementos del arreglo bidimensional"
                + " es: %d\n", suma);
    }

    public static int calcularSuma(int[][] datos) {
        int suma = 0;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                suma = suma + datos[i][j];
            }
        }
        return suma;
    }
}
