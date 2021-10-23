package viii.integrador.projeto.modelo;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Audio {
	Clip clip;
	public Audio() {
		
		try {
			String nome = System.getProperty("user.dir")+"/src/viii/integrador/projeto/sons/alarme.wav";
			File file = new File(nome); 
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);			
			clip = AudioSystem.getClip();		
			clip.open(stream);	
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (Exception e) {
			throw new Error(e.getMessage());
		}
	}
	public void play() {
		clip.start();
		
	}
	public void stop() {
		clip.stop();
	}

}
