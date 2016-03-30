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
	
	public Image imagenFondo;
	public URL fondo;


	public PanelImage(){
	
		fondo = this.getClass().getResource("/Imagen/Negro1.jpg");
		imagenFondo = new ImageIcon(fondo).getImage();
		
		
	}
	
	public void paintComponent(Graphics grafico){
		grafico.drawImage(imagenFondo, 0, 0, getWidth(),getHeight(),null);
	}
	

}
