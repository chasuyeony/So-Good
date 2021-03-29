package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MiniBaner extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minibaner);

    }

    public void printcity(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.printcity.co.kr/order/banner06/order_step01.asp"));
        startActivity(myIntent);
    }

    public void publog(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.publog.co.kr/sub_mobile_cover/minibnr.asp?book_size=6x13&book_page_content=crd"));
        startActivity(myIntent);
    }

    public void redprintg(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redprinting.co.kr/product/item/PR/PRBNXXX"));
        startActivity(myIntent);
    }

    public void ezland(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adsland.com/shop/auto.php?smart=actual_image&sp=4&lm=16"));
        startActivity(myIntent);
    }

    public void sangsang(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sketch3323.com/goods/view?no=110"));
        startActivity(myIntent);
    }

    public void huni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huniprinting.com/product/list.asp?pcode=18"));
        startActivity(myIntent);
    }

    public void tara(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tarapod.co.kr/photo_order/banner_spec.html?serial=35&tp_code=TPA009&p_code=&bn_mode=in&pg_code=&order_mode=file"));
        startActivity(myIntent);
    }

    public void ecopy(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ecopyzone.com/shop/goods/goods_list.php?&category=105003"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
