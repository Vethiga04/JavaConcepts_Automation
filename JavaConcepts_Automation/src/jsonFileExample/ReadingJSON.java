package jsonFileExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadingJSON {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonparser=new JSONParser();
		
		FileReader fileReader=new FileReader("JSONSamplefile.json");
		
		Object parsedObject=jsonparser.parse(fileReader);
		
		JSONObject jsonObject=(JSONObject) parsedObject;  //(JSONObject) is a type casting
		
		String name=(String) jsonObject.get("Name");
		
		Long age=(Long) jsonObject.get("Age");
		
		JSONArray arraysample=(JSONArray) jsonObject.get("ArraySample");

		Iterator iterator =arraysample.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(jsonObject);
		
		
		
	}

}
