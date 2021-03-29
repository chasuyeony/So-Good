package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MetalSticker extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_metasticker);

    }


    public void sungwon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swadpia.co.kr/goods/goods_view/CST4000/GST4001"));
        startActivity(myIntent);
    }

    public void ezland(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adsland.com/shop/auto.php?smart=metal&sp=5&lm=13"));
        startActivity(myIntent);
    }

    public void moringprint(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.morningprint.co.kr/product/order_detail.php?gid=169"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
