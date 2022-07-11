package maximum;

public class Maximum {

	/* taken 3 variables and its compared with each other
	 * to check for maximum, each variables are compared with each other 
	 * is applied 
	 */
	public static <T extends Comparable<T>> T toPrintMax(T a,T b,T c) {

		//initially taken a as max
		T max = a;

		/*
		 * first,b is compared with max,if its true,it returns as max
		 * if not,it checks for another condition
		 */
		if(b.compareTo(max) > 0) {
			max = b;
		}

		//c checks for max
		if(c.compareTo(max) > 0) {
			max = c;
		}
		return max;//returns the Lagest Value
	}
}
