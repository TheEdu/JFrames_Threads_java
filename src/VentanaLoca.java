import java.awt.Container;
import javax.swing.JFrame;


public class VentanaLoca extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public VentanaLoca(){
		
		Container contenedor = this.getContentPane();
		contenedor.add(new PanelImage());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(350,350);
		this.setTitle("Ventana Loca");
		this.setResizable(false);
		setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	
	
	public void enloquecer(int x , int y){
		int radio = 200;
		double angulo = 0;
		int px,py;
		double ran = Math.random();
		
		while(isDisplayable()){
			
			if (angulo <= 2*(Math.PI)){
				px = (int) (radio * Math.cos(angulo));
				py = (int) (radio * Math.sin(angulo));
				angulo += 0.001;
			} else {
				angulo = 0.0;
				px = (int) (radio * Math.cos(angulo));
				py = (int) (radio * Math.sin(angulo));
			}

			this.setLocation((x+px), (y+py));
			
			try {
			    Thread.sleep((long) ran);                //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
		}	
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			VentanaLoca ventanaLoca = new VentanaLoca();
			ventanaLoca.enloquecer(200, 200);
			
	}

}
