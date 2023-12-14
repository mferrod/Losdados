package com.politecnicomalaga.dadospoo.model;

public class Partida {
    private Jugador j1;
    private Jugador j2;
    public Partida() {
        j1 = new Jugador();
        j2 = new Jugador();
        seJuega();
    }
    public String[] resultados() {
        String[] f = new String[3];

        f[0] = "Jugador 1:\n" + "Ha ganado: " + j1.getPartidasGanadas() +
                "\nHa empatado: " + j1.getPartidasEmpatadas() +
                "\nHa perdido: " + j1.getPartidasPerdidas() + "\n";
        f[1] = "Jugador 2:\n" + "Ha ganado: " + j2.getPartidasGanadas() +
                "\nHa empatado: " + j2.getPartidasEmpatadas() +
                "\nHa perdido: " + j2.getPartidasPerdidas() + "\n";
        if (j1.getPartidasGanadas() > j2.getPartidasGanadas())
            f[2] = "GANADOR EL JUGADOR 1 CON " + j1.getPartidasGanadas() + " VICTORIAS";
        else if (j2.getPartidasGanadas() > j1.getPartidasGanadas())
            f[2] = "GANADOR EL JUGADOR 2 CON " + j2.getPartidasGanadas() + " VICTORIAS";
        else
            f[2] = "NO HAY NINGUN GANADOR";
        return (f);
    }
    private void seJuega() {
        for (int i = 0; i < 3; i++) {
            j1.tirar();
            j2.tirar();
        }
    }
}
