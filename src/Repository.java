/**
 * Created by Thomas on 12.10.2015.
 */
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
    }

    public ArrayList<Kontakt> getKontaktperVorname(String sucheVorname)
    {
        ArrayList<Kontakt> aktuellekontaktListe= new ArrayList<Kontakt>();
        for (Iterator<Kontakt> it = kontaktListe.iterator(); it.hasNext();) {
            Kontakt gesuchterKontakt = it.next();

            if (gesuchterKontakt.getVorname().toLowerCase().startsWith(sucheVorname.toLowerCase()))
            { aktuellekontaktListe.add(gesuchterKontakt);
            }
            return aktuellekontaktListe;
        }
    }

    public ArrayList<Kontakt> getKontaktperNachname(String sucheName)
    {
        ArrayList<Kontakt> aktuellekontaktListe= new ArrayList<Kontakt>();
        for (Iterator<Kontakt> it = kontaktListe.iterator(); it.hasNext();) {
            Kontakt gesuchterKontakt = it.next();

            if (gesuchterKontakt.getVorname().toLowerCase().startsWith(sucheName.toLowerCase()))
            { aktuellekontaktListe.add(gesuchterKontakt);
            }
            return aktuellekontaktListe;
        }
    }


    public ArrayList<Kontakt> getKontaktListe () {

        ArrayList<Kontakt> aktuellekontaktListe= new ArrayList<Kontakt>();
        for (Iterator<Kontakt> it = kontaktListe.iterator(); it.hasNext();) {
            Kontakt gesuchterKontakt = it.next();
            aktuellekontaktListe.add(gesuchterKontakt);
        }
        return aktuellekontaktListe;
    }
}
