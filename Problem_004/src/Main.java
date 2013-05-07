import java.io.File;
import java.util.*;

class Record
{
	String id;
	String name;
	int score;
}

class RecordComparator implements Comparator<Record>
{
	int c;
	public RecordComparator(int c)
	{
		this.c = c;
	}
	@Override
	public int compare(Record o1, Record o2) {
		// TODO Auto-generated method stub
		int cId = o1.id.compareTo(o2.id);
		int cName = o1.name.compareTo(o2.name);
		switch(c)
		{
			case 1:
				return cId;
			case 2:
				if(cName!= 0)
					return cName;
				else {
					return cId;
				}
			case 3:
				if(o1.score != o2.score)
					return o1.score - o2.score;
				else {
					return cId;
				}
			default:
					return cId;
		}
	}
	
}
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("input.txt"));
		int n, c;
		
		Record[] records = new Record[100000];
		int cnt = 0;
		
		while(scanner.hasNext())
		{
			n = scanner.nextInt();
			c = scanner.nextInt();
			if(n == 0 && c == 0)
				break;
			
			for(int i = 0; i < n; i++)
			{
				records[i] = new Record();
				records[i].id = scanner.next();
				records[i].name = scanner.next();
				records[i].score = scanner.nextInt();
			}
			
			Arrays.sort(records, 0, n, new RecordComparator(c));
			
			System.out.println("Case " + ++cnt + ":");
			for(int i = 0; i < n; i++)
				System.out.println(records[i].id + " " + records[i].name + " " + records[i].score);
		}
	}

}
