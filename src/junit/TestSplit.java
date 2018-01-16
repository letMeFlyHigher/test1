package junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class TestSplit {

	@Test
	public void test(){
		//通过一个或多个空格来分割字符串。
		String str  ="a b       c dd e f  g";
		String [] arr = str.split("\\s+");
		for(String ss : arr){
			System.out.print(ss);
		}
	}
	
	@Test
	public void RAndN(){
		System.out.println("nihao\rdanshi\nwobuhao\r\nll\r");
	}
	@Test
	public void testSplit(){
		String str = "aa\nbb\ncc\r\ndd\t ";
	    String[] strs = str.split("\n");
	    for(int i = 0; i <strs.length; i++){
	    	System.out.println(strs[i]);
	    }
	}
	
	@Test
	public void testRex(){
		
		
		String nn = "54519	永清	9999	1	晾晒指数 54520	三河	9999	1	晾���指数 54521	香河	9999	1	晾晒指数";
//		Pattern p = Pattern.compile("\\d+\\s+[\u4e00-\u9fa5]+\\s+\\d+\\s+\\d+\\s+[\u4e00-\u9fa5]+");
//		Matcher m = p.matcher(nn);
//		
//		for(int i = 0 ; i < m.groupCount(); i++){
//			System.out.println(m.group(i));
//		}
//		
//		Pattern p = Pattern.compile(".\\d+");
//		Matcher m =p.matcher(nn);
//		System.out.println(m.groupCount());
//		for(int i = 0 ; i <m.groupCount(); i++){
//			System.out.println(m.group(i));
//		}
		

//        String text    =
//            "This is the text to be searched " +
//            "for occurrences of the pattern.";
//
//        String pattern = ".*is.*";
//
//        boolean matches = Pattern.matches(pattern, text);
//
//        System.out.println("matches = " + matches);
		
		 String REGEX = ":";
		 String INPUT =
		        "one:two:three:four:five";
		    
		    
		        Pattern p = Pattern.compile(REGEX);
		        String[] items = p.split(INPUT);
		        for(String s : items) {
		            System.out.println(s);
		        }
		
	}
}
