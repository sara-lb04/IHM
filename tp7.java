
//tp7
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.JSeparator;

public class tp7 {
    public static class Fenetre extends JFrame {
        public Fenetre() {
            this.setTitle("Cree un Menu");
            this.setSize(800, 400);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JSeparator sep = new JSeparator();

            JMenuBar barreMenu = new JMenuBar();
            JMenu menu1 = new JMenu("File");
            JMenu menu2 = new JMenu("Edite");
            JMenu menu3 = new JMenu("Selection");
            JMenu menu4 = new JMenu("View");
            JMenu menu5 = new JMenu("GO");
            JMenu menu6 = new JMenu("Run");
            JMenu menu7 = new JMenu("...");

            JMenuItem item_new = new JMenuItem("new            Ctrl+N");
            JMenuItem item_open = new JMenuItem("open");

            JMenuItem item_close = new JMenuItem("close");
            JMenuItem item_copy = new JMenuItem("copy");
            JMenuItem item_Selectall = new JMenuItem("Selectall");
            JMenuItem item_openview = new JMenuItem("openview");
            JMenuItem item_Back = new JMenuItem("Back");
            JMenuItem item_Debugg = new JMenuItem("Debugg");
            JMenuItem item_otherItem = new JMenuItem("...");

            menu1.add(item_new);
            menu1.add(item_open);
            menu1.add(sep);
            menu1.add(item_close);

            menu2.add(item_copy);
            menu3.add(item_Selectall);
            menu4.add(item_openview);
            menu5.add(item_Back);
            menu6.add(item_Debugg);
            menu7.add(item_otherItem);

            barreMenu.add(menu1);
            barreMenu.add(menu2);
            barreMenu.add(menu3);
            barreMenu.add(menu4);
            barreMenu.add(menu5);
            barreMenu.add(menu6);
            barreMenu.add(menu7);
            setJMenuBar(barreMenu);

            setVisible(true);

        }
    }

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre();
    }
}