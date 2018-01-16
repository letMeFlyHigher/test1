package junit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class testdir {
	
	@Test
	public void testFile() throws IOException{
		String path = "F:\\河北省气象服务中心\\tmp\\";
		File pFile = new File(path);
		if(!pFile.exists()){
			pFile.mkdirs();
		}
		
		String fileName = "test.txt";
		File file = new File(path + fileName);
		
		try {
			FileWriter fw = new FileWriter(file);
			fw.append("nihaoa");
			fw.close();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	//建立文件夹。。
	@Test
	public void testDir(){
		Date date = new Date();
		String fileName = "001.txt";
		String sdf = new SimpleDateFormat("yyyy/MM/dd").format(date);
		String path = "E:\\download\\"+sdf;
		File file = new File(path);
		if(!file.exists()){
			file.mkdirs();
		}
		System.out.println("program shutdown ");
		
		File file1 = new File(path + "/" + fileName);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuffer sb = new StringBuffer();
		sb.toString();
		String ss = "11111111111111";
		try {
			fw.write(ss);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
