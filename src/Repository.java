import java.util.ArrayList;
import java.util.Iterator;

public class Repository {

    private ArrayList<Kontakt> kontaktListe;

    public Repository(){
        kontaktListe = new ArrayList<Kontakt>();
    }

    public void addKontakte(Kontakt)
    {
        kontaktListe.add(Kontakt);
    }

    public void getKontaktperVorname(String sucheVorname)
    {
        for (Iterator<Kontakt> it = kontaktListe.iterator(); it.hasNext();) {
            Kontakt gesuchterKontakt = it.next();
            gesuchterKontakt.getVorname() = new String gesuchterKontaktVorname;
            if (gesuchterKontaktVorname.equals(sucheVorname))
                System.out.println(gesuchterKontakt.getKontakt());
        }
    }

    public void getKontaktperNachname(String sucheName)
    {
        for (Iterator<Kontakt> it = kontaktListe.iterator(); it.hasNext();) {
            Kontakt gesuchterKontakt = it.next();
            gesuchterKontakt.getVorname() = new String gesuchterKontaktVorname;
            if (gesuchterKontaktVorname.equals(sucheName))
                System.out.println(gesuchterKontakt.getKontakt());
        }
    }

}
