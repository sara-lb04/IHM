import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Tp6 {
    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre();
        fenetre.createAndShowGUI(); // Create and show the GUI from the instance
    }

    public static class Fenetre extends JFrame {
        private JPanel p3; // Declare p3 at the class level

        public Fenetre() {
            this.setTitle("TP Layout");
            this.setSize(800, 400);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel p1 = new JPanel();
            p1.setLayout(new BoxLayout(p1, BoxLayout.LINE_AXIS));
            p1.add(new JButton("Bouton 1"));

            JPanel p2 = new JPanel();
            p2.setLayout(new BoxLayout(p2, BoxLayout.LINE_AXIS));
            p2.add(new JButton("Bouton 2"));
            p2.add(new JButton("Bouton 3"));

            p3 = new JPanel(); // Initialize p3
            p3.setLayout(new BoxLayout(p3, BoxLayout.LINE_AXIS));
            p3.add(new JButton("Bouton 4"));
            p3.add(new JButton("Bouton 5"));
            p3.add(new JButton("Bouton 6"));
        }

        public void createAndShowGUI() {
            JPanel p4 = new JPanel();
            p4.setLayout(new BoxLayout(p4, BoxLayout.PAGE_AXIS));
            p4.add(p1);
            p4.add(p2);
            p4.add(p3);
            this.getContentPane().add(p4);
            this.setVisible(true);
        }
    }
}
