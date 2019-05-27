package app;

public class Mezcladora {
	private ListaDeElementos listaDeElementos;
	
	public String ordenarCodigo (Elemento a,Elemento b) {
		if(a.getCodigo().compareTo(b.getCodigo())<0)
			return a.getCodigo()+b.getCodigo();
		else
			return b.getCodigo()+a.getCodigo();
	}

	public boolean isElemento(String codigoAcceso) {
		return listaDeElementos.isElemento(codigoAcceso);
	}
	
	public Elemento getElemento (String codigo) {
		return listaDeElementos.getElemento(codigo);
	}
	
	public ElementoCompuesto getElementoCompuesto (String codigoAcceso) {
		return (ElementoCompuesto)listaDeElementos.getElemento(codigoAcceso);
	}
	
	public ElementoCompuesto mezclar (Elemento a, Elemento b) {
		String codigoAcceso = ordenarCodigo(a,b);
		if(isElemento(codigoAcceso))
			return getElementoCompuesto(codigoAcceso);
		else
			return null;
	}
}
