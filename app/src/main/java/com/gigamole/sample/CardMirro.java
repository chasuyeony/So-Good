package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class CardMirro extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_mirro);

    }

    public void uni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://uniquemade.co.kr/product/list.html?cate_no=55"));
        startActivity(myIntent);
    }

    public void huni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huniprinting.com/goods/view.asp?pcode=113"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
