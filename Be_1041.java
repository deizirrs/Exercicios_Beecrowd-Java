package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1041 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		float X = input.nextFloat();
		float Y = input.nextFloat();

		
		if(X > 0.0 && Y > 0.0) {
		System.out.println("Q1");
		}else if(X < 0.0 && Y > 0) {
			System.out.println("Q2");
		}else if(X < 0 && Y < 0) {
			System.out.println("Q3");
		}else if(X > 0 && Y < 0) {
			System.out.println("Q4");
		}else if(X == 0.0 && Y == 0) {
			System.out.println("Origem");
		}else if(X != 0.0 && Y == 0.0) {
			System.out.println("Eixo X");
		}else if(X == 0.0 && Y != 0.0) {
			System.out.println("Eixo Y");
		}
		
		
		input.close();

	}

}
