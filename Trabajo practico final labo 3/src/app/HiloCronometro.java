package app;

/**
 *  LLamada = HiloCronometro id_name = new HiloCronometro(new Cronometro());
 * 	
 *
 */

public class HiloCronometro
{
	Cronometro cronometro;
	Thread thread=null;
	
	public HiloCronometro(Cronometro cronometro) { ///Constructor inicializa con un cronometro (new Cronometro();)
		this.cronometro = cronometro;
		thread = new Thread(cronometro);
		thread.start();
	}

	public void play() { ///Continua el cronometro
		if(!cronometro.getPlay()) {
			cronometro.play();
		}
	}

	public void pause() { ///Pausa el cronometro (No finaliza el cronometro)
		if(cronometro.getPlay() && thread!=null) {
			cronometro.pause();
		}
			
	}
	
	public void reset() { ///Reinicia el cronometro (Valores a 0)
		if(thread != null)
			cronometro.reset();
	}
	
	public void close() { ///Pausa y finaliza el proceso hilo (No se puede reanudar el play, solo obtener el tiempo
		if(thread != null)
			cronometro.close();
	}

	public int getMinutos() {
		return cronometro.getMinutos();
	}

	public int getSegundos() {
		return cronometro.getSegundos();
	}

	public int getMilisegundos() {
		return cronometro.getMilisegundos();
	}
	
	public boolean getPlay() {
		return cronometro.getPlay();
	}
	
	public String getTimer() { ///Retorna string formato: 00:00:00
		return cronometro.toString();
	}
	
	public int getPuntaje() {
		int puntaje= cronometro.getMilisegundos()+cronometro.getSegundos()*1000+cronometro.getMinutos()*60*1000;
		return puntaje;
	}
}
