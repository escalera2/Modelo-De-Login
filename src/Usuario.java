import java.util.Date;

public class Usuario  extends Persona{
    String usuario;
    String contraseña;

    public Usuario(String nombre, String primerApellido, String segundoApellido, String CI, String fechaNacimiento, String direcccion, int celular, int telefono, String gmail, String usuario, String contraseña) {
        super(nombre, primerApellido, segundoApellido, CI, fechaNacimiento, direcccion, celular, telefono, gmail);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", CI='" + CI + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", direcccion='" + direcccion + '\'' +
                ", celular=" + celular +
                ", telefono=" + telefono +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
