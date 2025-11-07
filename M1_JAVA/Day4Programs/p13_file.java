package Day4Programs;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

public class p13_file {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\welcome1.txt");
		boolean res = f.createNewFile();
		if (res == true)
		{
			System.out.println("File does not exists.... New file got created...");
		}
		else
		{
			System.out.println("File already exists.... New file not created...");
		}
		
		if (f.exists())
		{
			System.out.println("Path of the file: " + f.getAbsolutePath());
			System.out.println("Full name of the file: " + f.getName());
			System.out.println("File can be read: " + f.canRead());
			System.out.println("File can be written: " + f.canWrite());
		}
		
		FileWriter fw = new FileWriter("D:\\welcome1.txt");
		fw.write("First Line\n");
		fw.write("Second Line\n");
		fw.write("Third Line\n");
		fw.close();
		
		FileReader fr = new FileReader("D:\\welcome1.txt");
		Scanner sc = new Scanner(fr);
		while (sc.hasNext())
		{
			String c = sc.nextLine();
			System.out.println(c);
		}
	}

}
