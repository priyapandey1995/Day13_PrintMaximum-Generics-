package maximum;

public class MaxStrings {

	/* taken 3 floating variables and its compared with each other
	 * to check for maximum, float object is used and also compareTo method 
	 * is applied 
	 */
	public static String toPrintMax(String a,String b,String c) {

		//initially taken a as max
		String max = a;

		/*
		 * first,b is compared with max,if its true,it returns as max
		 * if not,it checks for another condition
		 */
		if(b.compareTo(max) > 0)
			max = b;

		//c checks for max
		if(c.compareTo(max) > 0)
			max = c;

		System.out.println("First String="+ " " +a);
		System.out.println("Second Second=" +" " +b);
		System.out.println("Third String=" + " " +c);
		//Maximum is printed
		System.out.println("Maximum  is="+  " " +max);
		return max;
	}
}
