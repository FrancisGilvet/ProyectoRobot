package com.robot;

public class Torso {
    private String material;
    private boolean proteccion;

    public Torso(String material, boolean proteccion) {
        this.material = material;
        this.proteccion = proteccion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isProteccion() {
        return proteccion;
    }

    public void setProteccion(boolean proteccion) {
        this.proteccion = proteccion;
    }

    public void soportarPeso() {
        System.out.println("El torso está soportando el peso del cuerpo.");
    }
}
