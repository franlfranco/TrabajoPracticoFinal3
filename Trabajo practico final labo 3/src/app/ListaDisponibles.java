package app;

import java.util.ArrayList;

public class ListaDisponibles {
	private ArrayList <ElementoSimple> disponibles;
	
	public ListaDisponibles () {
		disponibles = new ArrayList <ElementoSimple> ();
		disponibles.add(new ElementoSimple("P","Persona"));
		disponibles.add(new ElementoSimple("p","Profesor"));
		disponibles.add(new ElementoSimple("T","Trabajo"));
		disponibles.add(new ElementoSimple("C","Criatura"));
		disponibles.add(new ElementoSimple("F","Felino"));
		disponibles.add(new ElementoSimple("c","Cobra"));
	}
	
	public void agregarADisponible (ElementoSimple elem) {
		disponibles.add(elem);
	}
	
	public ElementoSimple retornarElemento (int index) {
		return disponibles.get(index);
	}
	
	public ArrayList<ElementoSimple> retornarColeccion () {
		return disponibles;
	}
	
	public boolean elementoYaDisponible (ElementoSimple elem) {
		for(ElementoSimple e:disponibles) {
			if(e.getNombreElemento().equals(elem.getNombreElemento()))
				return true;
		}
		return false;
	}

}
