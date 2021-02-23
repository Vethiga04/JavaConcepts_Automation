package fileWritingOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingfileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="UsingfileOutputStream.txt";
		String content="This is using UsingfileOutputStream";
		
		FileOutputStream fileOutputStream=new FileOutputStream(location);
		byte[] ContentFileByte=content.getBytes();
		fileOutputStream.write(ContentFileByte);
		fileOutputStream.close();
		
	}

}
