import java.util.Scanner;
import java.lang.Math;

class AverageOfThree{
	public static void main(String args[]){
		
		System.out.println("Enter 3 numbers : ");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float average = (a+b+c)/3;
		//double result = Math.round(average *100.0)/100.0;
		System.out.println(average);
	}
	
}