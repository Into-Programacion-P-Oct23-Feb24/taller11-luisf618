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
        int[] arreglo = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media;
        double desviacion;

        media = calcularMedia(arreglo);
        System.out.printf("Media Aritmética: %.2f\n", media);

        desviacion = calcularDesviacion(arreglo, media);
        System.out.printf("Desviación Estándar: %.2f\n", desviacion);
    }

    public static double calcularMedia(int[] datos) {
        int suma = 0;
        double media;
        for (int valor : datos) {
            suma = suma + valor;
        }
        media = (double) suma / datos.length;
        return media;
    }

    public static double calcularDesviacion(int[] datos, double media) {
        double suma = 0;
        double resta;
        double varianza;
        double desviacion;
        for (int i = 0; i < datos.length; i++) {
            resta = datos[i] - media;
            suma = suma + Math.pow(resta, 2);
        }

        varianza = suma / datos.length;
        desviacion = Math.sqrt(varianza);
        return desviacion;
    }
}
