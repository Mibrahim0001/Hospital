package Interfaz;

import java.util.Scanner;

/**
 * Clase para gestionar el menu
 *
 * @author Muhammad Ibrahim
 * @version 1.0
 */
public class Menu {

    /**
     * Metodo para mostrar el menu por pantalla
     */
    public static int mostrar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("*-------------------------------*");
        System.out.println("                                |");
        System.out.println("[1] Dar de alta un paciente     |");
        System.out.println("[2] Dar de alta un medico       |");
        System.out.println("[3] Modificar paciente          |");
        System.out.println("[4] Modificar medico            |");
        System.out.println("[5] Listar pacientes            |");
        System.out.println("[6] Listar medicos              |");
        System.out.println("[7] Dar de baja un médico       |");
        System.out.println("[8] Atender paciente            |");
        System.out.println("                                |");
        System.out.println("*-------------------------------*");

        int selected = 0;

        do {
            System.out.print("Introduzca opcion: ");

            selected =  Integer.parseInt(leer.nextLine());


            if (selected <= 0 || selected >= 8) {
                System.out.println("[-] Valor invalido, vuelva a intentarlo.");
                selected = 0;
            }
        }while(selected == 0);
        return selected;
    }
}
