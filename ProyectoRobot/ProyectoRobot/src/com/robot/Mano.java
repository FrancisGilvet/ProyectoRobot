package com.robot;

public class Mano {
    private int dedos;
    private boolean funcional;

    public Mano(int dedos, boolean funcional) {
        this.dedos = dedos;
        this.funcional = funcional;
    }

    public int getDedos() {
        return dedos;
    }

    public void setDedos(int dedos) {
        this.dedos = dedos;
    }

    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }

    public void moverDedos() {
        if (funcional) {
            System.out.println("Moviendo los dedos.");
        } else {
            System.out.println("La mano no es funcional.");
        }
    }
}
