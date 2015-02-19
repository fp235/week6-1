import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height, width; 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the height of a rectangle ");
		height = keyboard.nextDouble();
		System.out.println("Enter the width of rectangle ");
		width = keyboard.nextDouble();
		
		double area = height * width;
		System.out.println("Your area is " + area);
		
		System.out.println("Your perimeter " + area*2);
	
		
		
	}

}
