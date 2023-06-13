package Tema2Funciones;

import java.util.Scanner;

public class EjercicioTema2 {
// Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el precio para añadirle el IVA (21%):");
        double precioSinIVA = sc.nextDouble();
        double precioConIVA = getPrecioConIVA(precioSinIVA);
        System.out.println("El precio con IVA del 21% es:\n"  + precioConIVA);
    }

    static double getPrecioConIVA(double precioSinIVA) {
        return precioSinIVA * 1.21;
    }

 }
