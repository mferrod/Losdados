package com.politecnicomalaga.dadospoo.model;

import com.politecnicomalaga.dadospoo.model.Tirada;

public class Jugador {
    private int partidasGanadas;
    private int partidasPerdidas;
    private int partidasEmpatadas;

    public Jugador() {
        this.partidasPerdidas = 0;
        this.partidasEmpatadas = 0;
        this.partidasGanadas = 0;
    }

    public int getPartidasGanadas() {
        return this.partidasGanadas;
    }
    public int getPartidasPerdidas() {
        return this.partidasPerdidas;
    }
    public int getPartidasEmpatadas() {
        return this.partidasEmpatadas;
    }
    public void addPartidaGanada() {
        this.partidasGanadas++;
    }
    public void addPartidaEmpatada() {
        this.partidasEmpatadas++;
    }
    public void addPartidaPerdida() {
        this.partidasPerdidas++;
    }
    public void tirar() {
        Tirada tirada = new Tirada();
        tirada.jugadorTira(this);
    }
}
