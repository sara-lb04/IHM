import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TP08 {
    private JTextField display;
    private double currentResult;
    private String currentInput;
    private String lastOperation;

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre();
    }

    public static class Fenetre extends JFrame {
        private JTextField display;
        private double currentResult;
        private String currentInput;
        private String lastOperation;

        public Fenetre() {
            this.setTitle("TP Layout");
            this.setSize(800, 400);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);

            display = new JTextField();
            display.setEditable(false);
            display.setHorizontalAlignment(JTextField.RIGHT);
            display.setBounds(10, 10, 780, 50);
            this.add(display);

            int buttonWidth = 100;
            int buttonHeight = 50;
            int buttonGap = 10;

            JButton button7 = new JButton("7");
            button7.setBounds(10, 10, buttonWidth, buttonHeight);
            this.add(button7);

            JButton button8 = new JButton("8");
            button8.setBounds(120, 10, buttonWidth, buttonHeight);
            this.add(button8);

            JButton button9 = new JButton("9");
            button9.setBounds(230, 10, buttonWidth, buttonHeight);
            this.add(button9);

            JButton buttonPlus = new JButton("+");
            buttonPlus.setBounds(340, 10, buttonWidth, buttonHeight);
            this.add(buttonPlus);

            JButton buttonC = new JButton("C");
            buttonC.setBounds(450, 10, buttonWidth, buttonHeight);
            this.add(buttonC);

            JButton button4 = new JButton("4");
            button4.setBounds(10, 70, buttonWidth, buttonHeight);
            this.add(button4);

            JButton button5 = new JButton("5");
            button5.setBounds(120, 70, buttonWidth, buttonHeight);
            this.add(button5);

            JButton button6 = new JButton("6");
            button6.setBounds(230, 70, buttonWidth, buttonHeight);
            this.add(button6);

            JButton buttonMinus = new JButton("-");
            buttonMinus.setBounds(340, 70, buttonWidth, buttonHeight);
            this.add(buttonMinus);

            JButton buttonBackspace = new JButton("<--");
            buttonBackspace.setBounds(450, 70, buttonWidth, buttonHeight);
            this.add(buttonBackspace);

            JButton button1 = new JButton("1");
            button1.setBounds(10, 130, buttonWidth, buttonHeight);
            this.add(button1);

            JButton button2 = new JButton("2");
            button2.setBounds(120, 130, buttonWidth, buttonHeight);
            this.add(button2);

            JButton button3 = new JButton("3");
            button3.setBounds(230, 130, buttonWidth, buttonHeight);
            this.add(button3);

            JButton buttonMultiply = new JButton("*");
            buttonMultiply.setBounds(340, 130, buttonWidth, buttonHeight);
            this.add(buttonMultiply);

            JButton button0 = new JButton("0");
            button0.setBounds(10, 190, buttonWidth * 2 + buttonGap, buttonHeight);
            this.add(button0);

            JButton buttonDot = new JButton(".");
            buttonDot.setBounds(230, 190, buttonWidth, buttonHeight);
            this.add(buttonDot);

            JButton buttonDivide = new JButton("/");
            buttonDivide.setBounds(340, 190, buttonWidth, buttonHeight);
            this.add(buttonDivide);

            JButton buttonEqual = new JButton("=");
            buttonEqual.setBounds(450, 130, buttonWidth, buttonHeight);
            this.add(buttonEqual);

            JButton buttonAns = new JButton("Ans");
            buttonAns.setBounds(450, 190, buttonWidth, buttonHeight);
            this.add(buttonAns);

            // Action listeners for number buttons
            ActionListener numberButtonListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    currentInput += button.getText();
                    display.setText(currentInput);
                }
            };

            // Action listener for the operation buttons
            ActionListener operationButtonListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    performOperation(button.getText());
                    lastOperation = button.getText();
                }
            };

            // Attach action listeners to number buttons
            button1.addActionListener(numberButtonListener);
            button2.addActionListener(numberButtonListener);
            button3.addActionListener(numberButtonListener);
            button4.addActionListener(numberButtonListener);
            button5.addActionListener(numberButtonListener);
            button6.addActionListener(numberButtonListener);
            button7.addActionListener(numberButtonListener);
            button8.addActionListener(numberButtonListener);
            button9.addActionListener(numberButtonListener);
            button0.addActionListener(numberButtonListener);

            // Attach action listeners to operation buttons
            buttonPlus.addActionListener(operationButtonListener);
            buttonMinus.addActionListener(operationButtonListener);
            buttonMultiply.addActionListener(operationButtonListener);
            buttonDivide.addActionListener(operationButtonListener);

            this.setVisible(true);
        }

        private void performOperation(String operation) {
            try {
                double inputValue = Double.parseDouble(currentInput);
                switch (lastOperation) {
                    case "+":
                        currentResult += inputValue;
                        break;
                    case "-":
                        currentResult -= inputValue;
                        break;
                    case "*":
                        currentResult *= inputValue;
                        break;
                    case "/":
                        if (inputValue != 0) {
                            currentResult /= inputValue;
                        } else {
                            display.setText("Error: Division by zero");
                            return;
                        }
                        break;
                    default:
                        currentResult = inputValue;
                        break;
                }
                display.setText(String.valueOf(currentResult));
                currentInput = "";
                lastOperation = operation; // Réinitialisez lastOperation
            } catch (NumberFormatException ex) {
                // Handle invalid input
                display.setText("Error");
            }
        }
    }
}
