import java.util.ArrayList;
import java.util.Iterator;

public class Repository {

    private ArrayList<Kontakt> kontaktListe;

    public Repository(){
        kontaktListe = new ArrayList<Kontakt>();
    }

    public void addKontakte(Kontakt newKontakt)
    {
        kontaktListe.add(newKontakt);
        System.out.println("Der Kontakt " + newKontakt.getVorname() + ", " + newKontakt.getName() + " wurde erfolgreich hinzugefügt");
    }

    public void getKontaktperVorname(String sucheVorname)
    {
        for (Iterator<Kontakt> it = kontaktListe.iterator(); it.hasNext();) {
            Kontakt gesuchterKontakt = it.next();
            if (gesuchterKontakt.getVorname().equals(sucheVorname))
                System.out.println(gesuchterKontakt.getKontakt());
        }
    }

    public void getKontaktperNachname(String sucheName)
    {
        for (Iterator<Kontakt> it = kontaktListe.iterator(); it.hasNext();) {
            Kontakt gesuchterKontakt = it.next();
            if (gesuchterKontakt.getName().equals(sucheName))
                System.out.println(gesuchterKontakt.getKontakt());
        }
    }


    public ArrayList<Kontakt> getKontaktListe () {

        for (Iterator<Kontakt> it = kontaktListe.iterator(); it.hasNext();) {
            Kontakt gesuchterKontakt = it.next();
                System.out.println(gesuchterKontakt.getKontakt());
        }
    }
}
