/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo_inmobiliaria;

/**
 *
 * @author Mafer
 */
abstract class Persona {
    private int id;
    private String nombre;
    private String ci;
    
    public Persona(int id, String n, String ci){
        this.id=id;
        this.nombre=n;
        this.ci=ci;
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCi(){
        return ci;
    }
    public void setId(int i){
        id=i;
    }
    public void setNombre(String n){
        nombre=n;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    
    @Override
    public String toString(){
        return String.format("%s %nID: %02d %nCI: %s",nombre,id,ci);
    }
    
}
