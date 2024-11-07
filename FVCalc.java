// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		rate/=100;
		int n = Integer.parseInt(args[2]);

		

		Double result =  currentValue * Math.pow(1 + rate , n);
		int intResult = (int) result.doubleValue();

		rate*=100;
		

		System.out.println("After " +  n +  " years, a $" + currentValue +  " saved at " +  rate + "%25" +
		  " will yield $" +  intResult);



	}
}