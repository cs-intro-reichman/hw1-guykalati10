// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    //String name1 = args[0];
		//String name2 = args[1];
		//String name3 = args[2];
		//int sum = Integer.parseInt(args[4]);

		String name1 = "dan";
		String name2 = "guy";
		String name3 = "noga";
		int sum = 83;
		double eachOne = sum/3;


		

		System.out.println("Dear " + name1 + ", " + name2 + " and " + name3 + ":pay " +
		 Math.ceil(eachOne) + " shekels each");
		
	    // Replace this comment with the rest of your code   
	}
}
