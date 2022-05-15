package com.kuliah.tripassistance.model;

import java.io.Serializable;

public class ModelReligi implements Serializable {

    private String idReligi, txtNamaReligi, GambarReligi, KategoriReligi;

    public String getIdReligi() {
        return idReligi;
    }

    public void setIdReligi(String idReligi) {
        this.idReligi = idReligi;
    }

    public String getTxtNamaReligi() {
        return txtNamaReligi;
    }

    public void setTxtNamaReligi(String txtNamaReligi) {
        this.txtNamaReligi = txtNamaReligi;
    }

    public String getGambarReligi() {
        return GambarReligi;
    }

    public void setGambarReligi(String gambarReligi) {
        GambarReligi = gambarReligi;
    }

    public String getKategoriReligi() {
        return KategoriReligi;
    }

    public void setKategoriReligi(String kategoriReligi) {
        KategoriReligi = kategoriReligi;
    }
}
