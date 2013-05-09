import java.io.File;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static final int OFFSET = 500000;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean[] buf = new boolean [1000001];
		
		int n, m;
		Scanner scanner = new Scanner(new File("input.txt"));
		while(scanner.hasNext())
		{
			for(int i = -500000; i <= 500000; i++)
				buf[i + OFFSET] = false;
			
			n = scanner.nextInt();
			m = scanner.nextInt();
			
			if(m > n)
				m = n;
			
			for(int i = 0; i < n; i++)
			{
				int x = scanner.nextInt();
				buf[x + OFFSET] = true;
			}
			
			for(int i = 500000; i >= -500000 && m > 0; i--)
			{
				if(buf[i + OFFSET])
				{
					if(m == 1)
						System.out.print(i + "\n");
					else {
						System.out.print(i + " ");
					}
					m--;
				}
			}
		}
	}

}
