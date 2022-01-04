package com.vv.bioapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"deviindriyanaputri@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
        }

    public void cellphone(View view) {
        Uri uri = Uri.parse("tel:082332606772");
        Intent it = new Intent (Intent.ACTION_VIEW, uri );
        startActivity(it);

    }
   //-6.7565519,111.0661731
   public void showMap(View view) {
       Uri uri = Uri.parse("geo:-6.7565519,111.0661731");
       Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri );
       startActivity(it);

   }

}