/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo_inmobiliaria;
import java.util.ArrayList;

public class Agencia {
    private String nombre;
    private ArrayList <Propiedad> propiedades;
    private ArrayList <Cliente> clientes;
    private ArrayList <AgenteInmobiliario> agentes;
    private ArrayList <Contrato> contratos;
    private ArrayList <Visita> visitas;
    
    public Agencia(String nombre){
        this.nombre=nombre;
        this.clientes=new ArrayList <>();
        this.agentes=new ArrayList<>();
        this.contratos=new ArrayList<>();
        this.propiedades=new ArrayList<>();
        this.visitas=new ArrayList<>();
    }
    public ArrayList getClientes(){
        return clientes;
    }
    public ArrayList getPropiedades(){
        return propiedades;
    }
    public ArrayList getAgentes(){
        return agentes;
    }
    public ArrayList getContratos(){
        return contratos;
    }
    public void registrarPropiedad(Propiedad p){
        propiedades.add(p);
    }
    public void registrarCliente(Cliente c){
        clientes.add(c);
    }
    public void registrarAgente(AgenteInmobiliario ag){
        agentes.add(ag);
    }
    public void registrarContrato(Contrato contrato){
        contratos.add(contrato);
    }
    public void registrarVisita(Visita v){
        visitas.add(v);
    }
    public void mostrarPropiedadesDisponibles(){
        System.out.println("Propiedades disponibles");
        for(Propiedad p: propiedades){
            if(EstadoPropiedad.DISPONIBLE.equals(p.getEstado())){
                p.toString();
            }
        }
    }
}
