package Tema4ClasesObjetosHerenciasYPolimorfismos;

public class SmartWatch extends SmartDevice {        //CLASE HIJA 2
    // 1. Atributos
    Boolean gps;
    Boolean sensorLatidos;
    Integer numBotones;
    String formaDisplay; // Redonda, Cuadrada, Rectangular

    // 2. Constructores

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, Integer kWBateria, Integer tiempoCarga, Boolean pantalla, Boolean gps, Boolean sensorLatidos, Integer numBotones, String formaDisplay) {
        super(marca, modelo, kWBateria, tiempoCarga, pantalla);
        this.gps = gps;
        this.sensorLatidos = sensorLatidos;
        this.numBotones = numBotones;
        this.formaDisplay = formaDisplay;
    }

    // 3. Métodos

    @Override
    public String toString() {
        return "SmartWatch{" +
                "gps=" + gps +
                ", sensorLatidos=" + sensorLatidos +
                ", numBotones=" + numBotones +
                ", formaDisplay='" + formaDisplay + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kWBateria=" + mAhBateria +
                ", tiempoCarga=" + tiempoCargaMin +
                ", pantalla=" + pantalla +
                '}';
    }
}
