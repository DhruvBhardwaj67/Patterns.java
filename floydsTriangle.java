import java.util.*;
public class floydsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*  
  
1
23
456
78910
  
     
 */
		System.out.print("Enter the no of Rows : ");
		int n = sc.nextInt();
		int number = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(number);
				number++;
			}
			System.out.println();
		}
		sc.close();
	}

}
