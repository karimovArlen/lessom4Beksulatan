package com.example.lessom4_beksulatan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Country> arrayList;
    private Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createFlags();
        initrv();
        setClick();
        createRegion();

    }

    private void createRegion() {

    }

    private void setClick() {
        adapter.setListener(country -> {

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("key1", country.getId());
            startActivity(intent);
        });
    }



    private void createFlags() {
        arrayList = new ArrayList<>();
        arrayList.add(new Country(R.drawable.ic_eurasia,"Eurasia","", 111));

        arrayList.add(new Country(R.drawable.ic_africa,"Africa","", 222));

        arrayList.add(new Country(R.drawable.ic_n_america,"North America","", 333));

        arrayList.add(new Country(R.drawable.ic_s_amerika,"South America","",444));

        arrayList.add(new Country(R.drawable.ic_australia,"Australia","",555));

        arrayList.add(new Country(R.drawable.ic_antarctida,"Antarktica","",666));

    }

    private void initrv() {
        RecyclerView recyclerView = findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.setList(arrayList);
        recyclerView.setAdapter(adapter);
    }


}