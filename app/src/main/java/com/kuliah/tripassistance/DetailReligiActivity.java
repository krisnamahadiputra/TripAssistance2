package com.kuliah.tripassistance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailReligiActivity extends AppCompatActivity {

    private TextView tvNamaTempat, tvDescTempat;
    private ImageView ivGambarTempat;
    private String yNama;
    private String yDeskripsi;
    private int yFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_religi);

        initView();

        Bundle terima = getIntent().getExtras();
        yNama = terima.getString("namaTempatReligi");
        yDeskripsi = terima.getString("descTempatReligi");
        yFoto = terima.getInt("fotoReligi");

        tvNamaTempat.setText(yNama);
        tvDescTempat.setText(yDeskripsi);
        ivGambarTempat.setImageResource(yFoto);
    }

    private void initView(){
        tvNamaTempat = findViewById(R.id.tvNamaReligi);
        tvDescTempat = findViewById(R.id.tvDescReligi);
        ivGambarTempat = findViewById(R.id.fotoReligi);
    }
}