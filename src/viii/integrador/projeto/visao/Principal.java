package viii.integrador.projeto.visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Principal extends JFrame {
	private JPanel panel = new JPanel(new FlowLayout());
	public Principal() {
		organizarLayout();
		setTitle("Polo - Alerta 1.0");
		setSize(400, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void organizarLayout() {
		getContentPane().setBackground(new Color(0, 90, 107));

		panel.setBackground(new Color(0, 90, 107));
		
		Superior superior = new Superior();
		superior.setPreferredSize(new Dimension(400, 280));
		panel.add(superior);
		
		centro();
		
		Inferior inferior = new Inferior(panel,this);
		inferior.setPreferredSize(new Dimension(150,300));
		panel.add(inferior);
		
		add(panel);

	}
	
	public void voltar() {
		JButton voltar = new JButton("Voltar");
		panel.add(voltar);
		
		EventoVoltar evento = new EventoVoltar();
		voltar.addActionListener(evento);
		
		add(panel);
		panel.revalidate();
		
	}
	public void centro() {
		Centro centro = new Centro();
		centro.setPreferredSize(new Dimension(400,80));
		centro.setSize(400,100);
		panel.add(centro);
		
	}
	
	public void organizarPolo() {
		getContentPane().setBackground(new Color(0, 90, 107));
		panel.setBackground(new Color(0, 90, 107));
		
		centro();
		
		PoloPetroquimico polo = new PoloPetroquimico();
		panel.add(polo);
		
		voltar();
		
		

	}
	public void organizarRiscos() {
		getContentPane().setBackground(new Color(0, 90, 107));

		panel.setBackground(new Color(0, 90, 107));
		
		centro();
		
		Riscos riscos = new Riscos();
		panel.add(riscos);
		
		voltar();

	}
	
	public void organizarSeguranca() {
		getContentPane().setBackground(new Color(0, 90, 107));

		panel.setBackground(new Color(0, 90, 107));
		
		centro();
		Seguranca seguranca = new Seguranca();
		panel.add(seguranca);
		voltar();

	}
	
	public void organizarSobre() {
		getContentPane().setBackground(new Color(0, 90, 107));

		panel.setBackground(new Color(0, 90, 107));
		
		centro();
		Sobre sobre = new Sobre();
		panel.add(sobre);
		voltar();

	}

	private class EventoVoltar implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.removeAll();
			panel.repaint();
			organizarLayout();
			panel.revalidate();		
			
		}
	}	
	
	public static void main(String[] args) {
		new Principal();

	}
	
	

}
