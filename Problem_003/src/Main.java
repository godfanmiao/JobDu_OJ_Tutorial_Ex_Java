import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("input.txt"));
		int n;
		
		int[] buf = new int[1000];
		
		while(scanner.hasNext())
		{
			n = scanner.nextInt();
			
			for(int i = 0; i < n; i++)
				buf[i] = scanner.nextInt();
			
			Arrays.sort(buf, 0, n);
			
			System.out.println(buf[n - 1]);
			
			if(n - 2 < 0)
				System.out.println("-1");
			else {
				for(int i = 0; i < n - 1; i++)
					if(i == n - 2)
						System.out.print(buf[i] + "\n");
					else
						System.out.print(buf[i] + " ");
			}
		}
	}

}
