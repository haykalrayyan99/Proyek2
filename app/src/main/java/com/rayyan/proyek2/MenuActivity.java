package com.rayyan.proyek2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void healderDataBarang(View view) {
        Intent intent = new Intent(this, dataBarang.class);
        startActivity(intent);
        Toast.makeText(this, "Barang Cliked", Toast.LENGTH_SHORT).show();

    }

    public void healderLogout(View view) {
        Intent intent = new Intent( MenuActivity.this, LoginActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Logout Cliked", Toast.LENGTH_SHORT).show();

    }

    public void healderLaporan(View view) {
        Intent intent = new Intent(this, transaksi.class);
        startActivity(intent);
        Toast.makeText(this, "Transaksi Cliked", Toast.LENGTH_SHORT).show();
    }

}
