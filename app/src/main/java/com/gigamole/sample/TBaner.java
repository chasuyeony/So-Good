package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class TBaner extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbaner);

    }


    public void redprinting(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sketch3323.com/goods/view?no=230"));
        startActivity(myIntent);
    }


    public void close(View v) {
        super.onPause();
        finish();
    }


}
