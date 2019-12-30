package com.rayyan.proyek2.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rayyan.proyek2.R;
import com.rayyan.proyek2.user.Tenda.Tenda;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
    }
    public void healderSewaTenda(View view) {
        Intent intent = new Intent(this, Tenda.class);
        startActivity(intent);
    }


    public void healderExit(View view) {
        finish();
    }
}