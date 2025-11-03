
package inmobiliaria;

public class Casa extends Propiedad {
    private int numHabitaciones;
    private boolean tieneGaraje;

    public Casa(String id, String direccion, double precio, EstadoPropiedad estado,
                int numHabitaciones, boolean tieneGaraje) {
        super(id, direccion, precio, estado);
        this.numHabitaciones = numHabitaciones;
        this.tieneGaraje = tieneGaraje;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "id=" + getIdPropiedad() +
                ", direccion='" + getDireccion() + '\'' +
                ", precio=" + getPrecio() +
                ", estado=" + getEstado() +
                ", numHabitaciones=" + numHabitaciones +
                ", tieneGaraje=" + tieneGaraje +
                '}';
    }
}

