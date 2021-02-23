package fileWritingOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="C:\\Users\\TheShy\\Documents\\QA-MyDoctor\\Automaion\\EclipseProjects\\JavaConcepts_Automation\\UsingPath.txt";
		String content="It's related to file writing using Path";
		
		Path path=Paths.get(location);
		Files.write(path,content.getBytes());
	
	}

}
