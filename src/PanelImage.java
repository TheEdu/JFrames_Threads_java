import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public PanelImage(){
		
	}
	
	
	public void paintComponent(Graphics grafico){
		
		Image imagenFondo;
		URL fondo;
		super.paintComponent(grafico);
		fondo = this.getClass().getResource("/Imagen/Negro.jpg");
		imagenFondo = new ImageIcon(fondo).getImage();
		grafico.drawImage(imagenFondo, 0, 0, getWidth(),getHeight(),null);
		
	}
	

}
