package dataReader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONObject;

public class DataReader {

	public  JSONObject readTestData() {
		
		String data = getFile("TestData.json");
		System.out.println("data is "+data);
		
		return new JSONObject(data);
		
	}
	
	private  String getFile(String fileName) {

		StringBuilder result = new StringBuilder("");

		//Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
			
		return result.toString();

	  }
}
