package com.dylanfelgenhauer.coffeeshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.opt_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getTitle().equals("Menu")) {
            startActivity(new Intent(CheckoutActivity.this, MenuActivity.class));
        }
        if (item.getTitle().equals("Cart")) {
            startActivity(new Intent(CheckoutActivity.this, CartActivity.class));
        }
        if (item.getTitle().equals("Manage")) {
            startActivity(new Intent(CheckoutActivity.this, ManageActivity.class));
        }
        if (item.getTitle().equals("Checkout")) {
            startActivity(new Intent(CheckoutActivity.this, CheckoutActivity.class));
        }
        if (item.getTitle().equals("Profile")) {
            startActivity(new Intent(CheckoutActivity.this, ProfileActivity.class));
        }
        if (item.getTitle().equals("Settings")) {
            startActivity(new Intent(CheckoutActivity.this, SettingsActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}