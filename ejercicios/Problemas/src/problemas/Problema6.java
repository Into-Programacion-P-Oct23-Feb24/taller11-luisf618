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
public class Problema6 {
    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        // Calcular la media aritmética
        double media = calcularMediaAritmetica(informacion);
        System.out.println("Media Aritmética: " + media);

        // Calcular la desviación estándar
        double desviacionEstandar = calcularDesviacionEstandar(informacion, media);
        System.out.println("Desviación Estándar: " + desviacionEstandar);
    }

    public static double calcularMediaAritmetica(int[] arreglo) {
        int suma = 0;
        for (int valor : arreglo) {
            suma += valor;
        }
        return (double) suma / arreglo.length;
    }

    public static double calcularDesviacionEstandar(int[] arreglo, double media) {
        double sumaCuadradosDiferencias = 0;

        for (int valor : arreglo) {
            double diferencia = valor - media;
            sumaCuadradosDiferencias += Math.pow(diferencia, 2);
        }

        double varianza = sumaCuadradosDiferencias / arreglo.length;
        return Math.sqrt(varianza);
    }
}
