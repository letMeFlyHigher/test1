package junit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import org.junit.Test;

public class TestScanning {

	@Test
	public void BreakingInputIntoTokens() throws IOException{
		String path = "D:\\Documents\\Tencent Files\\996245864\\FileRecv\\共享盘福\\生活指数2017080411.txt";
//		FileReader reader= new FileReader(path);
		
		FileInputStream fis = new FileInputStream(new File(path));
		InputStreamReader reader = new InputStreamReader(fis, "gbk");
//		BufferedReader br = new BufferedReader();
		Scanner s = null;
		s = new Scanner(new BufferedReader(reader));
		StringBuffer sb = new StringBuffer();
		String headLine = s.nextLine();
		while(s.hasNextLine()){
			String line = s.nextLine();
			if(!(line.contains("站号")||line.contains("站名")||line.contains("最小相对湿度"))){
				String[] columns = line.split("[\t]");
				sb.append(columns[0]).append("|").append("发布日期").append("|").append(columns[4]).append("|")
    			.append(columns[3]).append("|").append("提示语").append("|").append("描述").append("\n");
			}
		}
		
		
		if(s!= null){
			s.close();
		}
		
		fis.close();
		
		reader.close();
		
		System.out.println(sb.toString());
	}
}
