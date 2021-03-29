package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Calender_p extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.print_calender);

    }
    public void redprinting(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redprinting.co.kr/product/item/PH/PHCLDFT"));
        startActivity(myIntent);
    }
    public void snaps2(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.snaps.kr/store/products/product_desktop.jsp"));
        startActivity(myIntent);
    }
    public void publog(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.publog.co.kr/sub_calendar_s4/section_mini.asp"));
        startActivity(myIntent);
    }
    public void huni2(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huniprinting.com/product/list.asp?pcode=35"));
        startActivity(myIntent);
    }
    public void sodaprint(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sodaprint.kr/ORDER_POD/POD_goods.php?cate_code=26171600&goods_no=198"));
        startActivity(myIntent);
    }
    public void tara(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tarapod.co.kr/photo_order/order_template.html?mode=all&win_mode=&tp_code=TPA005&p_code=POA004"));
        startActivity(myIntent);
    }
    public void photocube(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fotocube.com/goods/list.php?catno=006002"));
        startActivity(myIntent);
    }

    public void huni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huniprinting.com/product/list.asp?pcode=45"));
        startActivity(myIntent);
    }

    public void photomon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.photomon.com/store/list.asp?intnum=276&calType=wall&fCode=10031016"));
        startActivity(myIntent);
    }

    public void snaps(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.snaps.kr/store/products/product_wall.jsp"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}