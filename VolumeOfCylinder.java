import java.util.Scanner;
import java.lang.Math;

class VolumeOfCylider{
	public static void main(String args[]){
		
		System.out.println("Enter radius and height of a cylinder in Meter: ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double h = sc.nextDouble();
		double volume = Math.PI*Math.pow(r,2)*h;
		double result = Math.round(volume *100.0)/100.0;
		System.out.println(result + " meter Square");
	}
	
}