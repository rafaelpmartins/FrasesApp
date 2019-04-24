package com.example.frasesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.resultadoTexto);

        String[] Frase = {"Que o vento leve o necessário e me traga o suficiente.",
                "Algumas vezes coisas ruins acontecem em nossas vidas para nos colocar na direção das melhores coisas que poderíamos viver.",
                "Nunca saberemos o quão forte somos até que ser forte seja a única escolha.",
                "Ser feliz não é viver apenas momentos de alegria. É ter coragem de enfrentar os momentos de tristeza e sabedoria para transformar os problemas em aprendizado.",
                "Se a caminhada está difícil, é porque você está no caminho certo."};

       int numero = new Random().nextInt(Frase.length);
       texto.setText(Frase[numero]);

    }
}
