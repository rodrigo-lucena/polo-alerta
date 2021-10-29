package viii.integrador.projeto.visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Seguranca extends JPanel{
	
	private final JLabel titulo;
	private final JLabel imagem;
	private final String raiz = System.getProperty("user.dir");
	public Seguranca() {
		setBackground(new Color(0, 90, 107));
		setLayout(new BorderLayout(5,5));		
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));	
				
		titulo = new JLabel("  Segurança");
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("courier", Font.PLAIN, 15));
		titulo.setHorizontalAlignment(SwingConstants.LEFT);	
		add(titulo, BorderLayout.NORTH);
		
		Icon polo = new ImageIcon(raiz+"/src/viii/integrador/projeto/imagens/seguranca.png");	
		imagem = new JLabel(polo, SwingConstants.CENTER);		
		add(imagem, BorderLayout.CENTER);
			
		Box box = Box.createHorizontalBox();
		String texto = "    Qualquer empresa está sujeita a riscos e por essa razão necessita ter um "
				+ "gerenciamento adequado. Há várias classificações para riscos, sendo as mais comuns"
				+ " relacionadas aos prejuízos econômicos, sociais e ambientais, a probabilidade de um"
				+ " eventual acidente, um evento adverso ou danos que sujam dado um espaço de tempo ou "
				+ "grau de vulnerabilidade de um local. \n"
				+ "    Para esse gerenciamento se tornar melhor, é fundamental hoje a participação da sociedade "
				+ "civil na tentativa de informar sobre as normas que são seguidas no processo da indústria "
				+ "química, bem como os riscos que devem ser mitigados para não afetar a comunidade do entorno.\n"
				+ "    Um dos exemplos de informação são nos casos em que em uma determinada região possui uma rede de "
				+ "dutos, empresas como a PETROBRAS costumam alertar sobre os perigos da área, bem como estabelecer "
				+ "canais de comunicação para esclarecimentos.";
		JTextArea textoArea = new JTextArea(texto,15,30);
		textoArea.setLineWrap(true);
		textoArea.setWrapStyleWord(true);
		textoArea.setBackground(new Color(0, 90, 107));
		textoArea.setForeground(Color.WHITE);
		box.setBackground(new Color(0, 90, 107));
		box.add(new JScrollPane(textoArea));		
		add(box, BorderLayout.SOUTH);		
	}	

}
