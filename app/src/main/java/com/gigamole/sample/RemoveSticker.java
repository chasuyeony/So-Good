package com.gigamole.sample;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class RemoveSticker extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_removesticker);

    }

    public void redprinting(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redprinting.co.kr/product/item/ST/STMAOTP"));
        startActivity(myIntent);
    }
    public void snaps(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.snaps.kr/store/products/product_printOctopus.jsp"));
        startActivity(myIntent);
    }


    public void close(View v) {
        super.onPause();
        finish();
    }


}
