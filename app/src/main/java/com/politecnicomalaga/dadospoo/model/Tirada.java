package com.politecnicomalaga.dadospoo.model;

public class Tirada {
    private final Dados d1;
    private final Dados d2;
    public Tirada () {
        d1 = new Dados();
        d2 = new Dados();
    }

    private int tengo6() {
        if (d1.getValorDados() == 6 && d2.getValorDados() == 6)
            return (2);
        else if (d1.getValorDados() == 6 || d2.getValorDados() == 6)
            return (1);
        return (0);
    }
    private int tiradar(Tirada another) {//1 GANADA, 2 EMPATE, 0 PERDIDA
        if (this.tengo6() == 2)
            return (1);
        if (another.tengo6() == 2)
            return (0);
        if (this.tengo6() == 2 && another.tengo6() == 2)
            return (2);
        if ((d1.getValorDados() + d2.getValorDados()) == (another.d1.getValorDados() + another.d2.getValorDados()))
            return (2);
        if ((d1.getValorDados() + d2.getValorDados()) > (another.d1.getValorDados() + another.d2.getValorDados()))
            return (1);
        if ((d1.getValorDados() + d2.getValorDados()) < (another.d1.getValorDados() + another.d2.getValorDados()))
            return (0);
        if (d1.getValorDados() > another.d1.getValorDados() && d2.getValorDados() > another.d2.getValorDados())
            return (1);
        if (d1.getValorDados() < another.d1.getValorDados() && d2.getValorDados() < another.d2.getValorDados())
            return (0);
        if (d1.getValorDados() == 6 && another.d1.getValorDados() != 6 && d2.getValorDados() < another.d2.getValorDados())
            return (1);
        if (d2.getValorDados() == 6 && another.d2.getValorDados() != 6 && d1.getValorDados() < another.d1.getValorDados())
            return (1);
        if (d1.getValorDados() != 6 && another.d1.getValorDados() == 6 && d2.getValorDados() > another.d2.getValorDados())
            return (0);
        if (d2.getValorDados() != 6 && another.d2.getValorDados() == 6 && d1.getValorDados() > another.d1.getValorDados())
            return (0);
        return (0);
    }
    public void jugadorTira(Jugador jugador) {
       if (this.tiradar(new Tirada()) == 1)
           jugador.addPartidaGanada();
       else if (this.tiradar(new Tirada()) == 2)
           jugador.addPartidaEmpatada();
       else
           jugador.addPartidaPerdida();
    }
}
