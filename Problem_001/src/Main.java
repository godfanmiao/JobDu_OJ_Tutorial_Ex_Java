import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception
	{
		Scanner scanner = new Scanner(new File("input.txt"));
		int[] buf = new int[100];
		
		int n;
		while(scanner.hasNext())
		{
			n = scanner.nextInt();
			for(int i = 0; i < n; i++)
			{
				buf[i] = scanner.nextInt();
			}
			
			Arrays.sort(buf, 0, n);
			
			for(int i = 0; i < n; i++)
				System.out.print(buf[i] + " ");
			System.out.println();
		}
		
	}
}
