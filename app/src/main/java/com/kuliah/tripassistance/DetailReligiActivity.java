package com.kuliah.tripassistance;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.kuliah.tripassistance.model.ModelReligi;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class DetailReligiActivity extends AppCompatActivity {

    Toolbar tbDetailReligi;
    TextView tvNamaReligi, tvDescReligi;
    ImageView imgReligi;
    String idReligi, NamaReligi, Desc;
    ModelReligi modelReligi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_religi);

        tbDetailReligi = findViewById(R.id.tbDetailReligi);
        tbDetailReligi.setTitle("Detail Religi");
        setSupportActionBar(tbDetailReligi);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        modelReligi = (ModelReligi) getIntent().getSerializableExtra("detailReligi");
        if (modelReligi != null) {
            idReligi = modelReligi.getIdReligi();
            NamaReligi = modelReligi.getTxtNamaReligi();

            //set Id
            imgReligi = findViewById(R.id.imgReligi);
            tvNamaReligi = findViewById(R.id.tvNamaReligi);
            tvDescReligi = findViewById(R.id.tvDescReligi);

            //get Image
            Glide.with(this)
                    .load(modelReligi.getGambarReligi())
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(imgReligi);

//            getDetailReligi();
        }
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

