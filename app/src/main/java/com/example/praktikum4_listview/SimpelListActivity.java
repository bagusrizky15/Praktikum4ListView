package com.example.praktikum4_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;

public class SimpelListActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] players = new String[]{
            "Baba", "Paulo" ,"Dybala", "Ronaldo", "Messi", "Lenon", "Bio",
            "Cristiano Ronaldo", "Paulo Dybala", "Mario Mandžukić",
            "Miralem Pjanić", "Sami Khedira", "Emre Can", "Claudio Marchisio",
            "Medhi Benatia", "Giorgio Chiellini", "Leonardo Bonuci",
            "Wojciech Szczęsny"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpel_list);
        lvItem = (ListView) findViewById(R.id.lv_simpel);
        ArrayAdapter<String> Simpeladapter = new ArrayAdapter<String>(SimpelListActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, players);

        lvItem.setAdapter(Simpeladapter);
    }

}