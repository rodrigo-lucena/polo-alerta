package viii.integrador.projeto.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Inferior extends JPanel{
	private JButton polo;
	private JButton riscos;
	private JButton seguranca;
	private JButton sobre;
	private JPanel panel;
	private Principal principal;
	public Inferior(JPanel panel,Principal principal) {
		this.panel = panel;
		this.principal = principal;
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		setBackground(new Color(0, 90, 107));
		setBorder(BorderFactory.createEmptyBorder(50,10,10,10));
				
		polo = new JButton("Polo Petroquímico");
		add(polo);
		riscos = new JButton("Riscos");
		add(riscos);
		seguranca = new JButton("Segurança");
		add(seguranca);
		sobre = new JButton("Sobre...");
		add(sobre);
		
		Evento evento = new Evento();
		polo.addActionListener(evento);		
		riscos.addActionListener(evento);		
		seguranca.addActionListener(evento);		
		sobre.addActionListener(evento);		
		
	}
	
	private class Evento implements ActionListener{
		@Override	
		public void actionPerformed(ActionEvent e) {
			panel.removeAll();
			panel.repaint();
			switch (e.getActionCommand()){
				case "Polo Petroquímico": {
					principal.organizarPolo();
					break;
				}
				case "Riscos":{
					principal.organizarRiscos();
					break;
				}
				case "Segurança":{
					principal.organizarSeguranca();
					break;
				}
				case "Sobre...":{
					principal.organizarSobre();
				}
			}
					
		}
	}	

}
