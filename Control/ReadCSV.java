package Control;

import java.io.BufferedReader;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;

public class ReadCSV {
 
	public void readCSVFile(  String csvFileToRead,
							  String splitBy,
							  String sequence) {  
		
	BufferedReader br = null;  
	String line = "";  
	
	try {  
	 
		br = new BufferedReader(new FileReader(csvFileToRead));  
		while ((line = br.readLine()) != null) {  
			
		   if ( !line.isEmpty() && !line.contains(sequence) ){
			   
			   String[] data = line.split(splitBy);  
			  // System.out.println(" Data = Field 1=" + data[0] + " , Field 2="  
				//	   + data[1] + " , Field 3=" + data[2] + " , Field 4="  
				//	   + data[3] + " , Field 5=" + data[4] + "]"); 
			   System.out.println(line);
		   }
		}  
		
	} catch (FileNotFoundException e) {  
		e.printStackTrace();  
		  } catch (IOException e) {  
			  e.printStackTrace();  
		  } finally {  
			  if (br != null) {  
				  try {  
					  br.close();  
				  } catch (IOException e) {  
					  e.printStackTrace();  
				  }  
			  }  
		  }  
		   
	}  
}
