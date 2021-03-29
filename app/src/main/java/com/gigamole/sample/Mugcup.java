package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class Mugcup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pancy_mugcup);

    }

    public void ecopy(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ecopyzone.com/shop/goods/goods_list.php?&category=138004"));
        startActivity(myIntent);
    }

    public void huni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huniprinting.com/goods/view.asp?pcode=111"));
        startActivity(myIntent);
    }

    public void zzomul(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jjomool.com/front/php/category.php?cate_no=97"));
        startActivity(myIntent);
    }

    public void sangsang(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sketch3323.com/goods/view?no=283"));
        startActivity(myIntent);
    }

    public void redprinting(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redprinting.co.kr/product/item/PH/PHMGDFT"));
        startActivity(myIntent);
    }

    public void photomon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.photomon.com/store/list_all.asp?intnum=28"));
        startActivity(myIntent);
    }

    public void snaps(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.snaps.kr/store/products/search.jsp?F_SCLSS_CODE=001007006000&giftMall=1"));
        startActivity(myIntent);
    }


    public void close(View v) {
        super.onPause();
        finish();
    }


}
