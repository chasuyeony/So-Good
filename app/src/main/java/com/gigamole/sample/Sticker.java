package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class Sticker extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sticker);

    }


    public void moringprint(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.morningprint.co.kr/product/order_detail.php?gid=169"));
        startActivity(myIntent);
    }

    public void tara(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tarapod.co.kr/photo_order/sticker_spec.html?serial=&tp_code=TPA003&p_code=POA009&bn_mode=&pg_code=&order_mode=template&menu_mode="));
        startActivity(myIntent);
    }

    public void paperworld(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.15448214.com/front/php/category.php?cate_no=115"));
        startActivity(myIntent);
    }

    public void uni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://uniquemade.co.kr/product/list.html?cate_no=24"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
