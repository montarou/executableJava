package executableJava;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DashBoard extends JFrame {
	private static final long serialVersionUID = 1L;

	public DashBoard() {
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon(getClass().getResource("/gifIcon.gif")).getImage());
	}
}
