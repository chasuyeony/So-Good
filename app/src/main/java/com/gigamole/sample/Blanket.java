package com.gigamole.sample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Blanket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanket);
    }

    public void damyo(View v) {
        Intent myIntent = new Intent(getApplicationContext(), // 현재 화면의 제어권자
                Damyo.class);
        startActivity(myIntent);
    }
}
