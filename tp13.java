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

public class tp13 {
    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre();

    }

    public static class Fenetre extends JFrame {
        public Fenetre() {
            this.setTitle("Ma première fenêtre Java");
            this.setSize(400, 100);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JTextField textField = new JTextField(20); // create a text field
            JLabel labelResult = new JLabel("Enter some text"); // create a label
            textField.addKeyListener(new KeyListener() {
              
                public void keyTyped(KeyEvent e) { 
               
                }
               
                public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                labelResult.setText(textField.getText());
                }
               
                public void keyReleased(KeyEvent e) { 
               
                }
                });
                
            this.add(textField, BorderLayout.NORTH); // add the text field to the top of the frame
            this.add(labelResult, BorderLayout.SOUTH); // add the label to the bottom of the frame
            this.setVisible(true); 
        }
    }
}
