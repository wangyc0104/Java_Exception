package a异常是什么;

import java.util.Random;

/**
 * -运行时异常处理 RuntimeException
 * 
 * @author 王以诚
 */
public class Test01 {
	
	public static void main(String[] args) {
		teachCode();
	}

	public static void teachCode() {
		/**
		 * 运行时异常RuntimeException是需要程序员在编程中检查并处理的，要在代码里自己解决。
		 */
		// ArithmeticException
		int a = 0;
		int b = 1;
		if (a != 0) { // 防止RuntimeException的一种处理方法
			System.out.println(b / a);
		} else {
			System.out.println("ArithmeticException");
		}

		// NullPointerException
		String str = ((int) Math.random() * 10 % 2 == 0) ? null : "abcdef";
		if (str != null) { // 防止RuntimeException的一种处理方法
			System.out.println(str + "的长度为：" + str.length());
		} else {
			System.out.println("NullPointerException");
		}

		// ClassCastException
		class Animal { }
		class Dog extends Animal { }
		class Cat extends Animal { }
		Animal d = new Dog();
		if (d instanceof Cat) {
			Cat c = (Cat) d;
		} else {
			System.out.println("ClassCastException");
		}

		// ArrayOutOfBoundException
		int[] arr = new int[5];
		int a2 = 5;
		if (a2 < arr.length) {
			System.out.println(arr[a2]);
		} else {
			System.out.println("ArrayOutOfBoundException");
		}
		
	}
	
}