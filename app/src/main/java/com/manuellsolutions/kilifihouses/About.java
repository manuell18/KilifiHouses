package com.manuellsolutions.kilifihouses;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class About extends AppCompatActivity {

    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);



    }

    private void addListenerOnButton() {

        imgButton = (ImageButton) findViewById
                (R.id.facebook);

        imgButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.facebook.com.";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });
    }


    private void addListenerOnButton1() {


        imgButton = (ImageButton) findViewById
                (R.id.twitter);
        addListenerOnButton();

        imgButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.twitter.com.";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }



    private void addListenerOnButton3() {

        imgButton = (ImageButton) findViewById
                (R.id.gmail);

        imgButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://google.gmail.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}

  /*  private void addListenerOnButton3() {

        imgButton = (ImageButton) findViewById
                (R.id.gmail);

        imgButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://google.gmail.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}*/
