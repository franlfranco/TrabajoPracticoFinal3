package app;


///Al crearlo, escribir: Thread id_nombre = new Thread(new Cronometro());
///Para iniciarlo = id_nombre.start();

public class Cronometro implements Runnable {
	private int minutos;
	private int segundos;
	private int milisegundos;
	private boolean play = false;
	
	public Cronometro() {
		super();
		this.minutos=0;
		this.segundos=0;
		this.milisegundos=0;
		play=true;
	}
	
	@Override
	public void run() {
		while(play) {
			try {
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
				System.out.println(getTimer());
			}catch (Exception e) {
				System.out.println("Error en cronometro");
			}
		}
	}
	
	public String getTimer() {
		String patron = "%02d : %02d : %02d";
		String timer = String.format(patron, minutos,segundos,milisegundos);
		return timer;
	}

	public void pause() {
		if(play) 
			play=false;
	}
	
	public void play() {
		if(!play)
			play=true;
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
	
	
}
