import java.util.ArrayList;

/**
 * Created by Thomas on 12.10.2015.
 */
public class Controller {
    private Adressbuch adressbuch;
    private Repository repository;

    public Controller () {
        this.adressbuch = new Adressbuch();
        this.repository = new Repository();
    }

    public void addKontakt(Kontakt kontakt) {
        repository.addKontakte(kontakt);
    }

    public ArrayList<Kontakt> sucheKontaktPerNachname (String name) {
        repository.getKontaktperNachname(name);
    }

    public ArrayList<Kontakt> sucheKontaktPerVorname (String vorname) {
        repository.getKontaktperVorname(vorname);
    }

    public ArrayList<Kontakt> getKontaktliste () {
        return adressbuch.getKontaktliste();
    }

    public void aktualisiereAdressbuch() {
        adressbuch.aktualisiereKontaktliste(repository.getKontaktListe());
    }

}
