package com.robot;

public class Main {
    public static void main(String[] args) {
        Mano mano = new Mano(5, true);
        Pierna pierna = new Pierna(90, true);
        Torso torso = new Torso("Metal", true);
        Cabeza cabeza = new Cabeza(true, true);
        Outfit outfit = new CasualOutfit("Azul");

        Robot robot = new Robot(mano, pierna, torso, cabeza, outfit);

        robot.ejecutarAcciones();
        robot.mostrarOutfit();
    }
}
