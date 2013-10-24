package ReadXML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OpenTXTFile {
	
	ArrayList<String> list = new ArrayList<String>();
	File file ;
	
	public OpenTXTFile(String path){
		this.file= new File(path);
	}
	
	
	public ArrayList<String> entries(){
	BufferedReader reader = null;

	try {
		reader = new BufferedReader(new FileReader(file));
		String text = null;

		while ((text = reader.readLine()) != null) {
			list.add(text);
		}


	}catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if (reader != null) {
				reader.close();
			}
		} catch (IOException e) {
		}
	}
	
	return list;
	}

}