package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class Note extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

    }

    public void uni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://uniquemade.co.kr/product/list.html?cate_no=48"));
        startActivity(myIntent);
    }
    public void redprinting(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redprinting.co.kr/product/item/GS/GSNTSPR"));
        startActivity(myIntent);
    }
    public void photomon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.photomon.com/store/list_all.asp?intnum=201"));
        startActivity(myIntent);
    }
    public void huni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huniprinting.com/goods/view.asp?pcode=116"));
        startActivity(myIntent);
    }
    public void close(View v) {
        super.onPause();
        finish();
    }


}
