package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class WalletPhoto extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.print_walletphoto);

    }


    public void photocube(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fotocube.com/goods/list.php?catno=001005003"));
        startActivity(myIntent);
    }

    public void photomon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.photomon.com/printing/Template/TempList.asp?CateIDX=17"));
        startActivity(myIntent);
    }

    public void redprinting(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redprinting.co.kr/product/item/PH/PHPKDFT"));
        startActivity(myIntent);
    }

    public void publog(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.publog.co.kr/sub_printing_s2/wall.asp"));
        startActivity(myIntent);
    }

    public void snaps(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.snaps.kr/store/products/product_walletPhoto.jsp"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
