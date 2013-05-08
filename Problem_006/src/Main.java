import java.io.File;
import java.util.*;

class Date
{
	int year, month, day;
	
	int[][] dayOfMonth = {{0, 0}, {31, 31}, {28, 29}, {31, 31}, {30, 30}, {31, 31},
			{30, 30}, {31, 31}, {31, 31}, {30, 30}, {31, 31}, {30, 30}, {31, 31}};
	
	public int isYeap(int year)
	{
		return year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ? 1 : 0;
	}
	public void nextDay()
	{
		day ++;
		if(day > dayOfMonth[month][isYeap(year)])
		{
			day = 1;
			month++;
		}
		if(month > 12)
		{
			year ++;
			month = 1;
		}
	}
}
public class Main {
	public static int abs(int x)
	{
		return x < 0 ? -x : x;
	}
	public static void main(String[] args) throws Exception
	{
		Scanner scanner = new Scanner(new File("input.txt"));
				
		int[][][] buf = new int[5001][13][32];
		
		Date tmpDate = new Date();
		
		tmpDate.day = 1;
		tmpDate.month = 1;
		tmpDate.year = 0;
		
		int cnt = 0;
		while(tmpDate.year != 5001)
		{
			buf[tmpDate.year][tmpDate.month][tmpDate.day] = cnt ++;
			tmpDate.nextDay();
		}
		
		
		int y1, m1, d1, y2, m2, d2;
		
		while(scanner.hasNext())
		{
			String in = scanner.nextLine();
			y1 = Integer.parseInt(in.substring(0, 4));			
			m1 = Integer.parseInt(in.substring(4, 6));
			d1 = Integer.parseInt(in.substring(6, 8));
			
			in = scanner.nextLine();
			y2 = Integer.parseInt(in.substring(0, 4));			
			m2 = Integer.parseInt(in.substring(4, 6));
			d2 = Integer.parseInt(in.substring(6, 8));
			
			System.out.println(abs(buf[y1][m1][d1] - buf[y2][m2][d2]) + 1);
			
		}	
		
	}
	

}
