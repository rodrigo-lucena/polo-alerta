package viii.integrador.projeto.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Timer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import viii.integrador.projeto.modelo.Memoria;
import viii.integrador.projeto.modelo.MemoriaObservador;


@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	private final JLabel titulo;
	private final JLabel imagem;
	private final JLabel mensagem;

	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		setBackground(new Color(0, 90, 107));
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		titulo = new JLabel("Polo Petroquímico de Capuava");
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("courier", Font.PLAIN, 15));
		titulo.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		
		add(titulo);
		
		Icon polo = new ImageIcon("C:/Users/Rodrigo/Documents/Projetos-Java-Eclipse/polo-alerta/src/viii/integrador/projeto/imagens/polo.png");
		
		imagem = new JLabel(polo, SwingConstants.RIGHT);
		
		add(imagem);
		
		mensagem = new JLabel(Memoria.getInstancia().getTextoAtual());
		add(mensagem);
		
		Timer timer = new Timer();
		timer.schedule(Memoria.getInstancia(), 0, 35000);
		

		
	}
	
	@Override
	public void valorAlterado(String estado) {
		mensagem.setText(estado);
		
	}

	

	

}
