package com.example.gaston.rickyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gaston.rickyapp.model.Lugar;

import com.example.gaston.rickyapp.model.Caso;
import com.example.gaston.rickyapp.model.PistaAdapter;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;



public class MostrarPistaActivity extends AppCompatActivity{

    private PistaAdapter pista;
    private Lugar lugar;
    private TextView infoPista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostar_pistas);
        if(getIntent().getExtras() != null) {
            this.actualizarDatos();
        }
    }

    private void actualizarDatos() {
        infoPista = (TextView) findViewById(R.id.infoPista);
        pista = (PistaAdapter) getIntent().getExtras().get("pista");
        infoPista.setText(pista.getPista());
        lugar = (Lugar) getIntent().getExtras().get("lugar");
        TextView nombreLugar = (TextView) findViewById(R.id.nombreLugar) ;
        nombreLugar.setText(lugar.getNombre());

    }

    private void accept(View view){
        this.finish();
    }

}
