

import java.net.URL;


import javax.swing.*;

public class VentanaLocaLabel extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaLocaLabel() {
		  URL url = this.getClass().getResource("/Imagen/3E0.gif");
	      Icon icon = new ImageIcon(url);
	      JLabel label = new JLabel(icon);
	      this.add(label);
	      this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	      this.setSize(232,232);
	      this.setTitle("Ventana Loca");
	      this.setResizable(false);
	      setLocationRelativeTo(null);
	      this.setVisible(true);
		
	}
	
	public void enloquecer(int x , int y){
		int radio = 200;
		double angulo = 0;
		int px,py;
		//double ran = Math.random();
		
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
			    Thread.sleep(0);                //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
		}	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaLocaLabel ventanaLocaLabel = new VentanaLocaLabel();
		ventanaLocaLabel.enloquecer(200, 200);

	}

}
