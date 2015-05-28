package com.example.alexandra.medcommerce;

/**
 * Created by Alexandra on 5/25/2015.
 */
public class ProdusListView {
    private String denumire;
    private int idButonAdauga;

    public ProdusListView(String denumire, int ImagineAdauga) {
        this.denumire = denumire;
        this.idButonAdauga =ImagineAdauga;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getIdButonAdauga() {
        return idButonAdauga;
    }

    public void setIdButonAdauga(int idButonAdauga) {
        this.idButonAdauga = idButonAdauga;
    }
}
