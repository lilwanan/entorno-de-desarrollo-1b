package app;

import modelos.Rectangulo;

public class Main {

	public static void main(String[] args) {

		
		Rectangulo r1 =new Rectangulo();
		Rectangulo r2 =new Rectangulo ();
		double area_r1=r1.area();
		double perimetro_r2=r2.perimetro();
		System.out.println(area_r1);
		System.out.println(perimetro_r2);
		
	}

}
