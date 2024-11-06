// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

		double perc = rate * 100;

		int result = (int) (currentValue * Math.pow(1 + rate , n));

		System.out.println("After " +  n +  " years, $" + currentValue +  " saved at " +  perc + "%" +
		  " will yield $" + result);



	}
}