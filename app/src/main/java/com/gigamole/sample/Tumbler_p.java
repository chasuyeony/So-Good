package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Tumbler_p extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pancy_tumbler);

    }

    public void sangsang(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sketch3323.com/goods/view?no=120"));
        startActivity(myIntent);
    }

    public void sangsangice(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sketch3323.com/goods/view?no=275"));
        startActivity(myIntent);
    }

    public void sangsangsten(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sketch3323.com/goods/view?no=277"));
        startActivity(myIntent);
    }

    public void zzomul(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jjomool.com/front/php/category.php?cate_no=96"));
        startActivity(myIntent);
    }

    public void photomon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.photomon.com/store/list_all.asp?intnum=311"));
        startActivity(myIntent);
    }

    public void snaps(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.snaps.kr/store/products/search.jsp?F_SCLSS_CODE=001007008000&giftMall=1"));
        startActivity(myIntent);
    }

    public void huni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huniprinting.com/goods/view.asp?pcode=120"));
        startActivity(myIntent);
    }


    public void close(View v) {
        super.onPause();
        finish();
    }


}
