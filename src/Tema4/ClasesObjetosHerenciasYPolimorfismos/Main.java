package Tema4.ClasesObjetosHerenciasYPolimorfismos;

public class Main {
    public static void main(String[] args) {

        // SmartDevice device = new SmartDevice();  --> No se puede instanciar porque la clase SmartDevice es abstracta.

        SmartPhone miSmartPhone = new SmartPhone(); // Ejemplo de uso del constructor vacío.
        // System.out.println(miSmartPhone); // Al no darle parámetros y los atributos ser tipo envoltorio (con mayúscula e int-->Integer), imprime 'null' como valor de todos ellos.

        SmartPhone miIPhone = new SmartPhone("Apple", "iPhone", 2942, 120, true,6.2,true,64);
        System.out.println("El SmartPhone es: " + "\n" + miIPhone);

        SmartWatch miWatch = new SmartWatch(); // Ejemplo de uso del constructor vacío.
        // System.out.println(miWatch);

        SmartWatch miAmazfit = new SmartWatch("Amazfit", "Bip U Pro", 230, 40, true, true, true, 1, "Cuadrada");
        System.out.println("El SmartWatch es: " + "\n" + miAmazfit);



    }
}
