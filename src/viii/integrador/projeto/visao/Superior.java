package viii.integrador.projeto.visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
//import java.util.Timer;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class Superior extends JPanel {
	private final JLabel titulo;
	private final JLabel imagem;
	private final String raiz = System.getProperty("user.dir");
	public Superior() {
		setBackground(new Color(0, 90, 107));
		setLayout(new BorderLayout(5,5));
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		titulo = new JLabel("  Polo Petroquímico de Capuava");
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("courier", Font.PLAIN, 15));
		titulo.setHorizontalAlignment(SwingConstants.LEFT);	
		add(titulo, BorderLayout.NORTH);
		
		Icon polo = new ImageIcon(raiz+"/src/viii/integrador/projeto/imagens/polo2.png");	
		imagem = new JLabel(polo, SwingConstants.CENTER);		
		add(imagem, BorderLayout.SOUTH);

		

		
	}

}
