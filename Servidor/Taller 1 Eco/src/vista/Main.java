package vista;


import modelo.Comunicación;
import modelo.Logica;
import processing.core.PApplet;

public class Main extends PApplet{
	
	
	
	Logica logica;


	public static void main(String[] args) {
		PApplet.main("vista.Main");

	}

	public void settings() {
		size(500,500);
	}
	
	public void setup() {
	
		logica= new Logica(this);
		logica.comunicacion();
		
	}
	
	public void draw() {
		background(255);
		logica.pintar(this);
	
	}
	public void keyPressed() {
		logica.mover(this);
		logica.estamina(this);
		
	}
}
