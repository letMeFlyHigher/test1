package callback;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;




/**
 * 
 * Callback pattern is more native for functional languages where functions are treated as
 * first-class citizens. Prior to Java 8 callbacks can be simulated using simple (alike command)
 * interfaces.
 * 
 */
public class App {


	  /**
	   * Program entry point
	 * @throws FileNotFoundException 
	   */
	  public static void main(String[] args) throws FileNotFoundException
		{
		    Task task = new SimpleTask();
		    
		    Callback callback = new Callback() {
		      @Override
		      public void call(String line,StringBuffer sb) {
		    	  if(!(line.contains("站号")||line.contains("站名")||line.contains("最小相对湿度"))){
						String[] columns = line.split("[\t]");
						sb.append(columns[0]).append("|").append("发布日期").append("|").append(columns[4]).append("|")
						.append(columns[3]).append("|").append("提示语").append("|").append("描述").append("\n");
					}
		      }
		    };
		    String path = "D:\\Documents\\Tencent Files\\996245864\\FileRecv\\共享盘福\\生活指数2018011111.txt";
		    FileInputStream fis = new FileInputStream(new File(path));
		    String rs = task.executeWith(fis,callback);
		    
		    System.out.println(rs);
		  }

}
