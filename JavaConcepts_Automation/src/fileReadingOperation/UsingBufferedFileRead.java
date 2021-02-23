package fileReadingOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="C:\\Users\\TheShy\\Documents\\Learning_V\\Automation\\EclipseProjects\\JavaConcepts_Automation\\UsingBufferedFile.txt";
		
		FileReader fileReader=new FileReader(location);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String LineString;


		while((LineString=bufferedReader.readLine())!=null){
			System.out.println(LineString);	
		}
			
	}

}
