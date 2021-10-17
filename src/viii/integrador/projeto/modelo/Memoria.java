package viii.integrador.projeto.modelo;


import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;





public class Memoria extends TimerTask{
	private static final Memoria instancia = new Memoria();
	private String estado = "Indefinido";
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	Date instanteAtual;
	
	private Memoria() {
		
	}

	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}

	public String getTextoAtual() {
		return estado;
	}
	
	public void processarComando(String texto) {
		//textoAtual += valor;
		observadores.forEach(o -> o.valorAlterado(texto));
	}
	
	@Override
	public void run() {
		
		// fazer busca no banco de dados
		instanteAtual = new Date();
		
		String instante = instanteAtual.toString();
		this.estado = instante;
		//System.out.println(instante);
		//System.out.println(estado);
		//System.out.println(observadores);
		
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
		
		try {
			String nome = "C:/Users/Rodrigo/Documents/Projetos-Java-Eclipse/polo-alerta/src/viii/integrador/projeto/sons/som2.wav";
			File file = new File(nome); 
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
			//clip.stop(); para parar
			
		} catch (Throwable ex) {
			throw new Error(ex.getMessage());
		}
		
		
		
		
        

		
	}
	

}
