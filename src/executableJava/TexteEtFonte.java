package executableJava;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class TexteEtFonte extends JFrame implements ActionListener{  
    JTextField saisieTaille = new JTextField(5);
    JTextArea grandeZone = new JTextArea(4, 10);

    public TexteEtFonte() {
	JLabel taille = new JLabel("  Taille de la fonte");
	JScrollPane texteAsc;
	JPanel panneauTaille = new JPanel();
	Font fonte;
	int tailleInitiale = 20;

	saisieTaille.setText(Integer.toString(tailleInitiale));
	saisieTaille.addActionListener(this);

	panneauTaille.setLayout(new BorderLayout(5, 5));
	panneauTaille.add(taille, BorderLayout.CENTER);
	panneauTaille.add(saisieTaille, BorderLayout.EAST);

	fonte = new Font("TimesRoman", Font.PLAIN, tailleInitiale);
	grandeZone.setFont(fonte);

	texteAsc = new JScrollPane(grandeZone);
	add(panneauTaille, BorderLayout.NORTH);
	add(texteAsc, BorderLayout.CENTER);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();
	setLocation(300, 300);
	setVisible(true);
  }
    
  public void actionPerformed(ActionEvent evt) {
      int taillePolice;
 
      try {
	  taillePolice = Integer.parseInt(saisieTaille.getText());
	  grandeZone.setFont(new Font("TimesRoman", 
				  Font.PLAIN, taillePolice));
	}
      catch(NumberFormatException exc) {
	  exc.printStackTrace();
      }
      grandeZone.setText(grandeZone.getText());
    }
}
