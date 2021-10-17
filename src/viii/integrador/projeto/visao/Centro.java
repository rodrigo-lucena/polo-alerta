package viii.integrador.projeto.visao;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Centro extends JPanel {
	private final JLabel estado;
	private final Icon FIGURA_POSITIVO = new ImageIcon("C:/Users/Rodrigo/Documents/Projetos-Java-Eclipse/polo-alerta/src/viii/integrador/projeto/imagens/positivo3.png");
	private final Icon FIGURA_NEGATIVO = new ImageIcon("C:/Users/Rodrigo/Documents/Projetos-Java-Eclipse/polo-alerta/src/viii/integrador/projeto/imagens/negativo3.png");
	
	public Centro() {
		setBackground(new Color(0, 90, 107));
		setLayout(new FlowLayout());
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	
		estado = new JLabel("Nenhuma ocorrência",FIGURA_POSITIVO, SwingConstants.LEFT);		
		estado.setIconTextGap(5);
		estado.setForeground(Color.GREEN);
		estado.setFont(new Font("courier", Font.BOLD, 20));
		estado.setBackground(Color.WHITE);		
		add(estado);
		
		//Timer timer = new Timer();
		//timer.schedule(Memoria.getInstancia(), 0, 35000);
		
		// Evento:
		//estado.setIcon(FIGURA_NEGATIVO);
		//estado.setText("ESTADO DE EMERGÊNCIA");
		//estado.setForeground(Color.RED);
		
		
		
		
		
	}

}
