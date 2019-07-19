package c声明异常;

import java.io.FileReader;
import java.io.IOException;

/**
 * -使用throws声明异常（谁调用我谁处理）
 * 
 * @author 王以诚
 */
public class Test03 {
	public static void main(String[] args) throws IOException { // main方法抛给了JRE
		readMyFile();
	}

	public static void readMyFile() throws IOException {
		// reader在try块外声明，在try里面实例化
		FileReader reader = null;
		reader = new FileReader("F:/aa.txt");
		System.out.println("step1");
		char c1 = (char) reader.read();
		System.out.println(c1);

		if (reader != null) {
			reader.close();
		}

	}
}
