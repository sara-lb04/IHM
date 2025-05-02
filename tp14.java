import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class tp14 {
    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre();

    }

    public static class Fenetre extends JFrame {
        public Fenetre() {
            this.setTitle("Ma première fenêtre Java");
            this.setSize(400, 100);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JLabel mousePosition = new JLabel(" Mouse Position: (0, 0)"); 
            JLabel mouseStatus = new JLabel(" Mouse Status: None"); 
            this.addMouseListener(new MouseListener() {
                
                public void mouseClicked(MouseEvent e) {
                mousePosition.setText(" Mouse Position: ("+e.getX()+", "+e.getY() 
                +")");
                mouseStatus.setText(" Mouse Status: Mouse Clicked");
                }
                
                public void mousePressed(MouseEvent e) {
                mouseStatus.setText(" Mouse Status: Mouse Pressed");
                }
                
                public void mouseReleased(MouseEvent e) {
                mouseStatus.setText(" Mouse Status: Mouse Released");
                }
            
                public void mouseEntered(MouseEvent e) {
                mouseStatus.setText(" Mouse Status: Mouse Entered");
                }
                @Override
                public void mouseExited(MouseEvent e) {
                mouseStatus.setText(" Mouse Status: Mouse Exited");
                }
                });
            this.add(mousePosition, BorderLayout.NORTH); // add the mouse position label to the top of the window
            this.add(mouseStatus, BorderLayout.SOUTH); // add the mouse status label to the bottom of the window
            this.setVisible(true); 
        }
    }
}
