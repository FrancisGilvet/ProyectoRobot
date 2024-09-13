package com.robot;

public class CasualOutfit extends Outfit {
    public CasualOutfit(String color) {
        super(color);
    }

    @Override
    public String getDescripcion() {
        return "Outfit casual de color " + getColor();
    }
}
