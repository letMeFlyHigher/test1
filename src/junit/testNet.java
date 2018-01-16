package junit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.junit.Test;

public class testNet {
	/**
	 * 为了人民为了正义，不不，我只是为了看一看这个没有见过的东西，能不能工作，
	 * 就是利用URL对象来访问、下载网络上的资源，理论上肯定是没有问题的。
	 * 
	 * @结论 竟然真的成功了哈哈哈。。。。。
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	public void test1() throws UnsupportedEncodingException, IOException{
		String baidu = "https://www.google.com";
		URL url = null;
		StringBuffer sb = new StringBuffer();
		String line = "";
		try{
			url = new URL(baidu);
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(url!=null){
			BufferedReader in = new BufferedReader(
					new InputStreamReader(url.openStream(),"utf-8")
					);
			
			while ((line = in.readLine()) != null) {
				sb.append(line);
			}
			in.close();
		}
		System.out.println(sb.toString());
		
		
	}
	@Test
	public void test() throws UnsupportedEncodingException, IOException{
		String baidu = "https://jcifs.samba.org/src/";
		URL url = null;
		StringBuffer sb = new StringBuffer();
		String line = "";
		try{
			url = new URL(baidu);
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(url!=null){
			BufferedReader in = new BufferedReader(
					new InputStreamReader(url.openStream(),"utf-8")
					);
			
			while ((line = in.readLine()) != null) {
				sb.append(line);
			}
			in.close();
		}
		System.out.println(sb.toString());
		
	}

	
}
