package com.politecnicomalaga.dadospoo.model;

public class Dados {
    private int dados;

    public Dados() {
        this.setValorDados();
    }

    public int getValorDados() {
        return this.dados;
    }

    private void setValorDados() {
        this.dados = (int) (Math.random() * 6 + 1);
    }
}
