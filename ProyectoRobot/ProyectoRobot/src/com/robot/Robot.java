package com.robot;

public class Robot {
    private Mano mano;
    private Pierna pierna;
    private Torso torso;
    private Cabeza cabeza;
    private Outfit outfit;

    public Robot(Mano mano, Pierna pierna, Torso torso, Cabeza cabeza, Outfit outfit) {
        this.mano = mano;
        this.pierna = pierna;
        this.torso = torso;
        this.cabeza = cabeza;
        this.outfit = outfit;
    }

    public void ejecutarAcciones() {
        mano.moverDedos();
        pierna.caminar();
        torso.soportarPeso();
        cabeza.hablar();
    }

    public void mostrarOutfit() {
        System.out.println("El robot está usando: " + outfit.getDescripcion());
    }
}
