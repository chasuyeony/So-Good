package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PinButton_p extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pancy_pinbutton);

    }

    public void huni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huniprinting.com/goods/view.asp?pcode=112"));
        startActivity(myIntent);
    }
    public void uni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://uniquemade.co.kr/product/list.html?cate_no=42"));
        startActivity(myIntent);
    }
    public void zzomul(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jjomool.com/front/php/category.php?cate_no=92"));
        startActivity(myIntent);
    }
    public void redprinting(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redprinting.co.kr/product/item/BT/BTPNXXX"));
        startActivity(myIntent);
    }
    public void close(View v) {
        super.onPause();
        finish();
    }


}
