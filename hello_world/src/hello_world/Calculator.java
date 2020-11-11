package hello_world;

public class Calculator {
	
	
	public static double mean(double a[]){
		double sum = 0;
		for(int i = 0;i<a.length;i++){
			
			sum += a[i];
		}
		
		return sum/a.length;
	}
	
	// I want to add a new calculation: variance
	
	public static double var(double a[]){
		double mean = Calculator.mean(a);
		double variance = 0;
		for(int i=0;i<a.length;i++){
			variance += Math.pow(a[i]-mean,2);
		}
		return variance;
	}

}
