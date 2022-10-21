import java.util.Date;

public class Persona {
    String nombre;
    String primerApellido;
    String segundoApellido;
    String CI;
    String fechaNacimiento;
    String direcccion;
    int celular;
    int telefono;
    String gmail;

    public Persona(){

    }

    public Persona(String nombre, String primerApellido, String segundoApellido, String CI, String fechaNacimiento, String direcccion, int celular, int telefono, String gmail) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.CI = CI;
        this.fechaNacimiento = fechaNacimiento;
        this.direcccion = direcccion;
        this.celular = celular;
        this.telefono = telefono;
        this.gmail = gmail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
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
