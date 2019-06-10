package app;

import java.util.ArrayList;
import java.util.Collection;

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

	@Override
	public void leerDeArchivo() {
		
	}

	@Override
	public <T> void cargarArchivo(Collection<T> coleccion) {
		// TODO Auto-generated method stub
		
	}
}
