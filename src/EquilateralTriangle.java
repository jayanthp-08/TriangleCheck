import java.util.*;
public class EquilateralTriangle
{
	public static String equilateraltriangle(double a,double b,double c)
	{
		if(a<=0 || b<=0 || c<=0)
		{
			return "Invalid Input,sides must be greater than zero";
		}
		if(a+b<=c || b+c<=a || c+a<=b)
		{
			return "Its not a triangle";
		}
		if(a==b && b==c)
		{
			return "It is an Equilateral Triangle";
		}
		else
		{
			return "Its not an Equilateral Triangle";

		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side a: ");
		double a=sc.nextDouble();
		System.out.println("Enter side b: ");
		double b=sc.nextDouble();
		System.out.println("Enter side c: ");
		double c=sc.nextDouble();
		String result=equilateraltriangle(a,b,c);
		System.out.println(result);
		sc.close();
	}
}
	