package com.manuellsolutions.kilifihouses;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    public static FragmentTransaction fragmentTransaction;
    public static Fragment startFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startFragment = new BedsitterFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.mainContent, startFragment, "bed_sitter")
                .commit();

        String location = getIntent().getStringExtra("location");
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        Fragment fragment;
                        switch (item.getItemId()) {
                            case R.id.bedsitter:
                                fragment = new BedsitterFragment();
                                changeFragment(fragment, "bedsitter");
                                break;
                            case R.id.single:
                                fragment = new SingleFragment();
                                changeFragment(fragment, "single");
                                break;
                            case R.id.hostel:
                                fragment = new HostelFragment();
                                changeFragment(fragment, "hostel");
                                break;
                        }
                        return true;
                    }
                });

    }

    private void changeFragment(Fragment fragment, String name) {
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.mainContent, fragment, name)
                .commit();
    }

}