package if¹®;

import java.util.Scanner;

public class num5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		if(m >= 45) {
			System.out.println(h + " " + (m - 45));
		}
		else {
			int m2 = m - 45;
			if(h >= 1) {
				
				System.out.println((h-1) + " " + (60+m2));
			}
			else {
				System.out.println(23 + " " + (60+m2));
			}
			
		}
	}
}
