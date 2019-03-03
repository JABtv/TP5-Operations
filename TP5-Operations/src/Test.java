import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char operateurs[] = {'+','-','/','*'};
		
		System.out.println("Entre un premier numero");
		int numberNote = scan.nextInt();
		
		System.out.println("Entre un deuxième numero");
		int numberNote2 = scan.nextInt();
		
		System.out.println("Quel operateur voulez vous utiliser");
		System.out.println("Addition = +");
		System.out.println("Soustraction = -");
		System.out.println("Multiplication = *");
		System.out.println("Division = /");
		char operateursS = scan.next().charAt(0);

		if (operateursS == operateurs[0]) {
			System.out.println(numberNote+numberNote2);
		}
		else if (operateursS == operateurs[1]) {
			System.out.println(numberNote-numberNote2);
		}
		else if (operateursS == operateurs[2]) {
			System.out.println(numberNote/numberNote2);
		}
		else if (operateursS == operateurs[3]) {
			System.out.println(numberNote%numberNote2);
		}
		else if (operateursS == operateurs[4]) {
			System.out.println(numberNote*numberNote2);
		}
	} 
}