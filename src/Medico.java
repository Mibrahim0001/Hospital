import java.util.Scanner;

/**
 * Clase para almacenar la informacion de los medicos
 *
 * @author Muhammad Ibrahim
 * @version 1.0
 */
public class Medico {

    private String DNI;
    private String nombre;
    private String apellido;
    private String especialidad;

    private static String[] especialidades = {"dermatologia", "cardiología", "neumología", "pediatría", "traumatología"};

    /**
     * Constructor que se incia por la consola
     */
    public Medico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("[*] Creacion medio [*]");

        System.out.print("Introduzca el DNI del medico: ");
        this.DNI = leer.nextLine();

        System.out.print("Introduzca el nombre del medico: ");
        this.nombre = leer.nextLine();

        System.out.print("Introduzca el apellido del medico: ");
        this.apellido = leer.nextLine();

        String espe = "";
        do {
            if(!espe.isEmpty() && !Medico.existeEspecialidad(espe)){
                System.out.println("[-] La especialidad no existe");
            }
            System.out.print("Introduzca el especialidad del medico: ");
            espe = leer.nextLine();

        }while (!Medico.existeEspecialidad(espe));
        leer.close();
        this.especialidad = espe;


    }

    public Medico(String DNI, String nombre, String apellido, String especialidad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    public static boolean existeEspecialidad(String esp) {
        esp = esp.toLowerCase();
        for (String s : especialidades) {
            if (esp.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public Medico addMedico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("[*] Creacion medio [*]");

        System.out.print("Introduzca el DNI del medico: ");
        String dni = leer.nextLine();

        System.out.print("Introduzca el nombre del medico: ");
        String nombre = leer.nextLine();

        System.out.print("Introduzca el apellido del medico: ");
        String apellido = leer.nextLine();

        String espe = "";
        do {
            if(!espe.isEmpty() && !Medico.existeEspecialidad(espe)){
                System.out.println("[-] La especialidad no existe");
            }
            System.out.print("Introduzca el especialidad del medico: ");
            espe = leer.nextLine();

        }while (!Medico.existeEspecialidad(espe));
        Medico m = new Medico(dni, nombre, apellido, espe);
        leer.close();
        return m;
    }
}
