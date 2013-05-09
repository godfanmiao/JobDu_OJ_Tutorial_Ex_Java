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
		Scanner scanner = new Scanner(new File("input.txt"));
		
		while(scanner.hasNext())
		{
			int year = scanner.nextInt();
			int n = scanner.nextInt();
			
			int cnt = 1;
			Date tmpDate = new Date();
			tmpDate.year = year;
			tmpDate.month = 1;
			tmpDate.day = 1;
			
			while(cnt < n)
			{
				tmpDate.nextDay();
				cnt ++;
			}
			
			System.out.printf("%04d-%02d-%02d\n", tmpDate.year, tmpDate.month, tmpDate.day);
		}
	}

}
