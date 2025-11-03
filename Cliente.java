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
   private ArrayList<Visita> visitas;
   

    public Cliente(int id, String n, String ci) {
        super(id, n, ci);
    }

    public ArrayList<Visita> getVisitas() {
        return visitas;
    }
    
    
   public void registrarVisita(Visita n){
       visitas.add(n);
    }
   @Override
   public String toString(){
       return super.toString() ;
   }
}
