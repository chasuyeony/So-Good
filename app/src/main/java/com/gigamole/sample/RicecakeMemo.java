package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class RicecakeMemo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ricecakememo);

    }

    public void printcity(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.printcity.co.kr/order/notepad01/order_step01.asp"));
        startActivity(myIntent);
    }
    public void sungwon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swadpia.co.kr/goods/goods_view/CNR3000/GNR3001"));
        startActivity(myIntent);
    }
    public void ezland(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adsland.com/shop/auto.php?smart=memo&lm=03"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
