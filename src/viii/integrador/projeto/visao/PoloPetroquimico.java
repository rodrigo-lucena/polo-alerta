package viii.integrador.projeto.visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;



@SuppressWarnings("serial")
public class PoloPetroquimico extends JPanel {
	private final JLabel titulo;
	private final JLabel imagem;
	private final String raiz = System.getProperty("user.dir");
	public PoloPetroquimico() {
		setBackground(new Color(0, 90, 107));
		setLayout(new BorderLayout(5,5));
		
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		
		
		titulo = new JLabel("  Polo Petroquímico de Capuava");
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("courier", Font.PLAIN, 15));
		titulo.setHorizontalAlignment(SwingConstants.LEFT);	
		add(titulo, BorderLayout.NORTH);
		
		Icon polo = new ImageIcon(raiz+"/src/viii/integrador/projeto/imagens/polo.png");	
		imagem = new JLabel(polo, SwingConstants.CENTER);		
		add(imagem, BorderLayout.CENTER);
		
		
		
		Box box = Box.createHorizontalBox();
		String texto = "Constitui-se polo petroquímico, como o caso de Capuava na região do ABC Paulista, "
				+ "um conjunto de empresas que atuam na extensa cadeia produtiva do setor, desde refinaria "
				+ "de petróleo até engarrafadoras de gás. Por ser uma indústria de base, a petroquímica é "
				+ "considerada a primeira geração da indústria química e elo inicial de diversos segmentos "
				+ "de mercado, produzem etileno, propileno, polietileno dentre outros petroquímicos que "
				+ "são matérias-primas para a fabricação de borrachas, tintas, produtos farmacêuticos, "
				+ "vidros, embalagens, resinas, tubos, mangueiras, calçados, filmes plásticos, peças "
				+ "injetadas, adesivos, espumas expandidas, agrotóxicos, portas, janelas, cosméticos.";
		JTextArea textoArea = new JTextArea(texto,15,30);
		textoArea.setLineWrap(true);
		//textoArea.setSize(10, 20);
		textoArea.setBackground(new Color(0, 90, 107));
		textoArea.setForeground(Color.WHITE);
		box.setBackground(new Color(0, 90, 107));
		box.add(new JScrollPane(textoArea));
		
		add(box, BorderLayout.SOUTH);

		

		
	}

}
