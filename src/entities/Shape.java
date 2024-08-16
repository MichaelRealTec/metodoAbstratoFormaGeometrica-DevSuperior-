package entities;

import entities.enums.Color;

public abstract class Shape {
	// Atributo
	private Color color;
	
	// Método Getter e Setter
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	// Método Construtor
	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	// Método
	public abstract double area();
}