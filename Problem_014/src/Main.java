import java.util.*;
import java.io.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int h;
		
		Scanner scanner = new Scanner(new File("input.txt"));
		
		while(scanner.hasNext())
		{
			StringBuilder sb = new StringBuilder();
			h = scanner.nextInt();
			
			for(int i = 1; i <= h; i++)
			{
				for(int j = 1; j <= (h - i) * 2; j++)
					sb.append(" ");
				
				for(int k = 1; k <= h + (i - 1) * 2; k++)
					sb.append("*");
				
				sb.append("\n");
			}
			
			System.out.print(sb.toString());
			
		}
	}

}
