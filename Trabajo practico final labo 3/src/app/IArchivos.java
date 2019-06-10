package app;

import java.io.File;
import java.util.Collection;

public interface IArchivos {
	
	public void leerDeArchivo();
	
	public <T> void cargarArchivo(Collection <T> coleccion);
}
