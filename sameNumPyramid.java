import java.util.*;
public class sameNumPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= (rows - i); j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		input.close();

	}

}
