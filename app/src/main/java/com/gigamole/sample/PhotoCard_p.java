package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PhotoCard_p extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phothocard_photocard);

    }


    public void sungwon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swadpia.co.kr/goods/goods_view/CNC1000/GNC1001"));
        startActivity(myIntent);
    }

    public void ezland(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adsland.com/shop/auto.php?smart=namecard&sp=1&lm=06"));
        startActivity(myIntent);
    }

    public void printcity(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.printcity.co.kr/order/nc01/order_step01.asp"));
        startActivity(myIntent);
    }

    public void moringprint(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.morningprint.co.kr/product/card.php?acode=18"));
        startActivity(myIntent);
    }

    public void sodaprint(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sodaprint.kr/ORDER_POD/POD_goods.php?cate_code=26110100&goods_no=11&mode=POD"));
        startActivity(myIntent);
    }

    public void huni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huniprinting.com/product/list.asp?pcode=26"));
        startActivity(myIntent);
    }

    public void tara(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tarapod.co.kr/photo_order/businesscard_spec.html?menu_mode=&tp_code=TPA001&p_code=POA007"));
        startActivity(myIntent);
    }

    public void paperworld(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.15448214.com/front/php/category.php?cate_no=109"));
        startActivity(myIntent);
    }

    public void snaps(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.snaps.kr/store/products/product_photoCard.jsp"));
        startActivity(myIntent);
    }


    public void close(View v) {
        super.onPause();
        finish();
    }


}
