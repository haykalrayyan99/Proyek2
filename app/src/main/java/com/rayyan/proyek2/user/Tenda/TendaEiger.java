package com.rayyan.proyek2.user.Tenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rayyan.proyek2.R;

public class TendaEiger extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek_tenda_eiger;
    private TextView harga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenda_eiger);
        nameInput = findViewById(R.id.input_name);
        merek_tenda_eiger = findViewById(R.id.merek);
        harga = findViewById(R.id.harga);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk);
        outputText2 = findViewById(R.id.hrg);
    }

    public void healderSumbit(View view) {
        String name = nameInput.getText().toString();
        String x = merek_tenda_eiger.getText().toString();
        String z = harga.getText().toString();
        if (!name.equals("")) {
            outputText.setText("Nama Pembeli : "+ name);
            outputText1.setText("Merek : " + x);
            outputText2.setText("Harga : " + z);
        } else {
            Toast.makeText(this, "Masukkan Nama Anda!", Toast.LENGTH_SHORT).show();
        }
    }
}