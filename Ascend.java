// Generates three integer random numbers in a given range,
// and prints them in increasing order.

//import java.util.Random;

public class Ascend {
	public static void main(String[] args) {
		//Random random = new Random();

		int lim = Integer.parseInt(args[0]);;

		double num1 = Math.random() * lim + 1;
		double num2 = Math.random() * lim + 1;
		double num3 = Math.random() * lim + 1;

		int a = (int)num1;
		int b = (int)num2;
		int c = (int)num3;

		//int a= random.nextInt(lim+1);
		//int b= random.nextInt(lim+1);
		//int c= random.nextInt(lim+1);

		int max , mid , min ;

		max = Math.max(a,b);
		max = Math.max(max,c);

		min = Math.min(a,b);
		min = Math.min(min,c);

		mid = a + b + c - max - min;

		System.out.println(max + " " + mid + " " + min);

	
	}
}
