package com.gigamole.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Polaroid_p extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.print_polaroid);

    }


    public void photocube(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fotocube.com/goods/list.php?catno=001005004"));
        startActivity(myIntent);
    }

    public void publog(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.publog.co.kr/sub_printing_s2/pola.asp"));
        startActivity(myIntent);
    }

    public void photomon(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.photomon.com/printing/Template/TempList.asp?CateIDX=1"));
        startActivity(myIntent);
    }

    public void close(View v) {
        super.onPause();
        finish();
    }


}
