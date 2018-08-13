package com.TECBA.puntosdeinteres.demo;
//import Java.util.Scanner;
import java.util.ArrayList;
public class LugaresTuristicos {

    public String Nombre;
    public String Direccion;
    public int Precio;
    public String Lugar;
    public int Telefono;
    public int HorariosAtencion;
    public String GuiasTuristicos;
    public  boolean VentaEntradas;
    public boolean SinEntradas;
    public boolean Tipo;
    public Arraylist mapa;

    public LugaresTuristicos(String nombre, String direccion, int precio, String lugar, int telefono, int horariosAtencion, String guiasTuristicos, boolean venta_entradas, boolean sin_entradas, boolean tipo, Arraylist mapa) {
        Nombre = nombre;
        Direccion = direccion;
        Precio = precio;
        Lugar = lugar;
        Telefono = telefono;
        HorariosAtencion = horariosAtencion;
        GuiasTuristicos = guiasTuristicos;
        this.VentaEntradas = venta_entradas;
        this.SinEntradas = sin_entradas;
        Tipo = tipo;
        this.mapa = mapa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public int getHorariosAtencion() {
        return HorariosAtencion;
    }

    public void setHorariosAtencion(int horariosAtencion) {
        HorariosAtencion = horariosAtencion;
    }

    public String getGuiasTuristicos() {
        return GuiasTuristicos;
    }

    public void setGuiasTuristicos(String guiasTuristicos) {
        GuiasTuristicos = guiasTuristicos;
    }

    public boolean getVentaEntradas() { return VentaEntradas; }

    public void setVentaEntradas(boolean VentaEntradas) { this.VentaEntradas = VentaEntradas; }

    public boolean getSinEntradas() { return SinEntradas; }

    public void setSinEntradas(boolean SinEntradas) { this.SinEntradas = SinEntradas; }

    public boolean getTipo() {
        return Tipo;
    }

    public void setTipo(boolean tipo) {
        Tipo = tipo;
    }

    public Arraylist getMapa() {
        return mapa;
    }

    public void setMapa(Arraylist mapa) {
        this.mapa = mapa;
    }


    public void  asignarTipo(){
        boolean Tipo1 = new boolean("true");
        if (Tipo1==true)
            System.out.println("MODERNO");
        else
            System.out.println("");
    }

   /* public void pedirInformacion(){
        Scanner entrada=new Scanner(System.in);
        String Nombre=entrada.nextLine();
        String Direccion=entrada.nextLine();
        int Precio=entrada.nextLine();
        String Lugar=entrada.nextLine();
        int Telefono=entrada.nextLine();
        int HorariosAtencion=entrada.nextLine();
        String GuiasTuristicos=entrada.nextLine();
        boolean venta_entradas=entrada.nextLine();
        boolean sin_entradas=entrada.nextLine();
        boolean Tipo=entrada.nextLine();
        System.out.println(Nombre);
        System.out.println(Direccion);
        System.out.println(Precio);
        System.out.println(Lugar);
        system.out.println(Telefono);
        System.out.println(HorariosAtencion);
        System.out.println(GuiasTuristicos);
        System.out.println(venta_entradas);
        System.out.println(sin_entradas);
        System.out.println(Tipo);
    }
    public void mostrarinformacion(){

    }*/
    public void categorizar(){
        String categoria=get.NombreCatLugarTuristico();
    }
}
