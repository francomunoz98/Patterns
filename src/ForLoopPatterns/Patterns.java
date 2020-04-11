package ForLoopPatterns;
import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows, columns;
		rows = scan.nextInt();
		
		columns = scan.nextInt();
		
			for(int i=1; i<=4; i++)
			{	
				for(int j=1; j<=4; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		
		scan.close();
	}

}
