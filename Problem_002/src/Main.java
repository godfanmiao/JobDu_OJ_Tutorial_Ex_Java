import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>
{
	String name;
	int age;
	int score;

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(score != o.score)
			return score - o.score;
		else {
			if(!name.equals(o.name))
				return name.compareTo(o.name);
			else {
				return age - o.age;
			}
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
		Student[] students = new Student[1000];
		int n;
		
		while(scanner.hasNext())
		{
			n = scanner.nextInt();
			
			for(int i = 0; i < n; i++)
			{
				students[i] = new Student();
				students[i].name = scanner.next();
				students[i].age = scanner.nextInt();
				students[i].score = scanner.nextInt();
			}
			Arrays.sort(students, 0, n);
			
			for(int i = 0; i < n; i++)
			{
				System.out.println(students[i].name + " " + students[i].age + " " + students[i].score);
			}
		}
		
		
	}

}


