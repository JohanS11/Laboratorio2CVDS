package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
	
	/**
	 * Este metodo crea una figura y la retorna
	 * @param RegularShapeType type es algun tipo valido de la clase enum RegularShapeType
	 * @return retorna una figura que implementa la interfaz Shape
	 */
	public static Shape create(RegularShapeType type) {
		Shape shape = null;
		switch (type) {
			case Triangle : {shape = new Triangle(); 
				break;
			} case Quadrilateral : {shape = new Quadrilateral(); 
				break;
			} case Pentagon : {shape = new Pentagon();
				break;
			} case Hexagon : shape = new Hexagon();
		
		}
		return shape;
	}
	
}
