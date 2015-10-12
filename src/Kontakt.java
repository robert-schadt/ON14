/**
 * Created by LickertE on 12.10.2015.
 */
public class Kontakt {
    private String name;
    private String vorname;
    private String telefonnr;
    private Adresse adresse;

public Kontakt(String name, String vorname, String telefonnr, String strasse, int hausnr, String postleitzahl, String ort) {
    this.name = name;
    this.vorname = vorname;
    this.telefonnr = telefonnr;
    this.adresse = new Adresse(strasse, hausnr, postleitzahl, ort);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
