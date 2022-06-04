package com.kuliah.tripassistance;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
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
    }
    private void showRecyclerList(){
        rvLayanan.setLayoutManager(new LinearLayoutManager(this));
        ListMainAdapter listMainAdapter = new ListMainAdapter(list);
        rvLayanan.setAdapter(listMainAdapter);
    }
}


