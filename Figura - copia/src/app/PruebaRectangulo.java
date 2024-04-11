package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import modelos.Rectangulo;

class PruebaRectangulo {

	static Rectangulo r1;
	static Rectangulo r2;
	@BeforeAll
	static void setup() {
		r1=new Rectangulo();
		r2=new Rectangulo(3,2);
	}
	
	@Test
	
	void areaR1() {
		double areaEsperada=1;
		double areaObtenida = r1.area();
		assertEquals(areaEsperada,areaObtenida);
	}
	@Test
	void areaR2() {
		double areaEsperada = 6;
		double areaObtenida = r2.area();
		assertEquals(areaEsperada,areaObtenida);
	}
	@Test
	void perimetroR1() {
		double perimetroEsperado =3;
		double perimetroObtenido = r1.perimetro();
		assertEquals(perimetroEsperado,perimetroObtenido);
	}
	@Test
	void perimetroR2() {
		double perimetroEsperado =8;
		double perimetroObtenido = r2.perimetro();
		assertEquals(perimetroEsperado,perimetroObtenido);
	}

}
