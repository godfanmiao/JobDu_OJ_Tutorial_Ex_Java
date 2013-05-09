import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(new File("input.txt"));
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		while(scanner.hasNext())
		{
			pq.clear();
			int n = scanner.nextInt();
			for(int i = 0; i < n; i++)
				pq.add(scanner.nextInt());
			
			int sum = 0;
			
			while(pq.size() > 1)
			{
				int a = pq.peek();
				pq.poll();
				int b = pq.peek();
				pq.poll();
				
				sum += a + b;
				pq.add(a + b);
			}
			
			System.out.println(sum);
			
		}
	}

}
