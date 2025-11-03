
package inmobiliaria;

public class Departamento extends Propiedad {
    private int piso;
    private int numHabitaciones;
    private boolean tieneAscensor;

    public Departamento(String id, String direccion, double precio, EstadoPropiedad estado,
                        int piso, int numHabitaciones, boolean tieneAscensor) {
        super(id, direccion, precio, estado);
        this.piso = piso;
        this.numHabitaciones = numHabitaciones;
        this.tieneAscensor = tieneAscensor;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public boolean isTieneAscensor() {
        return tieneAscensor;
    }

    public void setTieneAscensor(boolean tieneAscensor) {
        this.tieneAscensor = tieneAscensor;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + getIdPropiedad() +
                ", direccion='" + getDireccion() + '\'' +
                ", precio=" + getPrecio() +
                ", estado=" + getEstado() +
                ", piso=" + piso +
                ", numHabitaciones=" + numHabitaciones +
                ", tieneAscensor=" + tieneAscensor +
                '}';
    }
}
