
package proyectopoo_inmobiliaria;
import java.time.LocalDate;
import java.time.LocalTime;

public class Visita {
    private int id;
    private Cliente cliente;
    private AgenteInmobiliario agente;
    private Propiedad propiedad;
    private LocalDate fechaVisita;
    private LocalTime horaVisita;
    private String observaciones;
    
    public Visita(int id, Cliente cliente, LocalDate fecha, LocalTime hora, String obs){
        this.cliente=cliente;
        this.fechaVisita=fecha;
        this.horaVisita=hora;
        this.id=id;
        this.observaciones=obs;
    }
    //getters y setters
    public String getObs(){
        return observaciones;
    }
    public int getId(){
        return id;
    }
    public void registrarObservacion(String txt){
        observaciones=txt;
    }
    @Override
    public String toString(){
        return "Id visita: "+id+"\nCliente: "+cliente.getNombre()+
                "\nPropiedad: "+propiedad.getDireccion()+"\nFecha visita: "
                +fechaVisita+"\nObservaciones: "+observaciones;
    }
}
