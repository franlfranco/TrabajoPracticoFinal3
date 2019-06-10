package app;

import java.util.Collection;
import java.util.HashMap;

public class ListaDeElementos implements IArchivos {
	HashMap <String,Elemento>listaElementos;
	
	public ListaDeElementos() {
		super();
		listaElementos = new HashMap <String,Elemento>();
	}

	public void agregarElemento (String codigoAcceso, Elemento elemento) {
		listaElementos.put(codigoAcceso, elemento);
	}

	public void eliminarElemento(String codigoAcceso) {
		listaElementos.remove(codigoAcceso);
	}
	
	public Elemento getElemento(String codigoAcceso) {
		return listaElementos.get(codigoAcceso);
	}
	
	public boolean isElemento (String codigoAcceso) {
		if(listaElementos.containsKey(codigoAcceso))
			return true;
		else
			return false;
	}
	
	
	public boolean isElemento(Elemento elemento) {
		if(listaElementos.containsValue(elemento))
			return true;
		else return false;
	}
	
	@Override
	public void leerDeArchivo() {
		
	}

	@Override
	public <T> void cargarArchivo(Collection<T> coleccion) {
		// TODO Auto-generated method stub
		
	}
	
}
