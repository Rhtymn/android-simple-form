package com.example.formregistrasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView datanama, datatempat, datattl;
    Button btnBack;

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent i = getIntent();
        String nama = i.getStringExtra("nama");
        String tempat = i.getStringExtra("tempat");
        String date = i.getStringExtra("date");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        datanama = findViewById(R.id.dataNama);
        datatempat = findViewById(R.id.datatempat);
        datattl = findViewById(R.id.datattl);
        btnBack = findViewById(R.id.btnBack);

        datanama.setText(nama);
        datatempat.setText(tempat);
        datattl.setText(date);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity2.this, Activity1.class);
                startActivity(i);
            }
        });
    }
}