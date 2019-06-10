package app;

import java.util.ArrayList;

public class Partida {
	private Personaje personaje;
	private String nombreJugador;
	private double puntajeJugador;
	private ListaDisponibles listaDisponibles;
	private HiloCronometro cronometro;
	
	public Partida() {
		super();
		personaje = new Personaje("Sin definir","Sin definir","Sin definir");
		setNombreJugador("Sin definir");
		setPuntajeJugador(0);
		listaDisponibles = new ListaDisponibles();
		cronometro = new HiloCronometro(new Cronometro());
		
	}
	
	
	public Partida(Personaje personaje,String nombreJugador) {
		super();
		this.personaje = personaje;
		setNombreJugador(nombreJugador);
		setPuntajeJugador(0);
		cronometro = new HiloCronometro(new Cronometro());
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
	
	public ArrayList<Elemento> getColeccionDisponibles() {
		return listaDisponibles.getColeccion();
	}
	
	public Elemento getElementoDeDisponibles (int index) {
		return listaDisponibles.getElemento(index);
	}
	
	public void agregarElementoDisponible(Elemento elemento) {
		listaDisponibles.agregar(elemento);
	}
	
	public boolean elementoYaDisponible(Elemento elemento) {
		return listaDisponibles.isElemento(elemento);
	}
	
	public void cargarIniciales(ListaDisponibles listaDisponibles) {
		
	}
}
