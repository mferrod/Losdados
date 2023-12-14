package com.politecnicomalaga.dadospoo.controller;

//Import modelo
import com.politecnicomalaga.dadospoo.model.Partida;
import com.politecnicomalaga.dadospoo.model.Tirada;
//Import tirada
import com.politecnicomalaga.dadospoo.view.MainActivity;

public class Controlador {
    //Patrón de diseño Singleton
    private static Controlador singleton;

    //Este posee las instacancias del model. Composicion.
    private Partida p;

    //También sabe quien es la vista. LA puede tener a mano
    //es una referencia. Agregación
    private MainActivity mainActivity;

    //CONSTRUCTOR PRIVADOR: es un singleton
    private Controlador() {
        p = new Partida();
    }


    //Llamada al singleton
    public static Controlador getSingleton() {
        if (singleton == null)
            return singleton = new Controlador();
        return singleton;
    }

    public static void setActivity(MainActivity miActi) {
        singleton.mainActivity = miActi;
    }

    public void jugarPartida() {
        String[] listaTextos = new String[3];
        listaTextos = p.resultados();

        System.out.printf(listaTextos[0]);
        System.out.printf(listaTextos[1]);
        System.out.printf(listaTextos[2]);
    }
}
