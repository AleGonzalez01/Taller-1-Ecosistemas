package modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Tortuga {
	float X,Y;
	PImage tortuga, estamina, nivel1, nivel2,nivel3,nivel4,nivel5;
	int velocidad;
	PApplet p;
	int contador;
	boolean uno,dos,tres,cuatro,cinco;
	public Tortuga(float X, float Y, PApplet p) {
		this.X=X;
		this.Y=Y;
		tortuga= p.loadImage("imagenes/tortuga.png");
		estamina= p.loadImage("imagenes/estaminaT.png");
		nivel1=p.loadImage("imagenes/nivel1.png");
		nivel2=p.loadImage("imagenes/nivel2.png");
		nivel3=p.loadImage("imagenes/nivel3.png");
		nivel4=p.loadImage("imagenes/nivel4.png");
		nivel5=p.loadImage("imagenes/nivel5.png");
		this.contador= 0;
		this.uno = false;
		this.dos = false;
		this.tres = false;
		this.cuatro = false;
		this.cinco = false;
	}
	
	public void pintar(PApplet p) {
		p.image(tortuga, X, Y,103,40);
		p.image(estamina, 230, 40,270,40);
		
		if(p.frameCount %5 ==0) {
			contador++;
		}

		
		if(uno== true) {
			p.image(nivel1, 295, 40,203,38);
		}
		if(dos== true) {
			p.image(nivel2, 295, 40,203,38);
		}
		if(tres== true) {
			p.image(nivel3, 295, 40,203,38);
		}
		if(cuatro== true) {
			p.image(nivel4, 295, 40,203,38);
		}
		if(cinco== true) {
			p.image(nivel5, 295, 40,203,38);
		}
		
		switch(contador) {
		case 5:
			uno=true;
			break;
		case 10:
			uno =false;
			dos= true;
			break;
		case 15:
			
			dos= false;
			uno=false;
			tres=true;
			break;
		case 20:
		
			tres=false;
			dos= false;
			uno=false;
			cuatro=true;
			break;
		case 25:
			
			cuatro=false;
			tres=false;
			dos= false;
			uno=false;
			cinco=true;
			break;
		case 30:
			cuatro=false;
			tres=false;
			dos= false;
			uno=false;
			cinco=false;
			break;
		}
	}
	
	public void mover() {
	
	}
	
	public void recargarEstamina(PApplet p) {
	
	}
}
