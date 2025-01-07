import java.util.Scanner;
import java.lang.Math;

class KilometerToMiles{
	public static void main(String args[]){
		
		System.out.println("Enter distance in Kilometer : ");
		Scanner sc = new Scanner(System.in);
		double k = sc.nextDouble();
		double miles = k*0.621371;
		//double result = Math.round(average *100.0)/100.0;
		System.out.println(miles +"miles");
	}
	
}