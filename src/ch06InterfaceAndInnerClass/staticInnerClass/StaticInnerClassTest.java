package ch06InterfaceAndInnerClass.staticInnerClass;

/**
 * @author: wuke
 * @date : 20170523 15:59:14 
 * Title : StaticInnerClassTest 
 * Description :
 */
public class StaticInnerClassTest {
	public static void main(String[] args) {
		double[] d = new double[20];
		for(int i = 0; i < d.length; i++)
			d[i] = 100 * Math.random();
		
		ArrayAlg.Pair p = ArrayAlg.minmax(d);
		
		System.out.println("min = " + p.getFirst());
		System.out.println("max = " + p.getSecond());
	}
}

class ArrayAlg {
	/**
	 * Title: Pair 
	 * Description: A pair of floating-point numbers
	 * @author wuke
	 * @date 20170523 16:02:02
	 */
	public static class Pair {
		private double first;
		private double second;

		public Pair(double f, double s) {
			first = f;
			second = s;
		}

		public double getFirst() {
			return first;
		}

		public double getSecond() {
			return second;
		}
	}
	
	/**
	 * Computes both the minimum and the maximum of an array
	 * @param values an array of floating-point numbers
	 * @return a pair whose first element is the minimum and whose second element
	 * is the maximum
	 */
	public static Pair minmax(double[] values) {
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		for (double v : values) {
			if (min > v)
				min = v;
			if (max < v)
				max = v;
		}
		return new Pair(min, max);
	}
}