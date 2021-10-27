package viii.integrador.projeto.visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;



@SuppressWarnings("serial")
public class PoloPetroquimico extends JFrame{
	public PoloPetroquimico() {
		organizarLayout();
		setTitle("Polo - Alerta 1.0");
		setSize(400, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	private void organizarLayout() {
		getContentPane().setBackground(new Color(0, 90, 107));
		setLayout(new FlowLayout());
		
		Superior superior = new Superior();
		superior.setPreferredSize(new Dimension(400, 250));
		add(superior);
		
		


	}
	
	
	public static void main(String[] args) {
		new PoloPetroquimico();

	}

}
