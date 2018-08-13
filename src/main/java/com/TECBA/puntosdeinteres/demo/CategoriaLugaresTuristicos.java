package com.TECBA.puntosdeinteres.demo;

public class CategoriaLugaresTuristicos {
    public String nombreCatLugarTuristico;
    public int codCatLugarTuristico;

    public CategoriaLugaresTuristicos (String nombreCatLugarTuristico, int codCatLugarTuristico){
        this.nombreCatLugarTuristico=nombreCatLugarTuristico;
        this.codCatLugarTuristico=codCatLugarTuristico;
    }

    public String getNombreCatLugarTuristico() {
        return nombreCatLugarTuristico;
    }

    public void setNombreCatLugarTuristico(String nombreCatLugarTuristico) {
        this.nombreCatLugarTuristico = nombreCatLugarTuristico;
    }

    public int getCodCatLugarTuristico() {
        return codCatLugarTuristico;
    }

    public void setCodCatLugarTuristico(int codCatLugarTuristico) {
        this.codCatLugarTuristico = codCatLugarTuristico;
    }


}
