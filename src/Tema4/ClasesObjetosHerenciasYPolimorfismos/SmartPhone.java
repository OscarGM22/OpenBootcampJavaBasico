package Tema4.ClasesObjetosHerenciasYPolimorfismos;

public class SmartPhone extends SmartDevice {        //CLASE HIJA 1

    // 1. Atributos SmartPhone
    Double pulgadasPantalla;
    Boolean camara;
    Integer memoriaGB;


    // 2. Constructores SmartPhone

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, Integer kWBateria, Integer tiempoCarga, Boolean pantalla, Double pulgadasPantalla, Boolean camara, Integer memoriaGB) {
        super(marca, modelo, kWBateria, tiempoCarga, pantalla);
        this.pulgadasPantalla = pulgadasPantalla;
        this.camara = camara;
        this.memoriaGB = memoriaGB;
    }
    // 3. Métodos SmartPhone

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pulgadasPantalla=" + pulgadasPantalla +
                ", camara=" + camara +
                ", memoriaGB=" + memoriaGB +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kWBateria=" + mAhBateria +
                ", tiempoCarga=" + tiempoCargaMin +
                ", pantalla=" + pantalla +
                '}';
    }
}
