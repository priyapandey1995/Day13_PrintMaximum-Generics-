package maximum;

public class MaxInteger {
	
	public static Integer toPrintMax(Integer a,Integer b,Integer c) {
		Integer max = a;
		if(b.compareTo(max) > 0)
			max = b;
		
		if(c.compareTo(max) > 0)
			max = c;
		
		System.out.println("First Number=" +a);
		System.out.println("Second Number=" +b);
		System.out.println("Third Number=" +c);
		System.out.println("Maximum Value is="+ max);
		return max;
	}
}
