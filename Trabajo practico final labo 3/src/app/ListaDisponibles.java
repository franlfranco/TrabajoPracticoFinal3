package app;

import java.util.ArrayList;

public class ListaDisponibles implements IArchivos {
	private ArrayList <Elemento> disponibles;
	
	public ListaDisponibles () {
		disponibles=new ArrayList<Elemento>();
	}
	

	
	public void agregar (Elemento elemento) {
		disponibles.add(elemento);
	}
	
	public Elemento getElemento (int index) {
		return disponibles.get(index);
	}
	
	public ArrayList<Elemento> getColeccion () {
		return disponibles;
	}
	
	public boolean isElemento (Elemento elemento) {
		for(Elemento e:disponibles) {
			if(e.getNombreElemento().equals(elemento.getNombreElemento()))
				return true;
		}
		return false;
	}

	public void leerDeArchivo() {
		
	}
}
