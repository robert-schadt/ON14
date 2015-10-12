/**
 * Created by Thomas on 12.10.2015.
 */
import java.util.ArrayList;
public class Adressbuch extends Sender {
    private ArrayList<Kontakt> kontaktliste;

    public Adressbuch() {
        this.kontaktliste = new ArrayList<>();
    }

    public ArrayList<Kontakt> getKontaktliste() {
        return kontaktliste;
    }

    /* public void addKontakt(Kontakt kontakt) {
       kontaktliste.add(kontakt);
        senden();
    } */

    public void aktualisiereKontaktliste (ArrayList<Kontakt> neueKontaktliste) {
        kontaktliste = neueKontaktliste;
        senden();
    }
}
