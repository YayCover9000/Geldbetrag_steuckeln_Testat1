import java.util.Scanner;
public class Geldbetrag_steuckeln_Testat1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //120
		int a; //50er
		int b; //20er
		int c; //10er
		
		if(x >=10 && x<= 1000) {
			if(x % 10 == 0) {
				a = (x/50);
				x = (x-(a*50));
				
				b = (x/20);
				x = (x-(b*20));
				
				c = (x/10);
				x = (x-(c*10));
				System.out.println(a + " x 50\n" + b + " x 20\n" + c + " x 10");
			} else {
				System.out.println("Eingabefehler");
			}
		} else {
			System.out.println("Eingabefehler");
		}
	}
}
