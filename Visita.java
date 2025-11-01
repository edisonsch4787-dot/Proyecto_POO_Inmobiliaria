
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
    
    public Visita(int id, Cliente cliente, LocalDate fecha, LocalTime hora, String obs){
        this.cliente=cliente;
        this.fechaVisita=fecha;
        this.horaVisita=hora;
        this.id=id;
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
    @Override
    public String toString(){
        return "Visita ID: "+id+
                "\nCliente: "+cliente.getNombre()+
                "\nPropiedad: "+propiedad.getDireccion()+
                "\nFecha visita: "+fechaVisita+
                "\nHora: "+horaVisita;
    }
}
