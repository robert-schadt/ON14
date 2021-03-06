import javax.swing.*;

/**
 * Created by LickertE on 12.10.2015.
 */

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TestView");
        Adressbuch model = new Adressbuch();

        Controller controller = new Controller(model);
        View testView = new View(model, controller);
        model.anmelden(testView);
        frame.setContentPane(testView.contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);
        model.senden();
    }
}
