package ch05Inheritance;
/**
 * @author: wuke 
 * @date  : 2017年3月7日 下午9:00:17
 * Title  : TestClass
 * Description : 
 */
public class TestClass {

	public static void main(String[] args) {
		Car benz = new Car("Benz");
		
		/**
		 * 三种获取 Class 的方法
		 */
		Class cl1 = benz.getClass();
		System.out.println(cl1.getName());
		
		try {
			//Class cl2 = Class.forName("Car"); // java.lang.ClassNotFoundException: Car
			Class cl2 = Class.forName("ch05Inheritance.Car");
			System.out.println(cl2.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Class cl3 = Car.class;
		System.out.println(cl3.getName());
		
		/**
		 * == 运算符实现两个类对象比较
		 */
		Car audi = new Car("Audi");
		if(cl1 == audi.getClass())
			System.out.println("These two class is the same!");
		
		/**
		 * 快速创建一个类的实例
		 */
		try {
			Car unknown = audi.getClass().newInstance();
			
			Object unknown2 = Class.forName("ch05Inheritance.Car").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class Car {
	private String brand;

	public Car() {
	}

	public Car(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}
}