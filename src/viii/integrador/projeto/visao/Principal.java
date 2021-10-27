package viii.integrador.projeto.visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

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
		superior.setPreferredSize(new Dimension(400, 250));
		panel.add(superior);
		
		Centro centro = new Centro();
		centro.setPreferredSize(new Dimension(400,80));
		centro.setSize(400,100);
		panel.add(centro);
		
		Inferior inferior = new Inferior(panel,this);
		inferior.setPreferredSize(new Dimension(150,300));
		panel.add(inferior);
		
		add(panel);

	}
	
	public void organizarPolo() {
		getContentPane().setBackground(new Color(0, 90, 107));
		panel.setBackground(new Color(0, 90, 107));
		
		Centro centro = new Centro();
		centro.setPreferredSize(new Dimension(400,80));
		centro.setSize(400,100);
		panel.add(centro);
		
		JLabel titulo = new JLabel("  Polo Petroquímico de Capuava");
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("courier", Font.PLAIN, 15));
		titulo.setHorizontalAlignment(SwingConstants.LEFT);	
		panel.add(titulo, BorderLayout.NORTH);
		
		Box box = Box.createHorizontalBox();
		String texto = "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo"
				+ "Ddddd ddd ddd ddddd dddd dddd dddd dddd ddd dddd ddd   ddddd  ddddd ddddd popopopo";
		JTextArea textoArea = new JTextArea(texto,35,30);
		textoArea.setLineWrap(true);
		textoArea.setSize(10, 20);
		textoArea.setBackground(new Color(0, 90, 107));
		textoArea.setForeground(Color.WHITE);
		box.setBackground(new Color(0, 90, 107));
		box.add(new JScrollPane(textoArea));
		
		panel.add(box);
		
		JButton voltar = new JButton("Voltar");
		panel.add(voltar);
		
		EventoVoltar evento = new EventoVoltar();
		voltar.addActionListener(evento);
		
		add(panel);
		panel.revalidate();

	}
	public void organizarRiscos() {
		getContentPane().setBackground(new Color(0, 90, 107));

		panel.setBackground(new Color(0, 90, 107));
		
		Centro centro = new Centro();
		centro.setPreferredSize(new Dimension(400,80));
		centro.setSize(400,100);
		panel.add(centro);
		
		JButton voltar = new JButton("Voltar");
		panel.add(voltar);
		
		EventoVoltar evento = new EventoVoltar();
		voltar.addActionListener(evento);
		
		add(panel);
		panel.revalidate();

	}
	
	public void organizarSeguranca() {
		getContentPane().setBackground(new Color(0, 90, 107));

		panel.setBackground(new Color(0, 90, 107));
		
		Centro centro = new Centro();
		centro.setPreferredSize(new Dimension(400,80));
		centro.setSize(400,100);
		panel.add(centro);
		
		JButton voltar = new JButton("Voltar");
		panel.add(voltar);
		
		EventoVoltar evento = new EventoVoltar();
		voltar.addActionListener(evento);
		
		add(panel);
		panel.revalidate();

	}
	
	public void organizarSobre() {
		getContentPane().setBackground(new Color(0, 90, 107));

		panel.setBackground(new Color(0, 90, 107));
		
		Centro centro = new Centro();
		centro.setPreferredSize(new Dimension(400,80));
		centro.setSize(400,100);
		panel.add(centro);
		
		JButton voltar = new JButton("Voltar");
		panel.add(voltar);
		
		EventoVoltar evento = new EventoVoltar();
		voltar.addActionListener(evento);		
		
		add(panel);	
		
		panel.revalidate();

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
