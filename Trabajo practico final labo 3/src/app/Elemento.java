package app;

public abstract class Elemento {
	private String codigo;
	private String nombreElemento;
	
	public Elemento() {
		super();
	}
	
	public Elemento(String codigo,String nombreElemento) {
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

	/*public String combinarAlfabeticamenteCon(Elemento b) {
		
	}*/
	
}
