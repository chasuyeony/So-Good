package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class JogJabong extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogjabong);

    }


    public void sangsang(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sketch3323.com/goods/view?no=230"));
        startActivity(myIntent);
    }

    public void ecopyzone(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ecopyzone.com/shop/goods/goods_list.php?&category=105001"));
        startActivity(myIntent);
    }


    public void close(View v) {
        super.onPause();
        finish();
    }


}
