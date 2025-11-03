/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo_inmobiliaria;
import java.util.ArrayList;
/**
 *<>
 * @author Mafer
 */
public class Cliente extends Persona {
   private String telf;
   private ArrayList<Visita> visitas;
   

    public Cliente(int id, String n, String ci, String telf) {
        super(id, n, ci);
        this.telf=telf;
    }
    
   public String getTelf(){
        return telf;
    }
   public void registrarVisita(Visita n){
       visitas.add(n);
    }
   public void setTelf(String telf) {
        this.telf = telf;
    }
   @Override
   public String toString(){
       return "Cliente: "+super.toString() ;
   }
}
