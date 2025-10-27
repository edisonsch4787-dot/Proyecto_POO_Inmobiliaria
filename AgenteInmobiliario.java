/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * <>plates/Classes/Class.java to edit this template
 */
package proyectopoo_inmobiliaria;
import java.util.ArrayList;

public class AgenteInmobiliario extends Persona {
    private double comisionAcumulada;
    private ArrayList<Propiedad> propiedadesAsignadas;

    public AgenteInmobiliario( String id, String n, String ci, String telf, String email) {
        super(id, n, ci, telf, email);
        this.comisionAcumulada = 0.0;
        this.propiedadesAsignadas = new ArrayList<>() ;
    }
    public double getComision(){
        return comisionAcumulada;
    }
    public void sumarComision(double monto){
        comisionAcumulada+=monto;
    }
    @Override
    public String toString(){
        return "Agente: "+super.toString();
    }
    
}
