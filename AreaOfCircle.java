import java.util.Scanner;
import java.lang.Math;

class PerimeterOfRectangle{
	public static void main(String args[]){
		
		System.out.println("Enter radius of a circle : ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		double area = Math.PI*Math.pow(r,2);
		double result = Math.round(area *100.0)/100.0;
		System.out.println(result);
	}
	
}