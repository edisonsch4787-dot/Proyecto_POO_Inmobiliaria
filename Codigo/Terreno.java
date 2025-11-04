/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo_inmobiliaria;

/**
 *
 * @author Mafer
 */
public class Terreno extends Propiedad{
    private double area;
    private String tipoSuelo;

    public Terreno(double area, String tipoSuelo, String idPropiedad, String direccion, double precio) {
        super(idPropiedad, direccion, precio);
        this.area = area;
        this.tipoSuelo = tipoSuelo;
    }

    public double getArea() {
        return area;
    }
    
    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setArea(double area) {
        if(area>0){
            this.area = area;
        }else{
            System.out.println("Area menor o igual que cero, no valida");
        }   
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }
    
    @Override
    public String toString(){
        return String.format("Terreno%n%s%nArea: %.2f%nTipo suelo: %s",super.toString(),area,tipoSuelo);
    }
}
