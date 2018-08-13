package com.TECBA.puntosdeinteres.demo;

import java.util.ArrayList;
public class Lista implements LugaresTuristicos{
        public ArrayList<LugaresTuristicos>lugaresturisticos= new ArrayList<LugaresTuristicos>();
        public void añadirLugaresTuristicos(LugaresTuristicos l){ lugaresturisticos.add(l);
        }
        public void mostrarLugaresTuristicos(){
            for(LugaresTuristicos l: lugaresturisticos){
                String Nombre = l.getNombre();
                String Direccion = l.getDireccion();
                int Precio= l.getPrecio();
                String Lugar= l.getLugar();
                int Telefono= l.getTelefono();
                int HorariosAtencion= l.getHorariosAtencion();
                String GuiasTuristicos= l.getGuiasTuristicos();
                boolean Venta_entradas= l.getVentaEntradas();
                boolean Sin_entradasl= l.getSinEntradas();
                boolean Tipo= l.getTipo();

                System.out.println("Descripcion de LugaresTuristicos; "+Nombre+" "+Direccion+" "+Precio+" "+Lugar+" "+Telefono+" "+HorariosAtencion+" "+GuiasTuristicos+" "+Venta_entradas+" "+Sin_entradasl+" "+Tipo);
            }
        }
        public void buscarLugaresTuristicos(String nombre){
            for (LugaresTuristicos l : lugaresturisticos){
                String n = l.getNombre();
                String dr = l.getDireccion();
                int p= l.getPrecio();
                String L= l.getLugar();
                int t= l.getTelefono();
                int ha= l.getHorariosAtencion();
                String gt= l.getGuiasTuristicos();
                boolean ve= l.getVentaEntradas();
                boolean se= l.getSinEntradas();
                boolean t=l.getTipo();
                if(n== nombre){
                    System.out.println("Lugat Turistico existe");
                    System.out.println("Descripcion del Lugar");
                    System.out.println("Nombre: "+n);
                    System.out.println("Direccion: "+dr);
                    System.out.println("Precio: "+p);
                    System.out.println("Lugar: "+L);
                    System.out.println("Telefono: "+t);
                    System.out.println("HorarioAtencion: "+ha);
                    System.out.println("GuiasTuristicos: "+gt);
                    System.out.println("Venta_entradas: "+ve);
                    System.out.println("Sin_entradas: "+se);
                    System.out.println("Tipo: "+t);
                }
                else{
                    System.out.println("El Lugar no existe");
                }
            }
        }
    }
}
