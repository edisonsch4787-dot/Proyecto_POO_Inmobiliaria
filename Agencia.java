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
    private int contadorVisitas = 1;
    
    public Agencia(String nombre){
        this.nombre=nombre;
        this.clientes=new ArrayList <>();
        this.agentes=new ArrayList<>();
        this.contratos=new ArrayList<>();
        this.propiedades=new ArrayList<>();
        this.visitas=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<AgenteInmobiliario> getAgentes() {
        return agentes;
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public ArrayList<Visita> getVisitas() {
        return visitas;
    }
    //Metodos cliente
    public void registrarCliente(Cliente c){
        for(Cliente c1: clientes){
            if(c1.getNombre().equals(c.getNombre())){
                System.out.println("El cliente "+c.getNombre()+" ya se encuentra registrado");
            }
        }
        clientes.add(c);
        System.out.println("Cliente registrado");
    }
    public Cliente buscarCliente(String ci) {
        for (Cliente c : clientes) {
            if (c.getCi().equalsIgnoreCase(ci)) return c;
        }
        return null;
    }
    // Metodos agente
    public void registrarAgente(AgenteInmobiliario ag){
        agentes.add(ag);
    }
    public AgenteInmobiliario buscarAgente(String idAgente) {
        for (AgenteInmobiliario a : agentes) {
            if (a.getId().equalsIgnoreCase(idAgente)) return a;
        }
        return null;
     }
    //Metodos Propiedad
    public void registrarPropiedad(Propiedad p) throws Exception {
        if (buscarPropiedad(p.getIdPropiedad()) != null) {
            throw new Exception("La propiedad con ID " + p.getIdPropiedad() + " ya existe.");
        }
        propiedades.add(p);
        System.out.println("✅ Propiedad registrada correctamente.");
    }

    public Propiedad buscarPropiedad(String idPropiedad) {
        for (Propiedad p : propiedades) {
            if (p.getIdPropiedad().equalsIgnoreCase(idPropiedad)) return p;
        }
        return null;
    }

    public void listarPropiedadesPorEstado(EstadoPropiedad estado) {
        System.out.println("\nPropiedades en estado: " + estado);
        for (Propiedad p : propiedades) {
            if (p.getEstado() == estado) {
                System.out.println(p);
            }
        }
    }

    public void listarPropiedadesPorTipo(String tipo) {
        System.out.println("\nPropiedades del tipo: " + tipo);
        for (Propiedad p : propiedades) {
            if (p.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                System.out.println(p);
            }
        }
    }
    //Metodos Contrato
     public void registrarContrato(Contrato c) throws Exception {
        // Evitar contratos duplicados
        for (Contrato existente : contratos) {
            if (existente.getId() == c.getId()) {
                throw new Exception("El contrato con ID " + c.getId() + " ya existe.");
            }
        }

        // Cambiar el estado de la propiedad
        if (TipoContrato.VENTA.equals(c.getTipo()))
            c.getPropiedad().actualizarEstadoP(EstadoPropiedad.VENDIDA);
        else if (TipoContrato.ALQUILER.equals(c.getTipo()))
            c.getPropiedad().actualizarEstadoP(EstadoPropiedad.ALQUILADA);

        contratos.add(c);
        System.out.println("✅ Contrato registrado exitosamente.");
    }
    //Metodos Visitas
    public void registrarVisita(Visita v){
        visitas.add(v);
    }
     public int generarIdVisita() {
        return contadorVisitas++;
    }

    public void listarVisitasPorCliente(String ci) {
        System.out.println("Visitas del cliente con CI: " + ci);
        for (Visita v : visitas) {
            if (v.getCliente().getCi().equalsIgnoreCase(ci)) {
                System.out.println(v);
            }
        }
    }
    public void mostrarPropiedadesDisponibles(){
        System.out.println("Propiedades disponibles");
        for(Propiedad p: propiedades){
            if(EstadoPropiedad.DISPONIBLE.equals(p.getEstado())){
                p.toString();
            }
        }
    }
    //Metodos Reporte
     public void generarReportePropiedadesVendidasYAlquiladas() {
        System.out.println("\nReporte de Propiedades Vendidas y Alquiladas:");
        for (Propiedad p : propiedades) {
            if (p.getEstado() == EstadoPropiedad.VENDIDA || p.getEstado() == EstadoPropiedad.ALQUILADA) {
                System.out.println(p);
            }
        }
    }

    public void calcularComisionesAgentes() {
        System.out.println("\nComisiones por Agente:");
        for (AgenteInmobiliario a : agentes) {
            double total = 0;
            for (Contrato c : contratos) {
                if (c.getAgente().equals(a)) {
                    // Comisión del 3% sobre el monto del contrato
                    total += c.getMonto() * 0.03;
                }
            }
            System.out.println(a.getNombre() + " - Comisión total: $" + total);
        }
    }
}
    

