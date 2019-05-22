package app;

import java.util.HashMap;

public class ListaElementos {
	HashMap <String,ElementoSimple> listaElementos;
	
	public ListaElementos() {
		super();
		listaElementos = new HashMap <String,ElementoSimple>();
	}

	public void agregarElemento (String codigo, ElementoSimple elemento) {
		listaElementos.put(codigo, elemento);
	}
	
	public ElementoSimple retornarElemento (String codigo) {
		return listaElementos.get(codigo);
	}
	
	public boolean codigoExistente (String codigo) {
		if(listaElementos.containsKey(codigo))
			return true;
		else
			return false;
	}
	
	
}
