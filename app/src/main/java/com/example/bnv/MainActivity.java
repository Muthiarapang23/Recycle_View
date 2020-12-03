package com.example.bnv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigationview = findViewById(R.id.bn_main);
        navigationview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id == R.id.home_menu){
                    //create three fragments
                    HomeFragment fragment = new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fl_container, fragment);
                    fragmentTransaction.commit();
                }

                if(id == R.id.search_menu){
                    //create four fragments
                    SearchFragment fragment = new SearchFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fl_container, fragment);
                    fragmentTransaction.commit();
                }

                if(id == R.id.favorite_menu){
                    //create four fragments
                    FavoriteFragment fragment = new FavoriteFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fl_container, fragment);
                    fragmentTransaction.commit();
                }
                if(id == R.id.account_menu){
                    //create four fragments
                    AccountFragment fragment = new AccountFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fl_container, fragment);
                    fragmentTransaction.commit();
                }


                return true;
            }
        });

        navigationview.setSelectedItemId(R.id.home_menu);
    }
}