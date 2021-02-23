package fileWritingOperation;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
	
		String location="UsingFileWriter.txt";
		String content="It's sample content";
		
		FileWriter fileWriter=new FileWriter(location);
		
		fileWriter.write(content);
		
		fileWriter.close();
		
	}
	
}
