package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class SqaureSticker extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqauersticker);

    }

    public void ezland(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adsland.com/shop/auto.php?smart=sticker&sp=1&lm=08"));
        startActivity(myIntent);
    }

    public void sungwon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swadpia.co.kr/goods/goods_view/CST1000/GST1001"));
        startActivity(myIntent);
    }

    public void printcity(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.printcity.co.kr/order/sticker01/order_step01.asp"));
        startActivity(myIntent);
    }

    public void redprinting(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redprinting.co.kr/product/item/ST/STCUXXX"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
