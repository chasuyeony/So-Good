package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Fan_p extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pancy_fan);

    }


    public void ezland(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adsland.com/shop/auto.php?smart=fan&lm=14"));
        startActivity(myIntent);
    }

    public void printcity(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.printcity.co.kr/order/season02/order_step01.asp"));
        startActivity(myIntent);
    }

    public void sungwon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swadpia.co.kr/goods/goods_view/CPS1000/GPS1001"));
        startActivity(myIntent);
    }


    public void close(View v) {
        super.onPause();
        finish();
    }


}
