package d自定义异常;

/**
 * 自定义异常
 * @author 王以诚
 *
 */
public class Test04 {
	public static void main(String[] args) {
		teachCode();
	}

	public static void teachCode() {
		Person p = new Person();
		p.setAge(-1);
	}
}

class Person {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0) {
			// 自定义异常并抛出
			throw new IllegalAgeException("年龄不能为负数");
		}
		this.age = age;
	}
}

class IllegalAgeException extends RuntimeException {
	public IllegalAgeException() { }
	public IllegalAgeException(String msg) {
		super(msg);
	}
}