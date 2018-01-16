package junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class TestRE {

	@Test
	public void test1() throws IOException{
		 
		
	      
	      String filePath = "E:\\shenghuazhishu\\生活指数2018011111.txt";
	      File file = new File(filePath);
	      FileInputStream fis = new FileInputStream(file);
	      InputStreamReader isr = new InputStreamReader(fis,"gbk");
	      
	      char[] cbuf = new char[1024];
	      
	      StringBuffer sb = new StringBuffer();
	      int len;
	      while((len = isr.read(cbuf)) != -1){
	    	  sb.append(cbuf,0,len);
	    	  
	      }
	      
	      String result = sb.toString();
	      
//	      System.out.println(result);
	      //53392	康保	9999	3	晨练指数
	      String pattern = "\\d+\t[\u4E00-\u9FA5]+\t\\d+\t\\d\t[\u4E00-\u9FA5]+";
	      Pattern p = Pattern.compile(pattern);
	      Matcher m = p.matcher(result);
	      while(m.find()){
	    	  System.out.println("牛    逼" + m.group());
	      }
	   }
	
	@Test
	public void test2(){
		String str = "53392	康保	9999	3	晨练指数";
		String pattern = "\\d+\t[\u4E00-\u9FA5]+\t\\d+\t\\d\t[\u4E00-\u9FA5]+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
		
	}
	
}
