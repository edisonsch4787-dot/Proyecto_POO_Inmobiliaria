/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo_inmobiliaria;
import java.time.LocalDate;

public class Contrato {

    Contrato(int id, Cliente cliente, Propiedad propiedad, AgenteInmobiliario agente, LocalDate now, Object object, double monto, proyectopoo_inmobiliaria.TipoContrato tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public enum TipoContrato{
        VENTA,
        ALQUILER
    }
    private int id;
    private Cliente cliente;
    private AgenteInmobiliario agente;
    private Propiedad propiedad;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double monto;
    private TipoContrato tipo;
    private boolean activo;

    public Contrato(int id, Cliente cliente, Propiedad propiedad, AgenteInmobiliario agente,
                LocalDate fechaInicio, LocalDate fechaFin, double monto, TipoContrato tipo) {
        this.id = id;
        this.cliente = cliente;
        this.propiedad = propiedad;
        this.agente= agente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.tipo = tipo;
        this.activo = true;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public AgenteInmobiliario getAgente() {
        return agente;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public double getMonto() {
        return monto;
    }

    public TipoContrato getTipo() {
        return tipo;
    }

    public boolean isActivo() {
        return activo;
    }
    
    public double calcularComision(){
        double comision=propiedad.getPrecio();
        if(TipoContrato.VENTA.equals(tipo)){
            comision*=0.03;
            return comision;
        }else if(tipo==TipoContrato.ALQUILER){
            comision*=0.10;
            return comision;
        }else{
            return 0;
        }
    }
    public void finalizarContrato(){
        activo=false;
        if(tipo==TipoContrato.VENTA){
            propiedad.actualizarEstadoP(EstadoPropiedad.VENDIDA);
        }else{
            propiedad.actualizarEstadoP(EstadoPropiedad.ALQUILADA);
        }
        agente.sumarComision(calcularComision());
        System.out.println("Contrato finalizado");
    }
    @Override
    public String toString(){
        return String.format("ID Contrato: %03d%nCliente: %s "
                + "%nAgente: %s %nPropiedad: %s %nInicio: "+fechaInicio+
                "%nFin: "+fechaFin+"%nMonto: %.2f %nTipo: "+tipo,
                id,cliente.getNombre(),agente.getNombre(),propiedad.getDireccion(),monto);
    }
    
}
