
package proyectopoo_inmobiliaria.Codigo;
import java.time.LocalDate;
import java.time.LocalTime;

public class Visita {
    private int id;
    private Cliente cliente;
    private AgenteInmobiliario agente;
    private Propiedad propiedad;
    private LocalDate fechaVisita;
    private LocalTime horaVisita;
    
    public Visita(int id, Cliente cliente, Propiedad propiedad, AgenteInmobiliario agente ,LocalDate fecha, LocalTime hora){
        this.cliente=cliente;
        this.propiedad=propiedad;
        this.fechaVisita=fecha;
        this.horaVisita=hora;
        this.id=id;
        this.agente=agente;
    }
    //getters y setters
    public int getId(){
        return id;
    }
    public void setId(int i){
        if(i>0){
            id=i;
        }else{
            System.out.println("Id ingresado no valido");
        }
    }
    public Cliente getCliente(){
        return cliente;
    }
    @Override
    public String toString(){
        return "Visita ID: "+id+
                "\nCliente: "+cliente.getNombre()+
                "\nPropiedad: "+propiedad.getDireccion()+
                "\nFecha visita: "+fechaVisita+
                "\nHora: "+horaVisita;
    }
}
