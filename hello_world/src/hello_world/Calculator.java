package hello_world;

public class Calculator {
	
	
	public static double mean(double a[]){
		double sum = 0;
		for(int i = 0;i<a.length;i++){
			
			sum += a[i];
		}
		
		return sum/a.length;
	}

}
