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
		String[] weekName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String[] monthName = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int day, year, month;
		String monthStr;
		
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
		
		while(scanner.hasNext())
		{
			day = scanner.nextInt();
			monthStr = scanner.next();
			year = scanner.nextInt();
			month = 1;
			for(int i = 1; i <= 12; i++)
			{
				if(monthName[i].equals(monthStr))
				{
					month = i;
					break;
				}
			}
			
			System.out.println(weekName[((buf[year][month][day] - buf[2013][5][8] + 3) % 7 + 7) % 7]);
		}
		
	}

}
