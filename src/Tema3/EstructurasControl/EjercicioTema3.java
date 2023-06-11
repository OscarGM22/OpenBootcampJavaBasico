package Tema3.EstructurasControl;


/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}
 */
public class EjercicioTema3 {
    public static void main(String[] args) {

        String[] nombres = {"Roberto", "Luís", "Sonia", "Irene"};
        String[] apellidos = {"Gómez", "Sánchez", "Yeste", "Herrero"};

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = nombres [i] + " " + apellidos [i];
            System.out.println(nombres[i]);
        }


    }
}
