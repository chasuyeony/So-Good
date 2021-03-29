package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class CircleMirro extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circlemirro);

    }

    public void uni(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://uniquemade.co.kr/product/list.html?cate_no=60"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
