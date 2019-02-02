package com.mangohacks.fiu.activeease;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import static com.mangohacks.fiu.activeease.R.layout.activity_main;
import static com.mangohacks.fiu.activeease.R.layout.frag_home;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.Bottom_Nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId())
                    {
                        case R.id.nav_home: selectedFragment = new Home_Frag();break;
                        case R.id.nav_map: selectedFragment = new Map_Frag();break;
                        case R.id.nav_activities: selectedFragment = new Activities_Frag();break;
                        case R.id.nav_settings: selectedFragment = new Settings_Frag();break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_con, selectedFragment).commit();
                    return true;
                }
            };
}
