import java.util.*;
public class solidRrectangle {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		int n = var.nextInt();
		System.out.print("Enter the no of Columns : ");
		int m = var.nextInt();
		/*
		 
		 *********
		 *********
		 *********
		 *********
		 	
		 */
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		var.close();
	}

}
