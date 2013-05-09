import java.io.File;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("input.txt"));
		
		boolean[] buf = new boolean[10001];
		
		int l, m;
		while(scanner.hasNext())
		{
			l = scanner.nextInt();
			m = scanner.nextInt();
			
			for(int i = 0; i <= l; i++)
				buf[i] = true;
			
			for(int i = 0; i < m; i++)
			{
				int start = scanner.nextInt();
				int end = scanner.nextInt();
				
				for(int j = start; j <= end; j++)
					buf[j] = false;
			}
			
			int cnt = 0;
			for(int i = 0; i <= l ; i++)
			{
				if(buf[i])
					cnt ++;
			}
			System.out.println(cnt);
		}
	}

}
