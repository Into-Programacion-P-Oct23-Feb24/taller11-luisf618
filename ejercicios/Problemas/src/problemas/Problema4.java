/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion;
        String nombreCliente;
        String cedulaCliente;
        System.out.println("Ingrese la opción que desea realizar");
        opcion = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del cliente:");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese la cédula del cliente:");
        cedulaCliente = entrada.nextLine();
        switch (opcion) {
            case 1:
                calcularValorLuz(nombreCliente, cedulaCliente);
                break;

            case 2:
                calcularPredio(nombreCliente, cedulaCliente);
                break;

            default:
                System.out.println("Opción no válida");
        }
    }

    public static void calcularValorLuz(String nombre, String cedula) {
        entrada.useLocale(Locale.US);
        double valorKilowatio;
        double numKilowatios;
        double valorTotal;
        System.out.println("Ingrese el valor del kilowatio:");
        valorKilowatio = entrada.nextDouble();
        System.out.println("Ingrese el número de kilowatios del mes:");
        numKilowatios = entrada.nextDouble();
        valorTotal = valorKilowatio * numKilowatios;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor"
                + " de $%.2f\n", nombre, cedula, valorTotal);
    }

    public static void calcularPredio(String nombreCliente,
            String cedulaCliente) {
        entrada.useLocale(Locale.US);
        double valorInmueble;
        double valorPredio;
        System.out.println("Ingrese el valor del inmueble:");
        valorInmueble = entrada.nextDouble();
        valorPredio = valorInmueble * 0.02;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f\n",
                nombreCliente,
                cedulaCliente, valorInmueble, valorPredio);
    }
}
