package com.example.miguelforero.recursosdediseno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void circulo(View view) {

        Intent intent = new Intent(MainActivity.this, CirculoActivity.class);
        startActivity(intent);
    }

    public void ovalo(View view) {

        Intent intent = new Intent(MainActivity.this, OvaloActivity.class);
        startActivity(intent);
    }

    public void cuadrado(View view) {

        Intent intent = new Intent(MainActivity.this, CuadradoActivity.class);
        startActivity(intent);
    }

    public void rectangulo(View view) {

        Intent intent = new Intent(MainActivity.this, RecatanguloActivity.class);
        startActivity(intent);
    }

    public void libre(View view) {

        Intent intent = new Intent(MainActivity.this, DibujoLibreActivity.class);
        startActivity(intent);
    }
}
