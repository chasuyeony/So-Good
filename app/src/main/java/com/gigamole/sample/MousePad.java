package com.gigamole.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MousePad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_mouse_pad );
    }
    public void mou(View v) {
        Intent myIntent = new Intent(getApplicationContext(), // 현재 화면의 제어권자
                MousePad_p.class);
        startActivity(myIntent);
    }
}
