package com.politecnicomalaga.dadospoo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.politecnicomalaga.dadospoo.R;
import com.politecnicomalaga.dadospoo.controller.Controlador;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jugar(View view) {
        Controlador.getSingleton().jugarPartida();
    }
}