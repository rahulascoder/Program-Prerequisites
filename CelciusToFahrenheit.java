import java.util.Scanner;

public class CelciusToFahrenheit{
	
	public static void main(String args[]){
		System.out.println("Enter temp in celcius");
		double celcius;
		Scanner sc = new Scanner(System.in);
		celcius = sc.nextDouble();
		//System.out.println(temp);
		double Fahrenheit = (celcius * 9/5) + 32;
		double result = Math.round(Fahrenheit * 100.0)/100.0;
		System.out.println(result + "degree Fahrenheit");
	}
}