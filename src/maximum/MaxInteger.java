package maximum;

public class MaxInteger {
	/* three integer variable has to be taken and
	each variable has to be compared with other two variables
	and find the maximum
	*
	**/
	
	public static Integer toPrintMax(Integer a,Integer b,Integer c) {
		Integer max = a;//assume a as max
		
		//compareto method is used to check for maximum number
		if(b.compareTo(max) > 0)
			max = b;
		
		if(c.compareTo(max) > 0)
			max = c;
		
		//maximum value is printed
		System.out.println("First Number=" +a);
		System.out.println("Second Number=" +b);
		System.out.println("Third Number=" +c);
		System.out.println("Maximum Value is="+ max);
		return max;//return the max value
	}
}
