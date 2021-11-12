package com.example.pokemongo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.telephony.mbms.StreamingServiceInfo;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout myTab;
    ViewPager myPage;

//    RecyclerView rec1;
//    String s1[],s2[];
//    int imageResource[]={R.drawable.pikachu,R.drawable.bulbasur,R.drawable.squirtle,R.drawable.meow,R.drawable.lizard,R.drawable.chameleon,R.drawable.anaconda};
//
//    MyOwnAdapter adt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTab = (TabLayout)findViewById(R.id.MyTab);
        myPage = (ViewPager)findViewById(R.id.MyViewPager);

//        //myRevi kita gunakan untuk menampilkan data
//        rec1 = (RecyclerView)findViewById(R.id.myRevii);
//
//        s1 = getResources().getStringArray(R.array.nama_pokemon);
//        s2 = getResources().getStringArray(R.array.des_pokemon);
//
//        //cetak objeknya dari kelas MyOwnAdapter
//        adt = new MyOwnAdapter(this, s1,s2,imageResource);
//        rec1.setAdapter(adt);
//        rec1.setLayoutManager(new LinearLayoutManager(this));

        myPage.setAdapter(new MyOwnPagerAdapter((getSupportFragmentManager())));
        myTab.setupWithViewPager(myPage);

        myTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                myPage.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[] = {"pokemon", "Owner Pokemon"};

        public MyOwnPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int positon){

            if (positon == 0){
                return new Pokemon();
            }
            if (positon == 1){
                return new OwnerPokemon();
            }
            return null;
        }

        @Override
        public int getCount(){
            return data.length;
        }

        @Override

        public CharSequence getPageTitle(int position) {
            return data[position];
        }

    }
}