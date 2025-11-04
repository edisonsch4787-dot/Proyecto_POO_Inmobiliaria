/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo_inmobiliaria;


public class Casa extends Propiedad {
    private int numHab;
    private boolean tieneGarage;

    public Casa(int numHab, String idP, String dir, double precio, boolean grg) {
        super(idP, dir, precio);
        this.numHab = numHab;
        this.tieneGarage = grg;
    }
    public int getNumHabitaciones(){
        return numHab;
    }
    public boolean getTieneGarage(){
        return tieneGarage;
    }
    public void actualizar_tieneGarage(){
        if(tieneGarage==true){
            tieneGarage=false;
        }else{
            tieneGarage=true;
        }
    }
    @Override
    public String toString(){
        return String.format("%s%nNumero habitaciones: %d%n Tiene garage: %b",super.toString(),numHab,tieneGarage);
    }  
}
