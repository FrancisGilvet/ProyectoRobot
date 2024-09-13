package com.robot;

public class Cabeza {
    private boolean ojosFuncionando;
    private boolean bocaFuncionando;

    public Cabeza(boolean ojosFuncionando, boolean bocaFuncionando) {
        this.ojosFuncionando = ojosFuncionando;
        this.bocaFuncionando = bocaFuncionando;
    }

    public boolean isOjosFuncionando() {
        return ojosFuncionando;
    }

    public void setOjosFuncionando(boolean ojosFuncionando) {
        this.ojosFuncionando = ojosFuncionando;
    }

    public boolean isBocaFuncionando() {
        return bocaFuncionando;
    }

    public void setBocaFuncionando(boolean bocaFuncionando) {
        this.bocaFuncionando = bocaFuncionando;
    }

    public void hablar() {
        if (bocaFuncionando) {
            System.out.println("El robot está hablando.");
        } else {
            System.out.println("La boca no está funcionando.");
        }
    }
}
