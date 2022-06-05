package com.kuliah.tripassistance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.kuliah.tripassistance.adapter.ListMainAdapter;
import com.kuliah.tripassistance.model.ModelMain;
import com.kuliah.tripassistance.model.ModelMainData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLayanan;
    private ArrayList<ModelMain> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLayanan = findViewById(R.id.rvMainMenu);
        rvLayanan.setHasFixedSize(true);

        list.addAll(ModelMainData.getListData());
        showRecyclerList();
        /*
        Button tes = findViewById(R.id.buttonTes);
        tes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent inten = new Intent(MainActivity.this, ReligiActivity.class);
                startActivity(inten);
            }
        });
         */
    }
    private void showRecyclerList(){
        rvLayanan.setLayoutManager(new LinearLayoutManager(this));
        ListMainAdapter listMainAdapter = new ListMainAdapter(list);
        rvLayanan.setAdapter(listMainAdapter);

        listMainAdapter.setOnItemClickCallback(new ListMainAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ModelMain data) {
                showSelectedLayanan(data);

                /*
                Intent moveIntent = new Intent(MainActivity.this, ReligiActivity.class);
                startActivity(moveIntent);
                 */

                if(data.getNama_layanan().equals("Wisata Religi")){
                    Intent religiIntent = new Intent(MainActivity.this, ReligiActivity.class);
                    startActivity(religiIntent);
                }
                if(data.getNama_layanan().equals("Wisata Alam")){
                    Intent alamIntent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(alamIntent);
                }

            }
        });
    }
    private void showSelectedLayanan(ModelMain modelMain){
        Toast.makeText(this,"Anda memilih " + modelMain.getNama_layanan(),Toast.LENGTH_SHORT).show();
    }

}