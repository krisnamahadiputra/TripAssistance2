package com.kuliah.tripassistance.model;

public class ModelReligi {
    String namareligi;
    int gambartempatreligi;
    String namatempatreligi;
    String desctempatreligi;

    public ModelReligi(String namareligi, int gambartempatreligi, String namatempatreligi, String desctempatreligi){
        this.namareligi = namareligi;
        this.gambartempatreligi = gambartempatreligi;
        this.namatempatreligi = namatempatreligi;
        this.desctempatreligi = desctempatreligi;
    }

    public String getNamareligi() {
        return namareligi;
    }

    public void setNamareligi(String namareligi) {
        this.namareligi = namareligi;
    }

    public int getGambartempatreligi() {
        return gambartempatreligi;
    }

    public void setGambartempatreligi(int gambartempatreligi) {
        this.gambartempatreligi = gambartempatreligi;
    }

    public String getNamatempatreligi() {
        return namatempatreligi;
    }

    public void setNamatempatreligi(String namatempatreligi) {
        this.namatempatreligi = namatempatreligi;
    }

    public String getDesctempatreligi() {
        return desctempatreligi;
    }

    public void setDesctempatreligi(String desctempatreligi) {
        this.desctempatreligi = desctempatreligi;
    }
}