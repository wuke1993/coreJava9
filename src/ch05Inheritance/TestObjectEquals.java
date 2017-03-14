package ch05Inheritance;

import java.util.Date;

/**
 * @author: wuke
 * @date : 2017年3月3日 下午3:37:13 Title : TestEquals Description :
 */
public class TestObjectEquals {
	public static void main(String[] args) {
		MyEmployee manager = new MyEmployee();
	}
}

class MyEmployee {
	private String name;
	private String salary;
	private Date hireDay;

	public MyEmployee() {

	}

	public MyEmployee(String name, String salary, Date hireDay) {
		this.name = name;
		this.salary = salary;
		this.hireDay = hireDay;
	}

	// judge if two objects is equals
	public boolean equals(Object otherObject) {
		// a quick test to see if the objects are identical
		if (this == otherObject)
			return true;

		// must return false if the explicit parameter is null
		if (otherObject == null)
			return false;

		// if the classes don't match, they can't be equal
		if (getClass() != otherObject.getClass())
			return false;

		// now we know otherObject is a non-null Employee
		MyEmployee other = (MyEmployee) otherObject;
		// test whether the fields have identical values
		return name.equals(other.name) && salary == other.salary
				&& hireDay.equals(other.hireDay);
	}
}