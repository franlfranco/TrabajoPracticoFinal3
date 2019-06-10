package app;

public class ElementoCompuesto extends Elemento {
	private String codigoAcceso;
	
	public ElementoCompuesto() {
		super();
	}
	
	public ElementoCompuesto(String codigo,String nombreElemento,String codigoAcceso) {
		super(codigo,nombreElemento);
		this.codigoAcceso=codigoAcceso;
	}

	public String getCodigoAcceso() {
		return codigoAcceso;
	}
}
