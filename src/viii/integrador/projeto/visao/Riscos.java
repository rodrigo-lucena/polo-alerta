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
public class Riscos extends JPanel{	
	private final JLabel titulo;
	private final JLabel imagem;
	private final String raiz = System.getProperty("user.dir");
	public Riscos() {
		setBackground(new Color(0, 90, 107));
		setLayout(new BorderLayout(5,5));		
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));	
				
		titulo = new JLabel("  Riscos");
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("courier", Font.PLAIN, 15));
		titulo.setHorizontalAlignment(SwingConstants.LEFT);	
		add(titulo, BorderLayout.NORTH);
		
		Icon polo = new ImageIcon(raiz+"/src/viii/integrador/projeto/imagens/riscos.png");	
		imagem = new JLabel(polo, SwingConstants.CENTER);		
		add(imagem, BorderLayout.CENTER);
			
		Box box = Box.createHorizontalBox();
		String texto = "    A indústria química é algo imprescindível na modernidade, tendo em vista as infinitas "
				+ "funções que exerce, seja para a geração de energia ou nos fármacos. Diante dessa importância, "
				+ "sempre é fundamental ressaltar os cuidados que as empresas que lidam com esses materiais.\n"
				+ "    Os cuidados não devem ser restritos as questões internas da fábrica porque os riscos também "
				+ "surgem na parte externa, como nos casos de poluição. É preciso levar em consideração fatores "
				+ "como a forma de exposição como a contaminação por vias de penetração (como a respiração) ou a "
				+ "exposição múltipla, como de quem trabalha e lida com os materiais. Assim, as empresas devem "
				+ "sempre se atentar as normas e legislações vigentes.";
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
