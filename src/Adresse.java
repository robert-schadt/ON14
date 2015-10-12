/**
 * Created by Thomas on 12.10.2015.
 */
public class Adresse {
    private String strasse;
    private int hausnr;
    private String postleitzahl;
    private String ort;

    public Adresse(String strasse, int hausnr, String postleitzahl, String ort) {
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.postleitzahl = postleitzahl;
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnr() {
        return hausnr;
    }

    public void setHausnr(int hausnr) {
        this.hausnr = hausnr;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return strasse + " " + hausnr + ", " + postleitzahl + " " + ort;
    }
}
