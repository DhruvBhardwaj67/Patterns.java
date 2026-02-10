import java.util.*;
public class palindromicPattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= rows-i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for(int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		input.close();

	}

}
