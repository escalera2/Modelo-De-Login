public class Main {
    public static void main(String[] args){

        Estudiante Brayan = new Estudiante("kal","pollo","rostizado","49829","08/05/45","calle Amame",943234,877332,"alfonso2@gmail.com","tupap","huevosuno","09342");
        Docente Javier= new Docente("yair","calani","jhosua","5345634","98/65/58","avenida css",7768932,46340,"tudios@gmail.com","cood","huevosdos",130);
        Persona[] personas = {Javier,Brayan};
        Usuario[] usuarios = {Javier,Brayan};
        Persona persona1 = Brayan;
        Persona persona2 = Javier;
        Usuario usuario1 = Brayan;
        Usuario usuario2 = Javier;
        Estudiante estudiante1=(Estudiante)persona1;
        Estudiante estudiante2 =(Estudiante)persona2;

    }
}
