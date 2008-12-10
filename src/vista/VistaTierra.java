package vista;

import modelo.Nivel;
import modelo.SuperficieDeDibujo;
import modelo.Terreno;

@SuppressWarnings("serial")
public class VistaTierra extends Imagen{
	private String archivoImagen = "..//lospooglins//imagenes//tierra.jpg";
	public VistaTierra() {
		this.setNombreArchivoImagen(archivoImagen);
	}
	
	@Override
	public void dibujar(SuperficieDeDibujo superficeDeDibujo) {
		super.dibujar(superficeDeDibujo);
		Nivel nivel = Nivel.getInstance();
		Terreno terreno = nivel.getTerreno(this.getPosicionable().getPosicionX(), this.getPosicionable().getPosicionY());
		String nombreDelTerreno = terreno.getClass().getName();
		
		if(nombreDelTerreno.equals("modelo.Vacio")) this.setNombreArchivoImagen("..//lospooglins//imagenes//vacio.jpg"); 
		
		
		
		/*if(((Tierra)terreno).getResistencia()==3)
			this.setNombreArchivoImagen("..//lospooglins//imagenes//TierreConPozo//Tierra 1.jpg");
		
		if(((Tierra)terreno).getResistencia()==2)
			this.setNombreArchivoImagen("..//lospooglins//imagenes//TierreConPozo//Tierra 1.jpg");

		if(((Tierra)terreno).getResistencia()==1)
			this.setNombreArchivoImagen("..//lospooglins//imagenes//TierreConPozo//Tierra 1.jpg");
		
		if(((Tierra)terreno).getResistencia()==0)
			this.setNombreArchivoImagen("..//lospooglins//imagenes//TierreConPozo//Tierra 1.jpg");
		
*/		//("modelo.Vacio")
		
//		Graphics grafico = ((Ventana)superficeDeDibujo).getGrafico();
//		grafico.drawImage(this.imagen, this.posicionable.getPosicionX()*PosicionEnPantalla, this.posicionable.getPosicionY()*PosicionEnPantalla, null);
	}
	    
	
}
