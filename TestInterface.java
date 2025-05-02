import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestInterface {
    public static void main(String[] args) {
        // Création d'une fenêtre
        JFrame fenetre = new JFrame("Test 1");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Utilisation d'un gestionnaire de disposition GridLayout pour disposer les
        // panneaux sur une grille
        JPanel panneauPrincipal = new JPanel(new GridLayout(5, 2));

        // Création des panneaux pour chaque groupe de composants
        JPanel panneauOperateurs = new JPanel(new GridLayout(3, 5));
        JPanel panneauBoutonCalculer = new JPanel(new GridLayout(1, 1));
        JPanel panneauResultat = new JPanel(new GridLayout(2, 2));

        // Création des champs de texte pour les opérateurs
        JTextField champOperat1 = new JTextField(10);
        JTextField champOperat2 = new JTextField(10);

        // Création du champ de texte pour le résultat
        JTextField champResultat = new JTextField(10);
        champResultat.setEditable(false); // Rend le champ de texte non modifiable

        // Création du bouton "Calculer"
        JButton boutonCalculer = new JButton("Calculer");

        // Ajout d'un écouteur d'événements au bouton
        boutonCalculer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action à effectuer lorsque le bouton est cliqué
                // Dans cet exemple, une addition des opérateurs est effectuée
                try {
                    int operat1 = Integer.parseInt(champOperat1.getText());
                    int operat2 = Integer.parseInt(champOperat2.getText());
                    int resultat = operat1 + operat2;

                    // Affichage du résultat dans le champ de texte
                    champResultat.setText(String.valueOf(resultat));
                } catch (NumberFormatException ex) {
                    // Gestion d'une exception si la conversion en entier échoue
                    champResultat.setText("Erreur");
                }
            }
        });

        // Ajout des composants aux panneaux
        panneauOperateurs.add(new JLabel("Operateur 1:"));
        panneauOperateurs.add(champOperat1);
        panneauOperateurs.add(new JLabel("Operateur 2:"));
        panneauOperateurs.add(champOperat2);

        panneauBoutonCalculer.add(boutonCalculer);

        panneauResultat.add(new JLabel("Resultat:"));
        panneauResultat.add(champResultat);

        // Ajout des panneaux au panneau principal
        panneauPrincipal.add(panneauOperateurs);
        panneauPrincipal.add(panneauBoutonCalculer);
        panneauPrincipal.add(panneauResultat);

        // Ajout du panneau principal à la fenêtre
        fenetre.getContentPane().add(panneauPrincipal);

        // Ajustement automatique de la taille de la fenêtre en fonction du contenu
        fenetre.pack();

        // Affichage de la fenêtre
        fenetre.setVisible(true);
    }
}