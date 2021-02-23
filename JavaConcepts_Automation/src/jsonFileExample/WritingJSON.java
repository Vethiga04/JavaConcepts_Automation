package jsonFileExample;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WritingJSON {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject=new JSONObject();
		jsonObject.put("Name", "Vethiga");
		jsonObject.put("Age", 24);
		jsonObject.put("Tutorial", "Selenium");
		
		JSONArray jsonarray=new JSONArray();
		jsonarray.add("Testing");
		jsonarray.add("Sample");
		jsonarray.add("simple");
		
		jsonObject.put("ArraySample",jsonarray);
		
		FileWriter filewriter=new FileWriter("JSONSamplefile.json");
		filewriter.write(jsonObject.toJSONString());
		filewriter.close();
		
	}

}
