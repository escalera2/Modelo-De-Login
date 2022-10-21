public class Docente extends Usuario {
    int sueldo;

    public Docente(String nombre, String primerApellido, String segundoApellido, String CI, String fechaNacimiento, String direcccion, int celular, int telefono, String gmail, String usuario, String contraseña, int sueldo) {
        super(nombre, primerApellido, segundoApellido, CI, fechaNacimiento, direcccion, celular, telefono, gmail, usuario, contraseña);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "sueldo=" + sueldo +
                '}';
    }
}
