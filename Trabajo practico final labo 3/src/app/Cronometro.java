package app;

public class Cronometro implements Runnable {
	private int minutos;
	private int segundos;
	private int milisegundos;
	private boolean play;
	private boolean activo;
	
	public Cronometro() {
		super();
		this.minutos=0;
		this.segundos=0;
		this.milisegundos=0;
		play=false;
		activo=true;
	}
	

	@Override
	public String toString() {
		String patron = "%02d : %02d : %02d";
		String timer = String.format(patron, getMinutos(),getSegundos(),getMilisegundos());
		return timer;
	}


	@Override
	public void run() {
		while(activo) {
			try {
				if(play) {
					Thread.sleep(10);
					milisegundos++;
					if(milisegundos==100) {
						milisegundos=0;
						segundos++;
					}
					if(segundos==60) {
						segundos=0;
						minutos++;
					}
				}else {
					wait();
				}
			}catch (Exception e) {
			}
		}
	}

	public void pause() {
		if(play) 
			play=false;
	}
	
	public void reset() {
		this.minutos=0;
		this.segundos=0;
		this.milisegundos=0;
		play=false;
	}
	
	public void close() {
		activo=false;
	}
	
	public void play() {
		if(!play) {
			play=true;
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public int getMilisegundos() {
		return milisegundos;
	}
	
	public boolean getPlay() {
		return play;
	}

	public void setPlay(boolean play) {
		this.play=play;
	}
	
	
}
