package app;

public class TestTopPartidas {
	public static void main(String[] args) {
		ListaPartidas top3 = new ListaPartidas("Macri",3);
		//String nombreJugador,String personajeObjetivo,String timer,int puntaje
		top3.agregarATop(new RegistroPartida("Mati","Macri","00:00:01",1));
		top3.agregarATop(new RegistroPartida("Raul","Macri","00:00:05",5));
		top3.agregarATop(new RegistroPartida("Sandro","Macri","00:00:10",10));
		top3.agregarATop(new RegistroPartida("Leandro","Macri","00:00:14",14));
		top3.agregarATop(new RegistroPartida("Carla","Macri","00:00:00",0));
		System.out.println("Top: "+top3.getSize());
		top3.testMostrarTop();
	}

}
