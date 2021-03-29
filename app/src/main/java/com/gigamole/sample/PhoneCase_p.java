package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PhoneCase_p extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pancy_phonecase);

    }

    public void goodsmate(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://goodsmate.net/"));
        startActivity(myIntent);
    }

    public void publog(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.publog.co.kr/sub_mobile_cover/section.asp"));
        startActivity(myIntent);
    }

    public void huni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huniprinting.com/goods/view.asp?pcode=121"));
        startActivity(myIntent);
    }

    public void photomon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.photomon.com/store/list_all.asp?intnum=360"));
        startActivity(myIntent);
    }

    public void snaps(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.snaps.kr/store/products/search.jsp?F_SCLSS_CODE=001007004000&giftMall=1"));
        startActivity(myIntent);
    }




    public void close(View v) {
        super.onPause();
        finish();
    }


}
