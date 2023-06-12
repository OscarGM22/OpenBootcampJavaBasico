package Tema4.ClasesObjetosHerenciasYPolimorfismos;

public abstract class SmartDevice { // CLASE PADRE

    // 1.Atributos SmartDevice
    String marca;
    String modelo;
    Integer mAhBateria;
    Integer tiempoCargaMin;
    Boolean pantalla;


    // 2. Constructores SmartDevice
    public SmartDevice() {

    }

    public SmartDevice(String marca, String modelo, Integer mAhBateria, Integer tiempoCargaMin, Boolean pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.mAhBateria = mAhBateria;
        this.tiempoCargaMin = tiempoCargaMin;
        this.pantalla = pantalla;
    }


    // 3. Métodos SmartDevice

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kWBateria=" + mAhBateria +
                ", tiempoCargaMin=" + tiempoCargaMin +
                ", pantalla=" + pantalla +
                '}';
    }
}

