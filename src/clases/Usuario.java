package clases;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
    }
}