package app;

public class ElementoSimple {
	private String codigo;
	private String nombreElemento;
	
	public ElementoSimple() {
		super();
	}
	
	public ElementoSimple(String codigo,String nombreElemento) {
		this.codigo=codigo;
		this.nombreElemento=nombreElemento;
	}

	public String getCodigo() {
		return codigo;
	}
	
	
	public String getNombreElemento() {
		return nombreElemento;
	}

	public void setNombreElemento(String nombreElemento) {
		this.nombreElemento = nombreElemento;
	}

	public String combinarAlfabeticamenteCon(ElementoSimple b) {
		if(getCodigo().compareTo(b.getCodigo())<0)
			return getCodigo()+b.getCodigo();
		else
			return b.getCodigo()+getCodigo();
	}
	
}
