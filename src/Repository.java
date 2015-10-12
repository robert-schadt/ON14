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

    public void getKontakt(String suche)
    {
        for (Iterator<Kontakt> it = kontaktListe.iterator(); it.hasNext();) {
            Kontakt gesuchterKontakt = it.next();
            gesuchterKontakt.getVorname() = new String gesuchterKontaktVorname;
            if (gesuchterKontaktVorname.equals(suche))
                System.out.println(ges);
        }
    }

}
