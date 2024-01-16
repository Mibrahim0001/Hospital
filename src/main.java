import Interfaz.Menu;

import java.util.Scanner;

public class main {
    static private final ListaMedicos listMedic = new ListaMedicos();
    static private final ListaPacientes listPaci = new ListaPacientes();
    static private final Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Medico m2 = new Medico("12232537L","Jose","Carlos", "dermatologia");
        listMedic.addMedico(m2);
        loop : while (true) {
            int eleccion = Menu.mostrar();
            switch (eleccion) {
                case 1:
                    Paciente p = new Paciente();
                    listPaci.addPaciente(p);
                    continuar();
                    break;
                case 2:
                    Medico m = new Medico();
                    listMedic.addMedico(m);
                    continuar();
                    break;
                case 3:
                    modificarPacientes();
                    continuar();
                    break;
                case 4:
                    modificarMedico();
                    continuar();
                    break;
                case 5:
                    listPaci.showPacientes();
                    continuar();
                    break;
                case 6:
                    listMedic.showMedicos();
                    continuar();
                    break;
                case 7:
                    listMedic.eliminarMedico();
                    continuar();
                    break;
                default:
                    break loop;
            }
        }

        /*
        Medico m = new Medico("12232537L","Jose","Carlos", "dermatologia");
        //m = m.addMedico();

        //System.out.println(m);

        Paciente p = new Paciente("12232537M", 74484885,"Paco", "Ruiz", 645856525,"Dolor de cabeza");
        //p = p.addPaciente();

        //System.out.println(p);

        ListaMedicos listMedic = new ListaMedicos();
        ListaPacientes listPaci = new ListaPacientes();

        listMedic.addMedico(m);
        listPaci.addPaciente(p);

        listMedic.showMedicos();
        listPaci.showMedicos();*/

    }

    public static void continuar(){
        System.out.print("[*] Presione enter para ir al menu...");
       leer.nextLine();
    }

    public static void modificarPacientes(){

        System.out.print("Escriba el dni del paciente: ");
        String dni = leer.nextLine();
        if(!listPaci.pacienteExiste(dni)){
            System.out.println("[-] No existe ningun paciente con ese DNI.");
            return;
        }

        System.out.println("Informacion actual:");
        try {
            System.out.println(listPaci.getPacienteByDni(dni));
        }catch (Exception e){
            System.out.println("[-] No existe ningun paciente con ese DNI.");
            return;
        }
        Paciente p = new Paciente();
        listPaci.remplacePaciente(dni, p);

        listPaci.showPacientes();
    }
    public static void modificarMedico(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Escriba el dni del medico: ");
        String dni = leer.nextLine();
        if(!listMedic.medicoExiste(dni)){
            System.out.println("[-] No existe ningun medico con ese DNI.");
            return;
        }

        System.out.println("Informacion actual:");
        try {
            System.out.println(listMedic.getMedicoByDni(dni));
        }catch (Exception e){
            System.out.println("[-] No existe ningun medico con ese DNI.");
            return;
        }
        Medico m = new Medico();
        listMedic.remplaceMedico(dni, m);

        listMedic.showMedicos();
    }
}
