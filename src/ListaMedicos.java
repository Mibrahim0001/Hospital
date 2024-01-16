import java.util.ArrayList;
import java.util.Scanner;

public class ListaMedicos {
    private ArrayList<Medico> lm;

    public ListaMedicos() {
        this.lm = new ArrayList<Medico>();
    }

    public void addMedico(Medico medico){
        lm.add(medico);
    }

    public boolean medicoExiste(String dni){
        for (Medico m: lm){
            if(m.getDNI().equals(dni)){
                return true;
            }
        }
        return false;
    }

    public void remplaceMedico(String dni, Medico newP){
        for (int i = 0; i < lm.size(); i++) {

            if(lm.get(i).getDNI().equals(dni)){
                lm.set(i, newP);
            }
        }
    }

    public Medico getMedicoByDni(String dni) throws Exception{
        for (Medico m: lm){
            if(m.getDNI().equals(dni)){
                return m;
            }
        }
        throw  new Exception();
    }

    public void eliminarMedico(){
        Scanner leer = new Scanner(System.in);
        System.out.println("[*] Eliminador de Medicos [*]");
        System.out.print("Escriba el dni: ");
        String dni = leer.nextLine();
        boolean isDeleted = lm.removeIf(m -> m.getDNI().equals(dni));
        if(isDeleted){
            System.out.println("[-] El medico ha sido eliminado");
        }else{
            System.out.println("[*] No existe ningun medico con ese dni.");
        }
    }

    public void showMedicos(){
        if(lm.isEmpty()){
            System.out.println("[*] No existen medicos.");
            return;
        }
        for (Medico m: lm){
            System.out.println("[+] Medico -> " + m.toString());
        }
    }
}
