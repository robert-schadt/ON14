import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Created by Marcel Lutz on 12.10.2015.
 */

public class TableModel extends AbstractTableModel
{
    //Datenfelder
    private List list;
    private String[] columns = { "Vorname", "Name", "Telefonnummer" };

    /**
     * Konstruktor zum �berschreiben des Standard-Konstruktors
     */
    public TableModel() {
    }

    /**
     * Konstruktor der Liste empf�ngt
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
     * Gibt Wert eine Zelle aus
     *
     * @param row Zahl der Reihe
     * @param col Zahl der Spalte
     *
     * @return Object
     */
    public Object getValueAt(int row, int col) {
        Adresse adresse = (Adresse) list.get(row);

        switch (col) {
            case 0:
                return adresse.getName();
            default:
                return null;
        }
    }

    /**
     * F�gt Adresse in die Tabelle ein
     *
     * @param e Benutzer der hinzugef�gt werden soll
     */
    public void addAdresse(Adresse a) {
        list.add(a);
        fireTableDataChanged();
    }

    /**
     * F�gt eine gesamte Liste an �bungen der Tabelle hinzu
     *
     * @param l List mit den hinzuzuf�genden Usern
     */
    public void addList(List l) {
        list.addAll(l);
        fireTableDataChanged();
    }

    /**
     * Gibt Exercise-Objekt einer Reihe aus
     *
     * @param row Zahl der Reihe
     * @return Exercise
     */
    public Adresse getAdresseat(int row) {
        return (Adresse) list.get(row);
    }

    /**
     * L�scht Exercise-Objekt einer Reihe
     *
     * @param row Zahl der Reihe
     * @return User
     */
    public Adresse removeAdresseAt(int row) {
        try {
            return (Adresse) list.remove(row);
        }
        finally {
            fireTableDataChanged();
        }
    }
}
