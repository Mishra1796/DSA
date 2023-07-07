import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter integer nu ");
			int val = sc.nextInt();
			int i=1;
			int j=1;
			while( i<=val) {
				
				while(j<=val) {
					System.out.println(val-j+1);
					j=j+1;
				}
				System.out.println();
				i=i+1;
				
			}
		}
	}
	
}
