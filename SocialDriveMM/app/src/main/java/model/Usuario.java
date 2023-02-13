package model;

public class Usuario {

    private String codUsuario;
    private String nombre;
    private String password;

    public Usuario(String codUsuario, String nombre, String password) {
        this.codUsuario = codUsuario;
        this.nombre = nombre;
        this.password = password;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codUsuario='" + codUsuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
