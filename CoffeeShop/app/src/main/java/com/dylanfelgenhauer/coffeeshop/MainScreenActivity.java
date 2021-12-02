package com.dylanfelgenhauer.coffeeshop;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainScreenActivity extends AppCompatActivity {
    private ListView drawerList;
    private ArrayList<String> activityList = new ArrayList<>();
    private String [] list = {"Shop", "Cart", "Manage"};
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        drawerLayout = findViewById(R.id.DrawerLay);
        drawerList = findViewById(R.id.Drawer);
        drawerList.setAdapter(new ArrayAdapter<>(this, R.layout.drawer_item, getDrawerList(list)));
        drawerList.setOnItemClickListener(
                (parent, view, position, id) -> {
                    drawerLayout.closeDrawer(drawerList);
                }
        );
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.drawer_open, R.string.drawer_close);
        setTitle("The Coffee Shop");
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.opt_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == 4) {
            startActivity(new Intent(MainScreenActivity.this, CheckoutActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    public ArrayList<String> getDrawerList(String [] list) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i=0;i<list.length;i++) {
            temp.add(list[i]);
        }
        return temp;
    }
}