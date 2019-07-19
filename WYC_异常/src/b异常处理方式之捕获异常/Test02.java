package b异常处理方式之捕获异常;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * -使用try-catch捕获处理异常
 * 
 * @author 王以诚
 */
public class Test02 {
	public static void main(String[] args) {
		readMyFile();
	}

	public static void readMyFile() {
		// reader在try块外声明，在try里面实例化
		FileReader reader = null;
		try {
			reader = new FileReader("F:/aa.txt");
			System.out.println("step1");
			char c1 = (char) reader.read();
			System.out.println(c1);
		} catch (FileNotFoundException e) { // 子类在前，否则报错
			System.out.println("step2");
			e.printStackTrace();
		} catch (IOException e) { // 父类在后
			e.printStackTrace();
		} finally {
			System.out.println("step3");
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
