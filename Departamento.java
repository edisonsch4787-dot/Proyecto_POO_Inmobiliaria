/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo_inmobiliaria;

public class Departamento extends Propiedad{
    private int piso;
    private int numHabitaciones;
    private boolean tieneAscensor;
    
    public Departamento(int p, int Habs, String idP, String dir, double precio){
        super(idP,dir,precio);
        this.piso=p;
        this.numHabitaciones=Habs;
        this.tieneAscensor=false;
    }
    
    public int getPiso(){
        return piso;
    }
    public int getNumHabitaciones(){
        return numHabitaciones;
    }
    public boolean getTieneAscensor(){
        return tieneAscensor;
    }
    public void setPiso(int p){
        if(p>=0){
            piso=p;
        }else{
            System.out.println("Piso no valido");
        }
    }
    @Override
    public String toString(){
        return String.format("%nDepartamento: %s |Piso: %d |Tiene ascensor: %b",super.toString(),piso,tieneAscensor);
    }
}
