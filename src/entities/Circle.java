package entities;
import entities.enums.Color;
public class Circle extends Shape {
	// Atributo
	
	private Double radius;
	
	// Método Getter e Setter
	
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}
	
	// Método Construtor
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	// Método 
	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}
}
