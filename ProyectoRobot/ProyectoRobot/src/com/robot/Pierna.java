package com.robot;

public class Pierna {
    private int longitud;
    private boolean funcional;

    public Pierna(int longitud, boolean funcional) {
        this.longitud = longitud;
        this.funcional = funcional;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }

    public void caminar() {
        if (funcional) {
            System.out.println("Caminando.");
        } else {
            System.out.println("La pierna no es funcional.");
        }
    }
}
