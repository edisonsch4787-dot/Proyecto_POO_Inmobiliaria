
package inmobiliaria;

public class Terreno extends Propiedad {
    private double area;
    private String tipoSuelo;

    public Terreno(String id, String direccion, double precio, EstadoPropiedad estado,
                   double area, String tipoSuelo) {
        super(id, direccion, precio, estado);
        this.area = area;
        this.tipoSuelo = tipoSuelo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    @Override
    public String toString() {
        return "Terreno{" +
                "id=" + getIdPropiedad() +
                ", direccion='" + getDireccion() + '\'' +
                ", precio=" + getPrecio() +
                ", estado=" + getEstado() +
                ", area=" + area +
                ", tipoSuelo='" + tipoSuelo + '\'' +
                '}';
    }
}
