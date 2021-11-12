package com.example.pokemongo;

public class ModelPokemon {
    String Nama;
    String Keterangan;
    int Photo;

    public ModelPokemon() {

    }

    public ModelPokemon(String nama, String keterangan, int photo) {
        Nama = nama;
        Keterangan = keterangan;
        Photo = photo;
    }

    public String getNama() {
        return Nama;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public int getFoto() {
        return Photo;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setKeterangan(String keterangan) {
        Keterangan = keterangan;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
