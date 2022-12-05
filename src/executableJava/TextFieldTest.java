package executableJava;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class TextFieldTest implements ActionListener
	{   
	    public String Rep2;
		JTextField text1,text2;
		JButton btn;
		
		// Constructeur
		public TextFieldTest(){
				JFrame f = new JFrame();
				
				text1 = new JTextField();
				text1.setBounds(20,50,280,30);
				
				text2 = new JTextField();
				text2.setBounds(20,90,280,30);
				text2.setEditable(false);
				
				btn = new JButton("Cliquez ici!");
				btn.setBounds(100,140,100,40);
				btn.addActionListener(this);
				
				f.add(text1);
				f.add(text2);
				f.add(btn);
				
				f.setSize(340,250);
				f.setLayout(null);
				f.setVisible(true);
					
		}
		
		// getters
		public String getRep2() {
			return this.Rep2;
		}
	


		
		public void actionPerformed(ActionEvent e)
		{
		String name = text1.getText();
		String result = "";
		if(e.getSource() == btn){
			result = "Repertoire "+name;
			Rep2 = name;
			System.out.format("Nom du repertoire 1: %s%n", Rep2);
			
            File path = new File(Rep2);	
			
			System.out.println(path.getAbsolutePath());
			System.out.format("Chemin du repertoire 3: %s%n",path);
			
			File dir = new File(Rep2);
			File[] liste =dir.listFiles();
			for(File item : liste) {
				if(item.isFile())
				{ 
					System.out.format("Nom du Fichier: %s%n", item.getName());
				}
				else if(item.isDirectory())
				{
					System.out.format("Nom du repertoire 3: %s%n",item.getName());
				}
			}
			
		}
		text2.setText(result);
		}
}
