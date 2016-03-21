package com.example.diogenes.projetodecarrosdiogenes;

/**
 * Created by diogenes on 16/03/16.
 */
public class Carros {

    private String nomeCarro;
    private int IdImageCarro;

    public Carros(String nomeCarro, int idCarro) {
        this.nomeCarro = nomeCarro;
        IdImageCarro = idCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public int getIdImageCarro() {
        return IdImageCarro;
    }

    public void setIdImageCarro(int idImageCarro) {
        IdImageCarro = idImageCarro;
    }
}
