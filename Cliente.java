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
   private String preferencia;
   private ArrayList<Visita> visita;
   private ArrayList<Visita> visitasRealizadas;

    public Cliente(String id, String n, String ci, String telf, String email, String preferencia, ArrayList<Visita> visita, ArrayList<Visita> visitasRealizadas) {
        super(id, n, ci, telf, email);
        this.preferencia = preferencia;
        this.visita = visita;
        this.visitasRealizadas = visitasRealizadas;
    }
   public String getPreferencia(){
       return preferencia;
   }
   public void registrarVisita(Visita n){
       visita.add(n);
   }
   @Override
   public String toString(){
       return "Cliente: "+super.toString() ;
   }
}
