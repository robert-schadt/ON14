/**
 * Created by Thomas on 12.10.2015.
 */

public class View extends Empfaenger {

    //Der Nutzer kann sich hier einloggen oder neuanmelden. Nach der Auswahl erscheint ein neues Fenster
    public void einloggen() {
        JFrame fenster = new JFrame("Willkommen");
        //Damit das Fenster nicht mehr oben links in der Ecke aufgeht, sondern zentral auf dem Bildschirm
        fenster.setSize(220, 400);
        fenster.setLocationRelativeTo(null);

        JPanel contentPane = (JPanel) fenster.getContentPane();
        contentPane.setLayout(new GridLayout(0, 1));
        contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));
        contentPane.add(new JLabel("Falls Sie schon einmal bei uns reserviert haben, klicken Sie bitte auf 'Registrierter Nutzer'."));
        contentPane.add(new JLabel(" Andernfalls wählen Sie bitte 'Neuer Nutzer'."));
        contentPane.add(new JLabel(" "));

        JButton neu = new JButton("Registrieren");
        neu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //nutzerAnlegen();
                fenster.dispose();
            }
        });
        contentPane.add(neu);

        JButton login = new JButton("Einloggen");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //einloggen();
                fenster.dispose();
            }
        });
        contentPane.add(login);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        fenster.pack();
        fenster.setVisible(true);

    }

    // Anlegen eines neuen Nutzers. User-ID wird aus dem Vornamen, Nachnamen und Nummer generiert
    public void nutzerAnlegen() {
        JFrame fenster = new JFrame("Bitte legen Sie einen neuen Kontakt an");
        fenster.setSize(220, 400);
        fenster.setLocationRelativeTo(null);

        JPanel contentPane = (JPanel) fenster.getContentPane();
        contentPane.setBorder(new EmptyBorder(12, 12, 12, 12));
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(new JLabel("Vorname"));
        JTextField vorn = new JTextField("");
        contentPane.add(vorn);

        contentPane.add(new JLabel("Nachname"));
        JTextField nachn = new JTextField("");
        contentPane.add(nachn);

        contentPane.add(new JLabel("Telefonnummer"));
        JTextField tel = new JTextField("");
        contentPane.add(tel);

        contentPane.add(new JLabel("Straße"));
        JTextField tel = new JTextField("");
        contentPane.add(stra);

        contentPane.add(new JLabel("Hausnummer"));
        JTextField tel = new JTextField("");
        contentPane.add(Hnr);

        contentPane.add(new JLabel("PLZ"));
        JTextField tel = new JTextField("");
        contentPane.add(plz;

        contentPane.add(new JLabel("Ort"));
        JTextField tel = new JTextField("");
        contentPane.add(ort);


        JButton reg = new JButton("Speichern");
        reg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gespeichert = true;
                id.setText("Der Kontakt wurde angelegt:  " + vorn + " " + nachn);
                pw.setForeground(Color.blue);
                id.setForeground(Color.blue);

            }
        });
        contentPane.add(reg);

        contentPane.add(new JLabel(" "));

        JButton weiter = new JButton("Abbrechen");
        weiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    fenster.dispose();

            }
        });

        contentPane.add(weiter);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        fenster.pack();
        fenster.setVisible(true);

    }

    //Einloggen: Der Nutzer gibt seine Zugangsdaten ein. Das Passwort wird geschwärzt.
    public void einloggen() {
        JFrame fenster = new JFrame("Bitte loggen Sie sich ein");
        fenster.setSize(220, 400);
        fenster.setLocationRelativeTo(null);

        JPanel contentPane = (JPanel) fenster.getContentPane();
        contentPane.setBorder(new EmptyBorder(12, 12, 12, 12));
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(new JLabel("Bitte geben Sie ihre ID als 'User' und das Passwort ein."));

        contentPane.add(new JLabel("User"));
        JTextField user = new JTextField("");
        besucherID = user.getText();
        contentPane.add(user);

        contentPane.add(new JLabel("Passwort"));
        JPasswordField pw = new JPasswordField();
        contentPane.add(pw);

        JButton einloggen = new JButton("Einloggen");
        einloggen.addActionListener(new ActionListener()

        {
            public void actionPerformed(ActionEvent e) {

                passwort = system.passwortUeberpruefen(new String(pw.getPassword()), user.getText());

                if (passwort == true) {
                    fenster.dispose();
                    Reservierungssystem();

                } else {
                    fenster.dispose();
                    einloggen();

                }
            }
        });
        contentPane.add(einloggen);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        fenster.pack();
        fenster.setVisible(true);

    }


    // Rückmeldung für erfolgreiche Aktionen
    public void bestaetigung() {
        JFrame fenster = new JFrame("Die Aktion war erfolgreich");
        fenster.setSize(220, 400);
        fenster.setLocationRelativeTo(null);

        JPanel contentPane = (JPanel) fenster.getContentPane();
        contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));
        contentPane.setLayout(new BorderLayout());

        contentPane.add(new Label("Die Aktion verlief erfolgreich."), BorderLayout.NORTH);
        JButton ok = new JButton("Ok");
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                fenster.dispose();
            }
        });
        contentPane.add(ok, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        fenster.pack();
        fenster.setVisible(true);
    }


    // Meldung für nicht erfolgreiche Aktionen
    public void warnung(String s) {

        String fehler = s;
        JDialog fenster = new JDialog();
        fenster.setTitle("Warnung!");
        fenster.setModal(true);

        fenster.setSize(220, 400);
        fenster.setLocationRelativeTo(null);

        JPanel contentPane = (JPanel) fenster.getContentPane();
        contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));
        contentPane.setLayout(new BorderLayout());

        contentPane.add(new Label(fehler), BorderLayout.NORTH);
        JButton ok = new JButton("Ok");
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                fenster.dispose();
            }
        });
        contentPane.add(ok, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        fenster.pack();
        fenster.setVisible(true);
    }
}