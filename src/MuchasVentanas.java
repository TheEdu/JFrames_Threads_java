
public class MuchasVentanas {

	public static void main(String[] args) {
		HiloTest hilo1  = new HiloTest(200,100);
		HiloTest hilo2  = new HiloTest(400, 100);
		HiloTest hilo3  = new HiloTest(300, 200);
		HiloTest hilo4  = new HiloTest(200, 300);
		HiloTest hilo5  = new HiloTest(400, 300);
		HiloTest hilo6  = new HiloTest(400,300);
		HiloTest hilo7  = new HiloTest(700, 150);
		HiloTest hilo8  = new HiloTest(450, 220);
		HiloTest hilo9  = new HiloTest(324, 451);
		HiloTest hilo10 = new HiloTest(451,74);
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		hilo6.start();
		hilo7.start();
		hilo8.start();
		hilo9.start();
		hilo10.start();
		
		
	}

}
