import java.util.*;
public class palindromicPattern {
	public static void main(String[] args) {
		/*
		
Output =    1		    1
           212
          32123
         4321234
        543212345
	   65432123456
	   
		*/
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

