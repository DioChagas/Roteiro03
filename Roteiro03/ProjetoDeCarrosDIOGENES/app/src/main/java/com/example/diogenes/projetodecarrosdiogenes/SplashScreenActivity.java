package com.example.diogenes.projetodecarrosdiogenes;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class SplashScreenActivity extends AppCompatActivity implements Runnable {


    private final int TEMPO = 3000;

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
    private void ocultarBarraDeNavegacao(){
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ocultarBarraDeNavegacao();

        Handler mudancaTela = new Handler();
        mudancaTela.postDelayed(this,TEMPO);

    }

    @Override
    public void run() {
        Intent intencao = new Intent(this,MainActivity.class);
        startActivity(intencao);
        finish();
    }
}
