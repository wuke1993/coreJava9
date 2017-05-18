package ch06InterfaceAndInnerClass;

/**
 * This program demonstrates cloning.
 * @version 1.10 2002-07-01
 * @author Cay Horstmann
 */
public class TestEmployeeClone
{
   public static void main(String[] args)
   {
      try
      {
         Employee original = new Employee("John Q. Public", 50000);
         original.setHireDay(2000, 1, 1);
         System.out.println("original=" + original);
         
         Employee copy = original.clone(); // deep copy
         copy.raiseSalary(10);
         copy.setHireDay(2002, 12, 31);
         
         System.out.println("original=" + original);
         System.out.println("copy=" + copy);
      }
      catch (CloneNotSupportedException e)
      {
         e.printStackTrace();
      }
   }
}
/*
 * original=Employee[name=John Q. Public,salary=50000.0,hireDay=Sat Jan 01 00:00:00 CST 2000]
 * original=Employee[name=John Q. Public,salary=50000.0,hireDay=Sat Jan 01 00:00:00 CST 2000]
 * copy=Employee[name=John Q. Public,salary=55000.0,hireDay=Tue Dec 31 00:00:00 CST 2002]
 */