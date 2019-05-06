package com.manuellsolutions.kilifihouses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;



public class LocationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        GridLayout gridlayout = (GridLayout) findViewById(R.id.mainGrid);

        gridClickActivity(gridlayout);

    }

    private void gridClickActivity(GridLayout gridlayout) {
        for (int i = 0; i<gridlayout.getChildCount(); i++){
            CardView mCardView = (CardView)gridlayout.getChildAt(i);
            final int index = i;
            mCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (index){
                        case 0:
                            Intent openMainActivityForKibaoni = new Intent(LocationActivity.this,MainActivity.class);
                            openMainActivityForKibaoni.putExtra("location", "kibaoni");
                            startActivity(openMainActivityForKibaoni);
                            break;
                        case 1:
                            Intent openMainActivityForMtaani = new Intent(LocationActivity.this,MainActivity.class);
                            openMainActivityForMtaani.putExtra("location", "mtaani");
                            startActivity(openMainActivityForMtaani);
                            break;
                        case 2:
                            Intent openMainActivityForMisufini = new Intent(LocationActivity.this,MainActivity.class);
                            openMainActivityForMisufini.putExtra("location", "misufini");
                            startActivity(openMainActivityForMisufini);
                            break;
                        case 3:
                            Intent openMainActivityForMarembo = new Intent(LocationActivity.this,MainActivity.class);
                            openMainActivityForMarembo.putExtra("location", "marembo");
                            startActivity(openMainActivityForMarembo);
                            break;
                    }

                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent openAboutPage = new Intent(LocationActivity.this, About.class);
            startActivity(openAboutPage);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


