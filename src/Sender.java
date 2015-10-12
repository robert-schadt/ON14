/**
 * Created by Thomas on 12.10.2015.
 */
import java.util.ArrayList;

public class Sender {
    private ArrayList<Empfaenger> _alleEmpfaenger;

    public Sender() {
        _alleEmpfaenger = new ArrayList<>();
    }

    public void senden() {
        for (Empfaenger aktuellerEmpfaenger : _alleEmpfaenger) {
            aktuellerEmpfaenger.empfangen();
        }
    }

    public void anmelden(Empfaenger neuerEmpfaenger) {
        _alleEmpfaenger.add(neuerEmpfaenger);
    }

    public void abmelden(Empfaenger abzumeldenderEmpfaenger) {

    }
}
