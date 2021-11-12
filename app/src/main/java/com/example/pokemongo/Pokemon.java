package com.example.pokemongo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Pokemon extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<ModelPokemon> listPokemon;
//    RecyclerView rec1;
//    String s1[],s2[];
//    int imageResource[]={R.drawable.pikachu,R.drawable.bulbasur,R.drawable.squirtle,R.drawable.meow,R.drawable.lizard,R.drawable.chameleon,R.drawable.anaconda};
//
//    MyOwnAdapter adt;

    public Pokemon() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_pokemon, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.myRevi);
        MyOwnAdapter recyclerAdapter = new MyOwnAdapter(getContext(), listPokemon);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);

        //myRevi kita gunakan untuk menampilkan data
//        rec1 = (RecyclerView)findViewById(R.id.myRevii);
//
//        s1 = getResources().getStringArray(R.array.nama_pokemon);
//        s2 = getResources().getStringArray(R.array.des_pokemon);
//
//        //cetak objeknya dari kelas MyOwnAdapter
//        adt = new MyOwnAdapter(this, s1,s2,imageResource);
//        rec1.setAdapter(adt);
//        rec1.setLayoutManager(new LinearLayoutManager(this));
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listPokemon = new ArrayList<>();
        listPokemon.add(new ModelPokemon("pikachu","Pikachu is electric pokemon an have cute face",R.drawable.pikachu));
        listPokemon.add(new ModelPokemon("Bulbasur","Bulbasur is grass pokemon an have cute face",R.drawable.bulbasur));
        listPokemon.add(new ModelPokemon("Squirtle","Squirtle is water pokemon an have cute face",R.drawable.squirtle));
        listPokemon.add(new ModelPokemon("Meow","Meow is stole pokemon an have cute face",R.drawable.meow));
        listPokemon.add(new ModelPokemon("Lizard","Lizard is fire pokemon an have cute face",R.drawable.lizard));
        listPokemon.add(new ModelPokemon("Chameleon","Chameleon is ninja pokemon an have cute face",R.drawable.chameleon));
        listPokemon.add(new ModelPokemon("Anaconda","Anaconda is poison pokemon an have cute face",R.drawable.anaconda));
    }
}