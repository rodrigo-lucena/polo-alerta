package viii.integrador.projeto.visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Principal extends JFrame {
	public Principal() {
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
		
		Centro centro = new Centro();
		centro.setPreferredSize(new Dimension(400,80));
		centro.setSize(400,100);
		add(centro);
		
		Inferior inferior = new Inferior();
		inferior.setPreferredSize(new Dimension(150,300));
		add(inferior);

	}

	public static void main(String[] args) {
		new Principal();

	}

}
