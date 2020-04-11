package ForLoopPatterns;
import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows, columns;
		
		System.out.print("Enter number of rows: ");
		rows = scan.nextInt();
		System.out.print("Enter number of columns: ");
		columns = scan.nextInt();
		
			for(int i=1; i<=rows; i++){
			// i loops the # of rows	
				for(int j=1; j<=columns; j++){
				// j loops the # of columns
					System.out.print("*");
				}
				// S.o.p() moves the loop to the next line
				System.out.println();
			}
		
		scan.close();
	}

}
