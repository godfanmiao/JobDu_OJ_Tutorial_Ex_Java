import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("input.txt"));
		
		char[] buf;
		StringBuilder sb = new StringBuilder();
		while(scanner.hasNext())
		{
			buf = scanner.nextLine().toCharArray();
			Arrays.sort(buf);
			sb.append(buf);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
