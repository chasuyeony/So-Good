package com.gigamole.sample;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PostIt_p extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postit);

    }

    public void ezland(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adsland.com/shop/auto.php?smart=postit&lm=11"));
        startActivity(myIntent);
    }


    public void close(View v) {
        super.onPause();
        finish();
    }


}
