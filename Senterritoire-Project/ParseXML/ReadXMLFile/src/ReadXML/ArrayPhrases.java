package ReadXML;

import java.util.ArrayList;

public class ArrayPhrases {
	
	public ArrayList<String> phrases = new ArrayList<String>();
	
	
	
	public ArrayPhrases(){
		
		
	}
	
	public ArrayList<String> createPhrases(ArrayList<String> textes){
	for(String tex:textes){
		//System.out.println(tex);
		String[] phrase = tex.split("[\\r\\.\\t]+");

		//				System.out.println(phrase.length);
		for (int ii = 0; ii < phrase.length; ii++){
			if(!phrase[ii].equals("")&&!phrase[ii].equals("\\ ")&&!phrase[ii].equals("\n")){
				phrases.add(phrase[ii]);
			}
		}


	}
	return phrases;
	}
	

}
