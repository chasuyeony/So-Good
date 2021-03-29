package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class PhotoPrint extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.print_photoprint);

    }


    public void publog(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.publog.co.kr/sub_printing_s3/section.asp"));
        startActivity(myIntent);
    }

    public void photomon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.photomon.com/printing/index.asp"));
        startActivity(myIntent);
    }

    public void photocube(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fotocube.com/goods/list.php?catno=001001"));
        startActivity(myIntent);
    }
    public void snaps(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("hhttp://www.snaps.kr/store/products/product_normal_photo.jsp#photoprint_size"));
        startActivity(myIntent);
    }
    public void zzix(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.zzixx.com/photoprint/photo_print.html"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
