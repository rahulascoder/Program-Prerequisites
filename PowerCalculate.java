import java.util.Scanner;
import java.lang.Math;

class PowerCalculate{
	public static void main(String args[]){
		
		System.out.println("Enter base and power : ");
		Scanner sc = new Scanner(System.in);
		double b = sc.nextDouble();
		double p = sc.nextDouble();
		double power = Math.pow(b,p);
		//double result = Math.round(area *100.0)/100.0;
		System.out.println(power);
	}
}