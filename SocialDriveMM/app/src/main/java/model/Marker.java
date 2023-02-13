package model;

public class Marker {

    private String nombre;
    private String ubicacion;
    private String descripcion;
    private int imgMarcador;

    public Marker(String nombre, String ubicacion, String descripcion, int imgMarcador) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.imgMarcador = imgMarcador;
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

    public int getImgMarcador() {
        return imgMarcador;
    }

    public void setImgMarcador(int imgMarcador) {
        this.imgMarcador = imgMarcador;
    }

    @Override
    public String toString() {
        return "Marker{" +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
