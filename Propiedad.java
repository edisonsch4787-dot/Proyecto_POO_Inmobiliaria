
package inmobiliaria;

public abstract class Propiedad {
    private String idPropiedad;
    private String direccion;
    private double precio;
    private EstadoPropiedad estado;
    private AgenteInmobiliario agenteAsignado;
    private Cliente clienteActual;

    // Constructor
    public Propiedad(String idPropiedad, String direccion, double precio, EstadoPropiedad estado) {
        this.idPropiedad = idPropiedad;
        this.direccion = direccion;
        this.precio = precio;
        this.estado = estado;
    }

    // Getters y setters
    public String getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(String idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EstadoPropiedad getEstado() {
        return estado;
    }

    public void setEstado(EstadoPropiedad estado) {
        this.estado = estado;
    }

    public AgenteInmobiliario getAgenteAsignado() {
        return agenteAsignado;
    }

    public void setAgenteAsignado(AgenteInmobiliario agenteAsignado) {
        this.agenteAsignado = agenteAsignado;
    }

    public Cliente getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(Cliente clienteActual) {
        this.clienteActual = clienteActual;
    }

    // Método del UML
    public void cambiarEstado(EstadoPropiedad nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Método abstracto (opcional si quieres personalizarlo en las subclases)
    @Override
    public String toString() {
        return "Propiedad{" +
                "id='" + idPropiedad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", precio=" + precio +
                ", estado=" + estado +
                '}';
    }
}
