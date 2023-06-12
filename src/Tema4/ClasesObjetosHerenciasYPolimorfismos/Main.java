package Tema4.ClasesObjetosHerenciasYPolimorfismos;

public class Main {
    public static void main(String[] args) {

        // SmartDevice device = new SmartDevice();  --> No se puede instanciar porque la clase SmartDevice es abstracta.

        SmartPhone miSmartPhone = new SmartPhone(); // Usamos el constructor vacío.
        System.out.println(miSmartPhone.toString()); // Al no darle parámetros y los atributos ser tipo envoltorio (con mayúscula e int-->Integer), imprime 'null'.

        SmartPhone miIPhone = new SmartPhone("Apple", "iPhone", 2942, 120, true,6.2,true,64);
        System.out.println(miIPhone.toString());

        SmartWatch miWatch = new SmartWatch(); // Usamos el constructor vacío.
        System.out.println(miWatch.toString());

        SmartWatch miAmazfit = new SmartWatch("Amazfit", "Bip U Pro", 230, 40, true, true, true, 1, "Cuadrada");
        System.out.println(miAmazfit.toString());



    }
}
