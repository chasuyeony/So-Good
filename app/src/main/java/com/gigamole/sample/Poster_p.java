package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Poster_p extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.print_poster);

    }


    public void snaps(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.snaps.kr/store/products/product_big_design_photo.jsp"));
        startActivity(myIntent);
    }

    public void photocube(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fotocube.com/goods/list.php?catno=001002"));
        startActivity(myIntent);
    }

    public void redprinting(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redprinting.co.kr/product/item/PR/PRPOXXX"));
        startActivity(myIntent);
    }

    public void photomon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.photomon.com/printing/largesize/flex_BigImagePrint.asp?productKind=largeprint&paper=print"));
        startActivity(myIntent);
    }

    public void zzix(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.photomon.com/printing/largesize/flex_BigImagePrint.asp?productKind=largeprint&paper=print"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
