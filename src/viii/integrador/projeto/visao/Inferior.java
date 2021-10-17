package viii.integrador.projeto.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Inferior extends JPanel{
	private JButton polo;
	private JButton riscos;
	private JButton seguranca;
	private JButton sobre;
	public Inferior() {
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		setBackground(new Color(0, 90, 107));
		setBorder(BorderFactory.createEmptyBorder(50,10,10,10));
				
		polo = new JButton("Polo Petroquímico");
		add(polo);
		riscos = new JButton("Riscos");
		add(riscos);
		seguranca = new JButton("Segurança");
		add(seguranca);
		sobre = new JButton("Sobre..");
		add(sobre);
		
	}

}
