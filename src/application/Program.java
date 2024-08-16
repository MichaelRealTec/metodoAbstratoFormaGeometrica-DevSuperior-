package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// metodoAbstratoFormaGeometrica-DevSuperior

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Variável
		int n;
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle ou Circle (r/c)? ");
			char typeShape = sc.next().charAt(0);
			while (typeShape != 'r' && typeShape != 'c') {
				System.out.println("Erro, digite novamente o valor válido!");
				typeShape = sc.next().charAt(0);
			}
			if (typeShape == 'r') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next()); // valueOf -> converte para o formato informado
				// Color color = Color.valueOf(sc.next());
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				Shape rectangle = new Rectangle(color, width, height);
				list.add(rectangle);

			} else if (typeShape == 'c') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next());
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				Shape circle = new Circle(color, radius);
				list.add(circle);
			}

		}
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));

		}

		sc.close();
	}

}
