package viii.integrador.projeto.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import viii.integrador.projeto.modelo.Audio;
import viii.integrador.projeto.modelo.Aviso;
import viii.integrador.projeto.modelo.ConsultaAviso;

@SuppressWarnings("serial")
public class Centro extends JPanel {
	private List<Aviso> avisos = new ArrayList<Aviso>();
	private List<Aviso> avisos_ant = new ArrayList<Aviso>();
	private final JLabel estado;
	private final JButton icone;
	private final String raiz = System.getProperty("user.dir");
	private final Icon FIGURA_POSITIVO = new ImageIcon(raiz+"/src/viii/integrador/projeto/imagens/positivo3.png");
	private final Icon FIGURA_NEGATIVO = new ImageIcon(raiz+"/src/viii/integrador/projeto/imagens/negativo3.png");
	private final Icon ATENCAO = new ImageIcon(raiz+"/src/viii/integrador/projeto/imagens/atencao.png");
	private String mensagens="Nenhuma ocorrência";

	public Centro() {
		
		setBackground(new Color(0, 90, 107));
		setLayout(new FlowLayout());
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		icone = new JButton("",FIGURA_POSITIVO);
		add(icone);
		
		EventoCentro evento = new EventoCentro();
		icone.addActionListener(evento);
		
		estado = new JLabel("Nenhuma ocorrência", SwingConstants.LEFT);		
		estado.setIconTextGap(5);
		estado.setForeground(Color.GREEN);
		estado.setFont(new Font("courier", Font.BOLD, 20));
		estado.setBackground(Color.WHITE);		
		add(estado);
				
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			public void run()  {
				try {
					avisos = ConsultaAviso.consultar();
					if (!avisos.isEmpty()) {					
						if (!avisos.equals(avisos_ant)) {
							mensagens = "";
							for (Aviso aviso : avisos) {
								mensagens += aviso.getEmpresa() + " : " + aviso.getAviso() + "\n\n"; 
							}
							icone.setIcon(FIGURA_NEGATIVO);
							estado.setText("ESTADO DE EMERGÊNCIA");
							estado.setForeground(Color.RED);
							Audio audio = new Audio();
							audio.play();
							JOptionPane.showConfirmDialog(getParent(), mensagens, "ALERTA", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, ATENCAO);
							audio.stop();
							avisos_ant = avisos;
						}						
					}else {
						icone.setIcon(FIGURA_POSITIVO);
						estado.setText("Nenhuma ocorrência");
						estado.setForeground(Color.GREEN);
						mensagens="Nenhuma ocorrência";
						avisos_ant = avisos;
					}					
				} catch (Exception e) {
					e.printStackTrace();
				}			 
			}
		};
		t.schedule(tt, new Date(),1000);	
	}
	
	private class EventoCentro implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showConfirmDialog(getParent(), mensagens, "ALERTA", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, ATENCAO);		
		}
	}	
	
}

