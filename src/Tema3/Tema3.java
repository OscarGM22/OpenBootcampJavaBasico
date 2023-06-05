package Tema3;

public class Tema3 {
// Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

    public static void main(String[] args) {

        double precioSinIVA = 55.20;
        double precioConIVA = getPrecioConIVA(precioSinIVA);
        System.out.println("El precio con IVA del 21% es:\n"  + precioConIVA);
    }

    static double getPrecioConIVA(double precioSinIVA) {
        return precioSinIVA * 1.21;
    }

 }
