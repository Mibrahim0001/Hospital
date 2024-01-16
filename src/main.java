import Interfaz.Menu;

import java.util.Scanner;

public class main {
    static ListaMedicos listMedic = new ListaMedicos();
    static ListaPacientes listPaci = new ListaPacientes();

    public static void main(String[] args) {


        while (true) {
            int eleccion = Menu.mostrar();
            switch (eleccion) {
                case 1:
                    Paciente p = new Paciente();
                    listPaci.addPaciente(p);
                    break;
                case 2:
                    Medico m = new Medico();
                    listMedic.addMedico(m);
                    break;
                case 3:
                    modificarPacientes();
                    break;
                case 5:
                    listPaci.showPacientes();
                default:
                    break;
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

    public static void modificarPacientes(){
        Scanner leer = new Scanner(System.in);
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
}
