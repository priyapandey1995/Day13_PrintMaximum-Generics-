package maximum;

/*to find the largest number using generics*/
public class Maximum<T extends Comparable>{
	T a;
	T b;
	T c;
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
		System.out.println("given values are:");
		for(int i =0;i<value.length;i++) {
			System.out.println(value[i]);
		}
		printMax(max);//internally calling printMax generic Method
		return max;
	}
	//generic method to print max value
	public static <T> void printMax(T max) {
		System.out.println("\n Maximum Value is=" +max +"\n");
	}

	public static void main(String[] args) {
		//calling method and passing values
		Maximum.<Integer>toPrintMax(3,4,5,6,7,8);

		Maximum.<Float>toPrintMax(3.4f,4f,5.6f,6.9f,7f,88.8f);

		Maximum.<String>toPrintMax("Apple","Orange","Mango","pomogranate","butterfruit");


	}





}
