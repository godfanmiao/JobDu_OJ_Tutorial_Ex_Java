import java.util.Scanner;
import java.io.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("input.txt"));
		int[] id = new int[201];
		int[] buf = new int[201];
		
		int n, m;
		while(scanner.hasNext())
		{

			n = scanner.nextInt();
			m = scanner.nextInt();
			
			for(int i = 1; i <= m; i++)
			{
				id[i] = 0;
			}
			
			for(int i = 0; i < n; i++)
			{
				int x = scanner.nextInt();
				buf[i] = x;
				id[x] ++;
			}
			
			for(int i = 0; i < n; i++)
			{
				if(id[buf[i]] == 1)
					System.out.println("BeiJu");
				else
					System.out.println(id[buf[i]] - 1);
			}
		}
	}

}
