package viii.integrador.projeto.visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Sobre extends JPanel{
	
	private final JLabel titulo;

	public Sobre() {
		setBackground(new Color(0, 90, 107));
		setLayout(new BorderLayout(5,5));		
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));	
				
		titulo = new JLabel("  Sobre");
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("courier", Font.PLAIN, 15));
		titulo.setHorizontalAlignment(SwingConstants.LEFT);	
		add(titulo, BorderLayout.NORTH);
		
			
		Box box = Box.createHorizontalBox();
		String texto = "    O aplicativo polo-alerta tem a função de alertar e orientar a população ao redor "
				+ "das empresas do Polo Petroquímico de Capuava (região metropoli- tana de São Paulo) durante "
				+ "a ocorrência de acidentes de grandes proporções nas instalações dessas empresas, além informar"
				+ " mais a respeito do funcionamento das empresas do Polo Petroquímico, bem como dos riscos que elas "
				+ "oferecem à popula- ção ao seu redor e da segurança que pode ser empregada para amenizar esses riscos "
				+ "ou ajudar à população em caso de acidentes.\n "
				+ "    Em um caso de emergência, você será avisado com uma notificação na tela do seu smartphone junto"
				+ "com um alerta sonoro. A notificação na tela orientará você a se proteger da maneira mais "
				+ "adequada possível.";
		JTextArea textoArea = new JTextArea(texto,25,30);
		textoArea.setLineWrap(true);
		textoArea.setWrapStyleWord(true);
		textoArea.setBackground(new Color(0, 90, 107));
		textoArea.setForeground(Color.WHITE);
		box.setBackground(new Color(0, 90, 107));
		box.add(new JScrollPane(textoArea));		
		add(box, BorderLayout.SOUTH);		
	}

}
