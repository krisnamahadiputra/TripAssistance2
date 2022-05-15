package com.kuliah.tripassistance;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kuliah.tripassistance.adapter.ReligiAdapter;
import com.kuliah.tripassistance.model.ModelReligi;
import com.kuliah.tripassistance.ornament.OrnamentLayoutMargin;

import java.util.ArrayList;
import java.util.List;

public class ReligiActivity extends AppCompatActivity implements ReligiAdapter.onSelectData {

    RecyclerView rvReligi;
    OrnamentLayoutMargin gridMargin;
    ReligiAdapter religiAdapter;
    ProgressDialog progressDialog;
    List<ModelReligi> modelReligi = new ArrayList<>();
    Toolbar tbReligi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religi);

        tbReligi = findViewById(R.id.toolbarReligi);
        tbReligi.setTitle("Daftar Religi Bali");
        setSupportActionBar(tbReligi);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Mohon Tunggu");
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Sedang menampilkan data...");

        rvReligi = findViewById(R.id.rvReligi);
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,
                2, RecyclerView.VERTICAL, false);
        rvReligi.setLayoutManager(mLayoutManager);
        gridMargin = OrnamentLayoutMargin(2, Tools.dp2px(this, 4));
        rvReligi.addItemDecoration(gridMargin);
        rvReligi.setHasFixedSize(true);

    };

    private void showReligi() {
        religiAdapter = new ReligiAdapter(ReligiActivity.this, modelReligi, this);
        rvReligi.setAdapter(religiAdapter);
    }

    @Override
    public void onSelected(ModelReligi modelReligi) {
        Intent intent = new Intent(ReligiActivity.this, DetailReligiActivity.class);
        intent.putExtra("detailReligi", modelReligi);
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

