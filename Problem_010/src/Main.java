import java.io.File;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("input.txt"));
		
		int n;
		int[] score = new int[101];
		
		while(scanner.hasNext())
		{

			for(int i = 0; i <= 100; i++)
				score[i] = 0;
			
			n = scanner.nextInt();
			if(n == 0)
				break;
			for(int i = 0; i < n; i++)
			{
				int x = scanner.nextInt();
				score[x] ++;
			}
			
			int s = scanner.nextInt();
			
			System.out.println(score[s]);
		}
		
		
	}

}
