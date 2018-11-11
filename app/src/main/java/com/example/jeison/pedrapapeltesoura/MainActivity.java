package com.example.jeison.pedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        this.opcaoSlecionada("pedra");
    }
    public void selecionarPapel(View view){
        this.opcaoSlecionada("papel");
    }
    public void selecionarTesoura(View view){
        this.opcaoSlecionada("Tesoura");
    }
    public void opcaoSlecionada(String escolha){
        ImageView imagem=findViewById(R.id.imageResultado);
        TextView textoResultado=findViewById(R.id.resultado);
        String[] opcoes={"pedra","papel","Tesoura"};
        int numero = new Random().nextInt(3);
        String escolaApp=opcoes[numero];
        switch (escolaApp){
            case "pedra":
                imagem.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagem.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                imagem.setImageResource(R.drawable.tesoura);
                break;
        }
        if((escolha.equals("papel") && escolaApp.equals("Tesoura"))||(escolha.equals("pedra")&&escolaApp.equals("papel"))||(escolha.equals("Tesoura")&&escolaApp.equals("pedra"))){
            textoResultado.setText("Você Perdeu :(");
        }else if((escolha.equals("Tesoura") && escolaApp.equals("papel"))||(escolha.equals("papel")&&escolaApp.equals("pedra"))||(escolha.equals("pedra")&&escolaApp.equals("Tesoura"))){
            textoResultado.setText("Você Ganhou :)");
        } else{
            textoResultado.setText("Empate :|");
        }
    }

}
