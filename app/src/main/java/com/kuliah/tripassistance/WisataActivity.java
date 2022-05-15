package com.kuliah.tripassistance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.kuliah.tripassistance.adapter.WisataAdapter;
import com.kuliah.tripassistance.model.ModelWisata;
import com.kuliah.tripassistance.ornament.OrnamentLayoutMargin;

import java.util.ArrayList;
import java.util.List;

public class WisataActivity extends AppCompatActivity implements WisataAdapter.onSelectData {

    RecyclerView rvWisata;
    OrnamentLayoutMargin gridMargin;
    WisataAdapter wisataAdapter;
    ProgressDialog progressDialog;
    List<ModelWisata> modelWisata = new ArrayList<>();
    Toolbar tbWisata;
    private Object WisataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        tbWisata = findViewById(R.id.toolbar_wisata);
        tbWisata.setTitle("Daftar Wisata Bali");
        setSupportActionBar(tbWisata);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Mohon Tunggu");
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Sedang menampilkan data...");

        rvWisata = findViewById(R.id.rvWisata);
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,
                2, RecyclerView.VERTICAL, false);
        rvWisata.setLayoutManager(mLayoutManager);
        gridMargin = new OrnamentLayoutMargin(2, Tools.dp2px(this, 4));
        rvWisata.addItemDecoration(gridMargin);
        rvWisata.setHasFixedSize(true);

    }



    private void showWisata() {
        wisataAdapter = new WisataAdapter(WisataActivity.this, modelWisata, this);
        rvWisata.setAdapter(wisataAdapter);
    }

    @Override
    public void onSelected(ModelWisata modelWisata) {
        Intent intent = new Intent(WisataActivity.this, DetailWisataActivity.class);
        intent.putExtra("detailWisata", modelWisata);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}