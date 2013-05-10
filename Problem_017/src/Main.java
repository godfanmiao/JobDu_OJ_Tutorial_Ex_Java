import java.util.Scanner;
import java.io.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int n;
		int[] buf = new int[200];
		Scanner scanner = new Scanner(new File("input.txt"));
		while(scanner.hasNext())
		{
			n = scanner.nextInt();
			for(int i = 0; i < n; i++)
			{
				buf[i] = scanner.nextInt();
			}
			
			int x = scanner.nextInt();
			
			int ans = -1;
			
			for(int i = 0; i < n; i++)
			{
				if(buf[i] == x)
				{
					ans = i;
					break;
				}
			}
			
			System.out.println(ans);
		}
	}

}
