package com.example.pokemongo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link OwnerPokemon#newInstance} factory method to
// * create an instance of this fragment.
// */
public class OwnerPokemon extends Fragment {
    View view;
    private RecyclerView myrecyclerview2;
    private List<ModelPokemon> listOwner;
//    RecyclerView rec1;
//    String s1[],s2[];
//    int imageResource[]={R.drawable.pikachu,R.drawable.bulbasur,R.drawable.squirtle,R.drawable.meow,R.drawable.lizard,R.drawable.chameleon,R.drawable.anaconda};
//
//    RecyclerViewAdapter adt;
    public OwnerPokemon() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        rec1 = (RecyclerView) view.findViewById(R.id.myRevi2);
//
//        s1 = getResources().getStringArray(R.array.nama_pokemon);
//        s2 = getResources().getStringArray(R.array.des_pokemon);
//
//        //cetak objeknya dari kelas MyOwnAdapter
//        adt = new RecyclerViewAdapter(getContext(),s1,s2,imageResource);
//        rec1.setAdapter(adt);
//        rec1.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_owner_pokemon, container, false);
        myrecyclerview2 = (RecyclerView) view.findViewById(R.id.myRevi2);
        MyOwnAdapter recyclerAdapter = new MyOwnAdapter(getContext(), listOwner);
        myrecyclerview2.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview2.setAdapter(recyclerAdapter);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listOwner = new ArrayList<>();
        listOwner.add(new ModelPokemon("Nama : Ash","seorang petualang",R.drawable.ash));
        listOwner.add(new ModelPokemon("Nama : May","seorang petualang",R.drawable.may));
        listOwner.add(new ModelPokemon("Nama : Brook","seorang petualang",R.drawable.brook));
        listOwner.add(new ModelPokemon("Nama : Misty","seorang petualang",R.drawable.misty));
    }
}