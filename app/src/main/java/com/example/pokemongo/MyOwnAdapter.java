package com.example.pokemongo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder>{

    //deklarasikan variabel arraynya
    String data1[], data2[];
    int img[];
    Context ctx;

    //buat konstruktornya
    public MyOwnAdapter(Context ct, String s1[], String s2[], int img1[]){
        ctx = ct;
        data1 = s1;
        data2 = s2;
        img = img1;
    }

    //menginisialisasi viewholder & view yang didistribusikan
    //tapi tidak mengisi konten
    @NonNull
    @Override
    public MyOwnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater MyInflator = LayoutInflater.from(ctx);
        View myOwnView = MyInflator.inflate(R.layout.my_list,parent,false);

        return new MyOwnHolder(myOwnView);
    }

    //distribusikan datanya
    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.myImage.setImageResource(img[position]);
    }

    //untuk mendapatkan ukuran/lebar datanya
    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder{
        TextView t1, t2;
        ImageView myImage;

        public MyOwnHolder(View itemView){
            super(itemView);
            t1 = (TextView)itemView.findViewById(R.id.text1);
            t1 = (TextView)itemView.findViewById(R.id.text2);
            myImage = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
