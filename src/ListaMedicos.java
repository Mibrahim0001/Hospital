import java.util.ArrayList;

public class ListaMedicos {
    private ArrayList<Medico> lm;

    public ListaMedicos() {
        this.lm = new ArrayList<Medico>();
    }

    public void addMedico(Medico medico){
        lm.add(medico);
    }

    public void showMedicos(){
        for (Medico m: lm){
            System.out.println("[+] Medico -> " + m.toString());
        }
    }
}
