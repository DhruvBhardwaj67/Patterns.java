import java.util.*;
public class halfNumPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 
		 1
         12
         123
         1234
         12345
         123456
         1234567

		 */
		System.out.print("Enter the no of Rows or Columns : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
