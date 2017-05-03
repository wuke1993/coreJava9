package ch06InterfaceAndInnerClass;

import java.util.Date;

/**
 * @author: wuke 
 * @date  : 2017年5月2日 下午5:16:30
 * Title  : Car
 * Description : 
 */
public class Car implements Cloneable{
	private String name;
	private int price;
	private Date producationDate;
	
	@Override
	public Car clone() throws CloneNotSupportedException {
		// call Object.clone()
		Car cloned = (Car) super.clone();
		
		// clone mutable fields
		cloned.producationDate = (Date) producationDate.clone(); // deep copy
		
		return cloned;
	}
	
	public Car() {
		
	}
	
	public Car(String name, int price, Date producationDate) {
		super();
		this.name = name;
		this.price = price;
		this.producationDate = producationDate;
	}

	@Override
	public String toString() {
		return this.name + " " + this.price + " " + this.producationDate.toString();
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Date getProducationDate() {
		return producationDate;
	}
	
}
