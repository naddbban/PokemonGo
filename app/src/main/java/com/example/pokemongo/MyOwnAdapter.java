package com.example.pokemongo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolderr>{

    Context mContect;
    List<ModelPokemon> mData;

    public MyOwnAdapter(Context mContect, List<ModelPokemon> mData) {
        this.mContect = mContect;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyOwnHolderr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContect).inflate(R.layout.my_list,parent,false);
        MyOwnHolderr vHolder = new MyOwnHolderr(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolderr holder, int position) {
        holder.t_nama.setText(mData.get(position).getNama());
        holder.t_keterangan.setText(mData.get(position).getKeterangan());
        holder.img.setImageResource(mData.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyOwnHolderr extends RecyclerView.ViewHolder {

        private TextView t_nama;
        private TextView t_keterangan;
        private ImageView img;

        public MyOwnHolderr(@NonNull View itemView) {
            super(itemView);

            t_nama = (TextView) itemView.findViewById(R.id.text1);
            t_keterangan = (TextView) itemView.findViewById(R.id.text2);
            img = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

//    //deklarasikan variabel arraynya
//    String data1[], data2[];
//    int img[];
//    Context ctx;
//
//    //buat konstruktornya
//    public MyOwnAdapter(Context ct, String s1[], String s2[], int img1[]){
//        ctx = ct;
//        data1 = s1;
//        data2 = s2;
//        img = img1;
//    }
//
//    //menginisialisasi viewholder & view yang didistribusikan
//    //tapi tidak mengisi konten
//    @NonNull
//    @Override
//    public MyOwnAdapter.MyOwnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater MyInflator = LayoutInflater.from(ctx);
//        View myOwnView = MyInflator.inflate(R.layout.my_list,parent,false);
//
//        return new MyOwnHolder(myOwnView);
//    }
//
//    //distribusikan datanya
//    @Override
//    public void onBindViewHolder(@NonNull MyOwnAdapter.MyOwnHolder holder, int position) {
//        holder.t1.setText(data1[position]);
//        holder.t2.setText(data2[position]);
//        holder.myImage.setImageResource(img[position]);
//    }
//
//    //untuk mendapatkan ukuran/lebar datanya
//    @Override
//    public int getItemCount() {
//        return data1.length;
//    }
//
//    public class MyOwnHolder extends RecyclerView.ViewHolder{
//        TextView t1, t2;
//        ImageView myImage;
//
//        public MyOwnHolder(View itemView){
//            super(itemView);
//            t1 = itemView.findViewById(R.id.text1);
//            t2 = itemView.findViewById(R.id.text2);
//            myImage = itemView.findViewById(R.id.imageView);
//        }
//    }
}
