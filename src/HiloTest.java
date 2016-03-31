

public class HiloTest  extends Thread{
	private int x;
	private int y;
	private boolean seguirHilo = true;
	
	public HiloTest(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public void run(){
		while(seguirHilo){
			VentanaLocaLabel ventanaLoca = new VentanaLocaLabel();
			ventanaLoca.enloquecer(x, y);
			pararHilo(true);
		}
	}
	
	public void pararHilo(boolean e){
		seguirHilo = !e;
	}
	
	
	public static void main(String[] args){
		HiloTest hiloTest = new HiloTest(200, 200);
		hiloTest.start();
	}
	
}
