
package modelos;


public class Rectangulo extends Figura {

	 private double base;
	 private double altura;
	 /**
	  * Constructor por defecto. Crea un rectangulo con base y altura 1metros
	  */
	 public Rectangulo () {
		 this.base=1;
		 this.altura=1;
		 
	 }
	 /**
	  * Constructor que recibe como parametros la base y la altura del rectangulo,
	  * en metros
	  * @param base base del rectangulo en m
	  * @param altura altura del rectangulo en m
	  */
	 public Rectangulo (double base, double altura) {
		 this.base= base;
		 this.altura=altura;
	 }
	/**
	 * @see modelos.Figura#area()
	 */
	@Override
	public double area() {
		 return base*altura;
	}
/**
 * @see modelos.Figura#perimetro()
 */
	@Override
	public double perimetro() {
		return 2*base+altura;
	}

	
}
