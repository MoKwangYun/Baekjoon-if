package if¹®;

import java.util.Scanner;

public class num2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a >= 90 && a <= 100)
			System.out.println("A");
		else if(a>=80 && a <= 89)
			System.out.println("B");
		else if(a>=70 && a <= 79)
			System.out.println("C");
		else if(a>=60 && a <= 69)
			System.out.println("D");
		else 
			System.out.println("F");
		
		switch(a / 10) {
			case 10: case 9:{
				System.out.println("A");
				break;
		}
			case 8:{
				System.out.println("B");
				break;
		}
			case 7:{
				System.out.println("C");
				break;
		}
			case 6:{
				System.out.println("D");
				break;
			}
			default:
				System.out.println("F");




		}
	}
}
