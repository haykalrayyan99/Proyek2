package com.rayyan.proyek2.user.Tenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rayyan.proyek2.R;

public class tendaRei extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek5;
    private TextView harga5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenda_rei);
        nameInput = findViewById(R.id.input_name);
        merek5 = findViewById(R.id.merek5);
        harga5 = findViewById(R.id.harga5);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk5);
        outputText2 = findViewById(R.id.hrg5);
    }

    public void healderBeli(View view) {
        String name = nameInput.getText().toString();
        String x = merek5.getText().toString();
        String z = harga5.getText().toString();
        if (!name.equals("")) {
            outputText.setText("Nama Pembeli : "+ name);
            outputText1.setText("Merek : " + x);
            outputText2.setText("Harga : " + z);
        } else {
            Toast.makeText(this, "Masukkan Nama Anda!", Toast.LENGTH_SHORT).show();
        }
    }
}
