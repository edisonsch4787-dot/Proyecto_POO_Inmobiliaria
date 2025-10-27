/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo_inmobiliaria;

public class Propiedad {
    
    public enum EstadoPropiedad{
        DISPONIBLE,
        EN_NEGOCIACION,
        VENDIDA,
        ALQUILADA
    }
    
    private String idPropiedad;
    private String direccion;
    private double precio;
    private EstadoPropiedad estado;

    public Propiedad(String idPropiedad, String direccion, double precio) {
        this.idPropiedad = idPropiedad;
        this.direccion = direccion;
        this.precio = precio;
    }
    public String getDireccion(){
        return direccion;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double p){
        precio=p;
    }
    public void setDireccion(String dir){
        direccion=dir;
    }
    public void actualizarPropiedad(EstadoPropiedad est){
        estado=est;
    }
    public void asignarAgente(){
        
    }
    @Override
    public String toString(){
        return "Propiedad{"+
                "ID: "+idPropiedad+"\nDireccion: "+direccion
                +"\nPrecio: "+precio+"\nEstado: "+estado;
    }
    
}
