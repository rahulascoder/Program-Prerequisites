import java.util.Scanner;
import java.lang.Math;

class SimpleInterst{
	public static void main(String args[]){
		
		System.out.println("Enter principle , rate and time : ");
		Scanner sc = new Scanner(System.in);
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float t = sc.nextFloat();
		float SI = (p*r*t)/100;
		//double result = Math.round(SI *100.0)/100.0;
		System.out.println(SI);
	}
	
}