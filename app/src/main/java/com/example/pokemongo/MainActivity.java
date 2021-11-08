package com.example.pokemongo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rec1;
    String s1[],s2[];
    int imageResource[]={R.drawable.pikachu,R.drawable.bulbasur,R.drawable.squirtle,R.drawable.meow,R.drawable.lizard,R.drawable.chameleon,R.drawable.anaconda};

    MyOwnAdapter adt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //myRevi kita gunakan untuk menampilkan data
        rec1 = (RecyclerView)findViewById(R.id.myRevi);

        s1 = getResources().getStringArray(R.array.nama_pokemon);
        s2 = getResources().getStringArray(R.array.des_pokemon);

        //cetak objeknya dari kelas MyOwnAdapter
        adt = new MyOwnAdapter(this, s1,s2,imageResource);
        rec1.setAdapter(adt);
        rec1.setLayoutManager(new LinearLayoutManager(this));

    }
}