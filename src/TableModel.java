import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Created by Marcel Lutz on 12.10.2015.
 */

public class TableModel extends AbstractTableModel
{
    //Datenfelder
    private List list;
    private String[] columns = { "Name", "Vorname", "Telefonnummer", "Adresse" };

    /**
     * Konstruktor zum Überschreiben des Standard-Konstruktors
     */
    public TableModel() {
    }

    /**
     * Konstruktor der Liste empfängt
     *
     * @param l List mit den darzustellenden Exercise-Objekten
     */
    public TableModel(List l)
    {
        list = l;
    }

    /**
     * Gibt Anzahl der Zeilen aus
     */
    public int getRowCount() {
        return list.size();
    }

    /**
     * Gibt Anzahl der Spalten aus
     *
     * @return int
     */
    public int getColumnCount() {
        return columns.length;
    }

    /**
     * Gibt Name einer Spalte aus
     *
     * @param col Zahl der Spalte
     * @return String
     */
    public String getColumnName(int col) {
        return columns[col];
    }

    /**
     * Gibt Wert eine Zeile aus
     *
     * @param row Zahl der Reihe
     * @param col Zahl der Spalte
     *
     * @return Object
     */
    public Object getValueAt(int row, int col) {
        Kontakt kontakt = (Kontakt) list.get(row);

        switch (col) {
            case 0:
                return kontakt.getName();
            case 1:
                return kontakt.getVorname();
            case 2:
                return kontakt.getTelefonnr();
            case 3:
                return kontakt.getAdresse();
            default:
                return null;
        }
    }
/*
    *//**
     * Fügt Adresse in die Tabelle ein
     *
     * @param a Benutzer der hinzugefügt werden soll
     *//*
    public void addAdresse(Adresse a) {
        list.add(a);
        fireTableDataChanged();
    }

    *//**
     * Fügt eine gesamte Liste der Tabelle hinzu
     *
     * @param l List mit den hinzuzufügenden Usern
     *//*
    public void addList(List l) {
        list.addAll(l);
        fireTableDataChanged();
    }

    *//**
     * Gibt Objekte einer Reihe aus
     *
     * @param row Zahl der Reihe
     * @return Exercise
     *//*
    public Adresse getAdresseat(int row) {
        return (Adresse) list.get(row);
    }

    *//**
     * Löscht Objekt einer Reihe
     *
     * @param row Zahl der Reihe
     * @return User
     *//*
    public Adresse removeAdresseAt(int row) {
        try {
            return (Adresse) list.remove(row);
        }
        finally {
            fireTableDataChanged();
        }
    }*/
}
