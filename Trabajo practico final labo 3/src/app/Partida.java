package app;

public class Partida {
	private Personaje personaje;
	private String nombreJugador;
	private double puntajeJugador;
	private ListaDisponibles listaDisponibles;
	private HiloCronometro cronometro;
	
	public Partida() {
		super();
	}
	
	public Partida(Personaje personaje,String nombreJugador) {
		super();
		this.personaje = personaje;
		setNombreJugador(nombreJugador);
		setPuntajeJugador(0);
		listaDisponibles = new ListaDisponibles ();
		cronometro = new HiloCronometro(new Cronometro());
	}

	
	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public double getPuntajeJugador() {
		return puntajeJugador;
	}

	public void setPuntajeJugador(double puntajeJugador) {
		this.puntajeJugador = puntajeJugador;
	}
}
