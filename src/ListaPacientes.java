import java.util.ArrayList;

public class ListaPacientes {
    private ArrayList<Paciente> lp;

    public ListaPacientes() {
        this.lp = new ArrayList<Paciente>();
    }

    public void addPaciente(Paciente p){
        lp.add(p);
    }

    public boolean pacienteExiste(String dni){
        for (Paciente p: lp){
            if(p.getDNI().equals(dni)){
                return true;
            }
        }
        return false;
    }

    public void remplacePaciente(String dni, Paciente newP){
        for (int i = 0; i < lp.size(); i++) {

            if(lp.get(i).getDNI().equals(dni)){
                lp.set(i, newP);
            }
        }
    }

    public Paciente getPacienteByDni(String dni) throws Exception{
        for (Paciente p: lp){
            if(p.getDNI().equals(dni)){
                return p;
            }
        }
        throw  new Exception();
    }
    public void showPacientes(){
        if(lp.isEmpty()){
            System.out.println("[*] No existen pacientes.");
            return;
        }

        for (Paciente p: lp){
            System.out.println("[*] Paciente -> " + p.toString());
        }
    }
}
