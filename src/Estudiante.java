import java.util.Date;

public class Estudiante extends Usuario{
    String codigo;

    public Estudiante(String nombre, String primerApellido, String segundoApellido, String CI, String fechaNacimiento, String direcccion, int celular, int telefono, String gmail, String usuario, String contraseña, String codigo) {
        super(nombre, primerApellido, segundoApellido, CI, fechaNacimiento, direcccion, celular, telefono, gmail, usuario, contraseña);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", usuario='" + usuario + '\'' +
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
