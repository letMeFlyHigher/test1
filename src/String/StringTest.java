package String;

import org.junit.Test;

public class StringTest {

	@Test
	public void testUpper(){
		String str1 = "ndmfa";
		char c = str1.charAt(0);
		char newc = (char) (c - 32);
		System.out.println("old char --" + c);
		System.out.println("new char --" + newc);
	}
	
	@Test
	public void test(){
		
	}
}
