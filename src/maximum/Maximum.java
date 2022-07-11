package maximum;

/*to find the largest number using generics*/
   public class Maximum<T extends Comparable>{

	T a;
	T b;
	T c;

	//Constructor
	public Maximum(T a,T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//Generials i.e T applied to method aswell
	public static<T extends Comparable> T toPrintMax(T a,T b,T c) {

		//initially taken a as max
		T max = a;

		/* * first,b is compared with max,if its true,it returns as max
		 * if not,it checks for another condition */
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
