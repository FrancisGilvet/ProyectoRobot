package com.robot;

public class Outfit {
    private String color;

    public Outfit(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return "Outfit de color " + color;
    }
}
