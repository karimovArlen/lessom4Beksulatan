package com.example.lessom4_beksulatan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private com.example.lessom4_beksulatan.Adapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<com.example.lessom4_beksulatan.Country> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        creatList();
        initRecucler();

    }

    private void creatList() {
        int id = getIntent().getIntExtra("key1", 1);
        if (111 == id) {


        } else if (222 == id) {
            arrayList.add(new com.example.lessom4_beksulatan.Country(R.drawable.ic_algir, "Algir", "Algir"));
            arrayList.add(new com.example.lessom4_beksulatan.Country(R.drawable.ic_angola, "Angola", "Launda"));
            arrayList.add(new com.example.lessom4_beksulatan.Country(R.drawable.ic_benin, "Benin", "Porto"));
            arrayList.add(new com.example.lessom4_beksulatan.Country(R.drawable.ic_burundu, "Burundu", "Bujumburu"));
            arrayList.add(new com.example.lessom4_beksulatan.Country(R.drawable.ic_komory, "Komoro", "Moroni"));


        } else if (333 == id) {

        } else if (444 == id) {

        } else if (555 == id) {

        } else if (666 == id) {

        }
    }

    private void initRecucler() {
        recyclerView = findViewById(R.id.r_of_continents);
        adapter = new com.example.lessom4_beksulatan.Adapter();
        adapter.setList(arrayList);
        recyclerView.setAdapter(adapter);


    }}
