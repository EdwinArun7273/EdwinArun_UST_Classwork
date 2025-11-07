package Day4Programs;

import java.io.File;

public class p14_deleteFile {

	public static void main(String[] args) {
		File f = new File("D:\\welcome.txt");
		if (f.delete())
		{
			System.out.println("File Successfully Deleted");
		}
		else
		{
			System.out.println("File Deletion Failed");
		}
	}

}
