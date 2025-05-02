import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BoiteDeSaisie extends JFrame implements ActionListener {

    private Container c;
    private JLabel nom, prenom, adresse, sexe, sports;
    private JTextField tnom, tprenom, tadresse;
    private JRadioButton homme, femme;
    private ButtonGroup gsexe;
    private JCheckBox tennis, squash, natation, athletisme, randonnee, foot, basket, volley, petanque;
    private JButton ok, annuler;
    private JTextArea tout;

    public BoiteDeSaisie() {
        setTitle("Boîte de saisie");
        setBounds(300, 90, 500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        nom = new JLabel("Nom");
        nom.setBounds(20, 20, 100, 20);
        c.add(nom);

        tnom = new JTextField();
        tnom.setBounds(120, 20, 150, 20);
        c.add(tnom);

        prenom = new JLabel("Prenom");
        prenom.setBounds(20, 50, 100, 20);
        c.add(prenom);

        tprenom = new JTextField();
        tprenom.setBounds(120, 50, 150, 20);
        c.add(tprenom);

        adresse = new JLabel("Adresse");
        adresse.setBounds(20, 80, 100, 20);
        c.add(adresse);

        tadresse = new JTextField();
        tadresse.setBounds(120, 80, 150, 20);
        c.add(tadresse);

        sexe = new JLabel("Sexe");
        sexe.setBounds(20, 110, 100, 20);
        c.add(sexe);

        homme = new JRadioButton("Homme");
        homme.setBounds(120, 110, 80, 20);
        c.add(homme);

        femme = new JRadioButton("Femme");
        femme.setBounds(200, 110, 80, 20);
        c.add(femme);

        gsexe = new ButtonGroup();
        gsexe.add(homme);
        gsexe.add(femme);

        sports = new JLabel("Sports");
        sports.setBounds(20, 140, 100, 20);
        c.add(sports);

        tennis = new JCheckBox("Tennis");
        tennis.setBounds(120, 140, 80, 20);
        c.add(tennis);

        squash = new JCheckBox("Squash");
        squash.setBounds(200, 140, 80, 20);
        c.add(squash);

        natation = new JCheckBox("Natation");
        natation.setBounds(280, 140, 80, 20);
        c.add(natation);

        athletisme = new JCheckBox("Athlétisme");
        athletisme.setBounds(120, 170, 80, 20);
        c.add(athletisme);

        randonnee = new JCheckBox("Randonnée");
        randonnee.setBounds(200, 170, 80, 20);
        c.add(randonnee);

        foot = new JCheckBox("Foot");
        foot.setBounds(280, 170, 80, 20);
        c.add(foot);

        basket = new JCheckBox("Basket");
        basket.setBounds(120, 200, 80, 20);
        c.add(basket);

        volley = new JCheckBox("Volley");
        volley.setBounds(200, 200, 80, 20);
        c.add(volley);

        petanque = new JCheckBox("Petanque");
        petanque.setBounds(280, 200, 80, 20);
        c.add(petanque);

        ok = new JButton("OK");
        ok.setBounds(120, 240, 80, 20);
        ok.addActionListener(this);
        c.add(ok);

        annuler = new JButton("Annuler");
        annuler.setBounds(200, 240, 80, 20);
        annuler.addActionListener(this);
        c.add(annuler);

        tout = new JTextArea();
        tout.setBounds(20, 280, 450, 80);
        tout.setEditable(false);
        c.add(tout);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {
            String data = "Nom : " + tnom.getText() + "\n"
                    + "Prenom : " + tprenom.getText() + "\n"
                    + "Adresse : " + tadresse.getText() + "\n"
                    + "Sexe : ";
            if (homme.isSelected()) {
                data += "Homme\n";
            } else {
                data += "Femme\n";
            }
            data += "Sports : ";
            if (tennis.isSelected()) {
                data += "Tennis ";
            }
            if (squash.isSelected()) {
                data += "Squash ";
            }
            if (natation.isSelected()) {
                data += "Natation ";
            }
            if (athletisme.isSelected()) {
                data += "Athlétisme ";
            }
            if (randonnee.isSelected()) {
                data += "Randonnée ";
            }
            if (foot.isSelected()) {
                data += "Foot ";
            }
            if (basket.isSelected()) {
                data += "Basket ";
            }
            if (volley.isSelected()) {
                data += "Volley ";
            }
            if (petanque.isSelected()) {
                data += "Petanque ";
            }
            tout.setText(data);
        } else if (e.getSource() == annuler) {
            tnom.setText("");
            tprenom.setText("");
            tadresse.setText("");
            gsexe.clearSelection();
            tennis.setSelected(false);
            squash.setSelected(false);
            natation.setSelected(false);
            athletisme.setSelected(false);
            randonnee.setSelected(false);
            foot.setSelected(false);
            basket.setSelected(false);
            volley.setSelected(false);
            petanque.setSelected(false);
            tout.setText("");
        }
    }

    public static void main(String[] args) {
        new BoiteDeSaisie();
    }
}