package model;

public class Marker {

    private String codMarcador;
    private String nombre;
    private String ubicacion;
    private String descripcion;

    public Marker(String codMarcador, String nombre, String ubicacion, String descripcion) {
        this.codMarcador = codMarcador;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    public String getCodMarcador() {
        return codMarcador;
    }

    public void setCodMarcador(String codMarcador) {
        this.codMarcador = codMarcador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "codMarcador='" + codMarcador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
