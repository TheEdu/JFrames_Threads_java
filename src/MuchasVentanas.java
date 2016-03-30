
public class MuchasVentanas {

	public static void main(String[] args) {
		HiloTest hilo1 = new HiloTest(200,100);
		HiloTest hilo2 = new HiloTest(400, 100);
		HiloTest hilo3 = new HiloTest(300, 200);
		HiloTest hilo4 = new HiloTest(200, 300);
		HiloTest hilo5 = new HiloTest(400, 300);
		HiloTest hilo11 = new HiloTest(400,300);
		HiloTest hilo21 = new HiloTest(700, 150);
		HiloTest hilo31 = new HiloTest(450, 220);
		HiloTest hilo41 = new HiloTest(324, 451);
		HiloTest hilo51 = new HiloTest(451,74);
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		hilo11.start();
		hilo21.start();
		hilo31.start();
		hilo41.start();
		hilo51.start();
		
		
	}

}
