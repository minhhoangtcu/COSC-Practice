package misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringVertToHorz {
	
	public static void main(String[] args) throws IOException {
//		change("Ascending.dat");
//		change("Descending.dat");
		change("Random.dat");
	}
	
	private static void change(String path) throws IOException {
		FileReader file = new FileReader(path);
		BufferedReader reader = new BufferedReader(file);
		String line;
		String output = "";
		while ((line = reader.readLine()) != null) {
			output += line.trim() + " ";
		}
		System.out.println(output);
		reader.close();
	}

}
