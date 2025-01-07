import java.util.Scanner;
import java.lang.Math;

class PerimeterOfRectangle{
	public static void main(String args[]){
		
		System.out.println("Enter Length and Breadth of a rectangel : ");
		Scanner sc = new Scanner(System.in);
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		float peri = 2*(l+b);
		double result = Math.round(peri *100.0)/100.0;
		System.out.println("Perimeter of Rectangle is " +result +" cm");
	}
	
}