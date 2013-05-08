import java.io.File;
import java.util.Scanner;


class Date
{
	int[][] dayOfMonth = {{0, 0}, {31, 31}, {28, 29}, {31, 31}, {30, 30}, {31, 31}, {30, 30}, {31, 31}, {31, 31}, {30, 30}, {31, 31}, {30, 30}, {31, 31}}; 
	int year, month, day;
	
	public void nextDay()
	{
		day ++;
		if(day > dayOfMonth[month][isYeap(year)])
		{
			month ++;
			day = 1;
		}
		
		if(month > 12)
		{
			year ++;
			month = 1;
		}
	}
	
	public int isYeap(int year)
	{
		return year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ? 1 : 0;
	}
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int[][][] buf = new int[3001][13][32];
		
		Date tmpDate = new Date();
		
		tmpDate.day = 1;
		tmpDate.month = 1;
		tmpDate.year = 0;
		
		int cnt = 0;
		
		while(tmpDate.year != 3001)
		{
			buf[tmpDate.year][tmpDate.month][tmpDate.day] = cnt ++;
			tmpDate.nextDay();
		}
		
		Scanner scanner = new Scanner(new File("input.txt"));
		
		int year, month, day;
		
		while(scanner.hasNext())		
		{
			year = scanner.nextInt();
			month = scanner.nextInt();
			day = scanner.nextInt();
			
			System.out.println(buf[year][month][day] - buf[year][1][1] + 1);
		}
	}

}
