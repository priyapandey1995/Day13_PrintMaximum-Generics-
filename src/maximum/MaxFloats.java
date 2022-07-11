package maximum;

public class MaxFloats {
	
	/*
	 * taken 3 floating variables and its compared with each other
	 * to check for maximum, float object is used and also compareTo method 
	 * is applied 
	 */
	public static Float toPrintMax(Float a,Float b,Float c) {
		
		//initially taken a as max
		Float max = a;
		
		/*
		 * first,b is compared with max,if its true,it returns as max
		 * if not,it checks for another condition
		*/
		
		if(b.compareTo(max) > 0)
			max = b;
		
		//c checks for max
		if(c.compareTo(max) > 0)
			max = c;
		
		System.out.println("First Number=" +a);
		System.out.println("Second Number=" +b);
		System.out.println("Third Number=" +c);
		//Maximum is printed
		System.out.println("Maximum Value is="+ max);
		return max;
	}
}
