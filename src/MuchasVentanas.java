
public class MuchasVentanas {
	
	
	public void mostrarVentanas(int cantidadVentanas) {
		HiloTest ventana;
		double x;
		double y;
		for (int i = 0; i < cantidadVentanas; i++) {
			
			x = (Math.random())*1000;
			y = (Math.random())*1000;
			ventana = new HiloTest((int) x,(int) y);
			ventana.start();
			
		}
	}

	public static void main(String[] args) {
		MuchasVentanas muchasVentanas = new MuchasVentanas();
		muchasVentanas.mostrarVentanas(15);
		
	}

}
