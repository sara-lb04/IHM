import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
public class tp9{
    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre();
    }

    public static class Fenetre extends JFrame {
        public Fenetre() {
            this.setTitle("Calculator");
            this.setSize(800, 400);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null); 

            

            int buttonWidth = 100;
            int buttonHeight = 50;
            int buttonGap = 10; // Espacement entre les boutons
                

           
            // Ligne supérieure
            JButton button7 = new JButton("7");
            button7.setBounds(10, 10, buttonWidth, buttonHeight);
            button7.setBackground(Color.gray); 
            button7.setForeground(Color.WHITE);
            this.add(button7);

            JButton button8 = new JButton("8");
            button8.setBounds(120, 10, buttonWidth, buttonHeight);
            button8.setBackground(Color.gray); 
            button8.setForeground(Color.WHITE);
            this.add(button8);

            JButton button9 = new JButton("9");
            button9.setBounds(230, 10, buttonWidth, buttonHeight);
            button9.setBackground(Color.gray); 
            button9.setForeground(Color.WHITE);
            this.add(button9);

            JButton buttonPlus = new JButton("+");
            buttonPlus.setBounds(340, 10, buttonWidth, buttonHeight);
            buttonPlus.setBackground(Color.black);
            buttonPlus.setForeground(Color.WHITE); 
            this.add(buttonPlus);

            JButton buttonC = new JButton("C");
            buttonC.setBounds(450, 10, buttonWidth, buttonHeight);
            buttonC.setBackground(Color.red);
            this.add(buttonC);

            // Deuxième ligne
            JButton button4 = new JButton("4");
            button4.setBounds(10, 70, buttonWidth, buttonHeight);
            button4.setBackground(Color.gray);
            button4.setForeground(Color.WHITE);
            this.add(button4);

            JButton button5 = new JButton("5");
            button5.setBounds(120, 70, buttonWidth, buttonHeight);
            button5.setBackground(Color.gray); 
            button5.setForeground(Color.WHITE);
            this.add(button5);

            JButton button6 = new JButton("6");
            button6.setBounds(230, 70, buttonWidth, buttonHeight);
            button6.setBackground(Color.gray); 
            button6.setForeground(Color.WHITE);
            this.add(button6);

            JButton buttonMinus = new JButton("-");
            buttonMinus.setBounds(340, 70, buttonWidth, buttonHeight);
            buttonMinus.setBackground(Color.black); 
            buttonMinus.setForeground(Color.WHITE);
            this.add(buttonMinus);

            JButton buttonBackspace = new JButton("<--");
            buttonBackspace.setBounds(450, 70, buttonWidth, buttonHeight);
            buttonBackspace.setBackground(Color.yellow); 
            buttonBackspace.setForeground(Color.WHITE);
            this.add(buttonBackspace);

            // Troisième ligne
            JButton button1 = new JButton("1");
            button1.setBounds(10, 130, buttonWidth, buttonHeight);
            button1.setBackground(Color.gray); 
            button1.setForeground(Color.WHITE);
            this.add(button1);

            JButton button2 = new JButton("2");
            button2.setBounds(120, 130, buttonWidth, buttonHeight);
            button2.setBackground(Color.gray); 
            button2.setForeground(Color.WHITE);
            this.add(button2);

            JButton button3 = new JButton("3");
            button3.setBounds(230, 130, buttonWidth, buttonHeight);
            button3.setBackground(Color.gray);
            button3.setForeground(Color.WHITE);
            this.add(button3);

            JButton buttonMultiply = new JButton("*");
            buttonMultiply.setBounds(340, 130, buttonWidth, buttonHeight);
            buttonMultiply.setBackground(Color.black);
            buttonMultiply.setForeground(Color.WHITE);
            this.add(buttonMultiply);

            // Quatrième ligne
            JButton button0 = new JButton("0");
            button0.setBounds(10, 190, buttonWidth * 2 + buttonGap, buttonHeight); 
            button0.setBackground(Color.gray);
            button0.setForeground(Color.WHITE);
            this.add(button0);

            JButton buttonDot = new JButton(".");
            buttonDot.setBounds(230, 190, buttonWidth, buttonHeight);
            buttonDot.setBackground(Color.gray);
            buttonDot.setForeground(Color.WHITE);
            this.add(buttonDot);

            JButton buttonDivide = new JButton("/");
            buttonDivide.setBounds(340, 190, buttonWidth, buttonHeight);
            buttonDivide.setBackground(Color.black);
            buttonDivide.setForeground(Color.WHITE);
            this.add(buttonDivide);
            

            JButton buttonEqual = new JButton("=");
            buttonEqual.setBounds(450, 130, buttonWidth, buttonHeight); 
            buttonEqual.setBackground(Color.black);
            buttonEqual.setForeground(Color.WHITE);
            this.add(buttonEqual);

            JButton buttonAns = new JButton("Ans");
            buttonAns.setBounds(450, 190, buttonWidth, buttonHeight); 
            buttonAns.setBackground(Color.black);
            buttonAns.setForeground(Color.WHITE);
            this.add(buttonAns);

           
            this.setVisible(true);
        }
    }
}

