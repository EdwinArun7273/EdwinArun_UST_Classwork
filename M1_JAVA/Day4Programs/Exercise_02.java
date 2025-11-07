package Day4Programs;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class Exercise_02 {
	
	static void fileReader() throws IOException 
	{
	    try
	    {
	    	FileReader file = new FileReader("D:\\welcome.txt");
	    	BufferedReader buffer = new BufferedReader(file);
	    	String line;
			while((line = buffer.readLine())!=null)
			{
				System.out.println(line);
			}
	    }
	    catch (FileNotFoundException e)
	    {
	    	System.out.println(e.getMessage());
	    }
	    catch (IOException e)
	    {
	    	System.out.println(e.getMessage());
	    }
	}
	
	public static void main(String[] args) throws IOException {
		fileReader();
	}

}