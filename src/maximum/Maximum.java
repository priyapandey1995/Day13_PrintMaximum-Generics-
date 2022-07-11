package maximum;

/*to find the largest number using generics*/
   public class Maximum<T extends Comparable>{

	public static<T extends Comparable> T toPrintMax(T... value ) {

		
		//initially taken a as max
		T max = value[0];

		
		//loop till the max value is obtained
		for(int i=1;i<value.length;i++) {
			if(value[i].compareTo(max)>0) {
				max = value[i];
			}
		}
		//print the maximum
		System.out.println("Maimum value is="+max);
		return max;
		}
	
	
	

		
		
	

}
