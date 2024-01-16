import java.util.Scanner;

/**
 * Clase para almacenar la informacion de los pacientes
 *
 * @author Muhammad Ibrahim
 * @version 1.0
 */
public class Paciente {
    private String DNI;
    private int NSS;
    private String nombre;
    private String apellido;
    private int telefono;
    private String dolencia;

    /**
     * Contructor sin parametros para recojerlo desde la consola
     */
    public Paciente() {
        Scanner leer = new Scanner(System.in);
        System.out.println("* Creacion Paciente *");

        System.out.print("Introduzca el DNI del paciente: ");
        this.DNI = leer.nextLine();

        System.out.print("Introduzca el nombre del paciente: ");
        this.nombre = leer.nextLine();

        System.out.print("Introduzca el apellido del paciente: ");
        this.apellido = leer.nextLine();

        System.out.print("Introduzca el dolencia del paciente: ");
        this.dolencia = leer.nextLine();

        System.out.print("Introduzca el NSS del paciente: ");
        this.NSS = leer.nextInt();

        System.out.print("Introduzca el Numero tlf del paciente: ");
        this.telefono = leer.nextInt();
        //leer.close();

    }

    /**
     * Contructor crear con todas la variables
     * @param DNI del paciente
     * @param NSS del paciente
     * @param nombre del paciente
     * @param apellido del paciente
     * @param telefono del paciente
     * @param dolencia del paciente
     */
    public Paciente(String DNI, int NSS, String nombre, String apellido, int telefono, String dolencia) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dolencia = dolencia;
        this.NSS = NSS;
        this.telefono = telefono;

    }

    /**
     * Optener el dni del paciente alamacenadod
     * @return
     */
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int NSS) {
        this.NSS = NSS;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDolencia() {
        return dolencia;
    }

    public void setDolencia(String dolencia) {
        this.dolencia = dolencia;
    }

    // Otras funciones

    /**
     * Metodo para convertir todoas la variables
     * en un string
     * @return Devulve la clase en String
     */
    @Override
    public String toString() {
        return "Paciente{" +
                "DNI='" + DNI + '\'' +
                ", NSS=" + NSS +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", dolencia='" + dolencia + '\'' +
                '}';
    }

}
