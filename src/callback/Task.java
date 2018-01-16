package callback;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public abstract class Task {

	/**
	   * Execute with callback
	 * @throws FileNotFoundException 
	   */
	  public final String executeWith(InputStream is,Callback callback) throws FileNotFoundException {
		  
		  StringBuffer sb = null;
			try {
				InputStreamReader reader = new InputStreamReader(is, "gbk");
//			BufferedReader br = new BufferedReader();
				Scanner s = null;
				s = new Scanner(new BufferedReader(reader));
				sb = new StringBuffer();
				String headLine = s.nextLine();
				
				while(s.hasNextLine()){
					String line = s.nextLine();
					if (callback != null) {
					      callback.call(line, sb);
					    }
				}
				    
			    if(s!= null){
					s.close();
				}
				is.close();
				reader.close();
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return sb.toString();

	  }

}
