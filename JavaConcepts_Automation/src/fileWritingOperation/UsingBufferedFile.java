package fileWritingOperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class UsingBufferedFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="UsingBufferedFile.txt";
		String content="This is using UsingBufferedFile";
		
		FileWriter fileWriter=new FileWriter(location);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
	
	}

}
