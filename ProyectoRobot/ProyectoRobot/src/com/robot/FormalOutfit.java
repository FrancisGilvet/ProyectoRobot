package com.robot;

public class FormalOutfit extends Outfit {
    public FormalOutfit(String color) {
        super(color);
    }

    @Override
    public String getDescripcion() {
        return "Outfit formal de color " + getColor();
    }
}
