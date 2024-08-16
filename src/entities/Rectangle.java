package entities;

import entities.enums.Color;

public class Rectangle extends Shape {
	//Atributo
	
	private Double width; // width = largura
	private Double height; // height = altura
	
	// Método Getter e Setter
	
	public void setWidth(Double width) {
		this.width = width;
	}
	
	public Double getWidth() {
		return width;
	}
	
	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Double getHeight() {
		return height;
	}
	
	// Método Construtor
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	// Método
	@Override
	public double area() {
		return width * height;
	}
	
	
}
