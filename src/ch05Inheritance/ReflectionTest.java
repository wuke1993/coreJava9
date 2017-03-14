package ch05Inheritance;

import java.util.*;
import java.lang.reflect.*;

/**
 * This program uses reflection to print all features of a class.
 * @version 1.1 2004-02-21
 * @author Cay Horstmann
 */
public class ReflectionTest {
	public static void main(String[] args) {
		// read class name from command line args or user input
		String name;
		if (args.length > 0)
			name = args[0];
		else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name (e.g. java.util.Date): ");
			name = in.next();
		}

		try {
			// print class name and superclass name (if != Object)
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0)
				System.out.print(modifiers + " ");
			System.out.print("class " + name);
			if (supercl != null && supercl != Object.class)
				System.out.print(" extends " + supercl.getName());

			System.out.print("\n{\n");
			printConstructors(cl);
			System.out.println();
			printMethods(cl);
			System.out.println();
			printFields(cl);
			System.out.println("}");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}

	/**
	 * Prints all constructors of a class
	 * @param cl a class
	 */
	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getDeclaredConstructors();

		for (Constructor c : constructors) {
			String name = c.getName();
			System.out.print("   ");
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0)
				System.out.print(modifiers + " ");
			System.out.print(name + "(");

			// print parameter types
			Class[] paramTypes = c.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0)
					System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}

	/**
	 * Prints all methods of a class
	 * @param cl a class
	 */
	public static void printMethods(Class cl) {
		Method[] methods = cl.getDeclaredMethods();

		for (Method m : methods) {
			Class retType = m.getReturnType();
			String name = m.getName();

			System.out.print("   ");
			// print modifiers, return type and method name
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0)
				System.out.print(modifiers + " ");
			System.out.print(retType.getName() + " " + name + "(");

			// print parameter types
			Class[] paramTypes = m.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0)
					System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}

	/**
	 * Prints all fields of a class
	 * @param cl a class
	 */
	public static void printFields(Class cl) {
		Field[] fields = cl.getDeclaredFields();

		for (Field f : fields) {
			Class type = f.getType();
			String name = f.getName();
			System.out.print("   ");
			String modifiers = Modifier.toString(f.getModifiers());
			if (modifiers.length() > 0)
				System.out.print(modifiers + " "); // public static final
			System.out.println(type.getName() + " " + name + ";");
		}
	}
}
/**
public class java.util.Date
{
   public java.util.Date(java.lang.String);
   public java.util.Date(int, int, int, int, int, int);
   public java.util.Date(int, int, int, int, int);
   public java.util.Date();
   public java.util.Date(long);
   public java.util.Date(int, int, int);

   public boolean equals(java.lang.Object);
   public java.lang.String toString();
   public int hashCode();
   public java.lang.Object clone();
   public volatile int compareTo(java.lang.Object);
   public int compareTo(java.util.Date);
   private void readObject(java.io.ObjectInputStream);
   private void writeObject(java.io.ObjectOutputStream);
   private final sun.util.calendar.BaseCalendar$Date normalize();
   private final sun.util.calendar.BaseCalendar$Date normalize(sun.util.calendar.BaseCalendar$Date);
   public static long parse(java.lang.String);
   public boolean after(java.util.Date);
   public boolean before(java.util.Date);
   public long getTime();
   private static final java.lang.StringBuilder convertToAbbr(java.lang.StringBuilder, java.lang.String);
   private final sun.util.calendar.BaseCalendar$Date getCalendarDate();
   private static final sun.util.calendar.BaseCalendar getCalendarSystem(sun.util.calendar.BaseCalendar$Date);
   private static final sun.util.calendar.BaseCalendar getCalendarSystem(long);
   private static final sun.util.calendar.BaseCalendar getCalendarSystem(int);
   public int getDay();
   public int getHours();
   private static final synchronized sun.util.calendar.BaseCalendar getJulianCalendar();
   static final long getMillisOf(java.util.Date);
   public int getMinutes();
   public int getMonth();
   public int getSeconds();
   private final long getTimeImpl();
   public int getTimezoneOffset();
   public int getYear();
   public void setDate(int);
   public void setHours(int);
   public void setMinutes(int);
   public void setMonth(int);
   public void setSeconds(int);
   public void setYear(int);
   public java.lang.String toGMTString();
   public java.time.Instant toInstant();
   public java.lang.String toLocaleString();
   public int getDate();
   public void setTime(long);
   public static java.util.Date from(java.time.Instant);
   public static long UTC(int, int, int, int, int, int);

   private static final sun.util.calendar.BaseCalendar gcal;
   private static sun.util.calendar.BaseCalendar jcal;
   private transient long fastTime;
   private transient sun.util.calendar.BaseCalendar$Date cdate;
   private static int defaultCenturyStart;
   private static final long serialVersionUID;
   private static final [Ljava.lang.String; wtb;
   private static final [I ttb;
}
*/