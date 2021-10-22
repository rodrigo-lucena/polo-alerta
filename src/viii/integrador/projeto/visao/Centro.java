package viii.integrador.projeto.visao;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import viii.integrador.projeto.modelo.Audio;
import viii.integrador.projeto.modelo.Aviso;
import viii.integrador.projeto.modelo.ConsultaAviso;

@SuppressWarnings("serial")
public class Centro extends JPanel {
	private int alternar = 0;
	private List<Aviso> avisos = new ArrayList<Aviso>();
	private final JLabel estado;
	private final Icon FIGURA_POSITIVO = new ImageIcon("C:/Users/Rodrigo/Documents/Projetos-Java-Eclipse/polo-alerta/src/viii/integrador/projeto/imagens/positivo3.png");
	private final Icon FIGURA_NEGATIVO = new ImageIcon("C:/Users/Rodrigo/Documents/Projetos-Java-Eclipse/polo-alerta/src/viii/integrador/projeto/imagens/negativo3.png");
	private final Icon ATENCAO = new ImageIcon("C:/Users/Rodrigo/Documents/Projetos-Java-Eclipse/polo-alerta/src/viii/integrador/projeto/imagens/atencao.png");
	private String mensagens="";
	
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
		
		
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			public void run()  {
				try {
					avisos = ConsultaAviso.consultar();
					if (!avisos.isEmpty()) {// mudar: se lista EVENTOS for diferente da anterior, entrar. Usar EVENTO_ant.equal(EVENTO_atual)
						
						if (alternar == 0) {
							for (Aviso aviso : avisos) {
								mensagens += aviso.getEmpresa() + " : " + aviso.getAviso() + "\n\n"; 
							}
							//transformar ícone em um botão que ao clicar exiba a mesma msgm de JOptionPane 
							//Se ocorrer um segundo evento, arranjar uma forma de tocar o alarme novamente e mostrar o popup.
							// solução: criar uma lista (EVENTOS) q guardará os ids dos eventos e fazer a comparação dessa lista a cada consulta no BD
							estado.setIcon(FIGURA_NEGATIVO);
							estado.setText("ESTADO DE EMERGÊNCIA");
							estado.setForeground(Color.RED);
							Audio audio = new Audio();
							audio.play();
							JOptionPane.showConfirmDialog(getParent(), mensagens, "ALERTA", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, ATENCAO);
							audio.stop();
							
							alternar=1;
						}						
					}else {
						estado.setIcon(FIGURA_POSITIVO);
						estado.setText("Nenhuma ocorrência");
						estado.setForeground(Color.GREEN);
						alternar=0;
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				

				 
			}
		};
		t.schedule(tt, new Date(),1000);
		
		
	}


}
