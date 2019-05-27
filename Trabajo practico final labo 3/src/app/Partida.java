package app;

public class Partida {
	private Personaje personaje;
	private String nombreJugador;
	private double puntajeJugador;
	private Mezcladora mezcladora;
	private ListaDisponibles listaDisponibles;
	
	public Partida() {
		super();
	}
	
	public Partida(Personaje personaje,String nombreJugador,Mezcladora mezcladora) {
		super();
		this.personaje = personaje;
		setNombreJugador(nombreJugador);
		setPuntajeJugador(0);
		this.mezcladora = mezcladora;
		listaDisponibles = new ListaDisponibles ();
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
