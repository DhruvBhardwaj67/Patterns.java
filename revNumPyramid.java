import java.util.*;
public class revNumPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 
	      12345
          1234
          123
          12
          1

		 */
		System.out.print("Enter the no of rows or Columns : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
