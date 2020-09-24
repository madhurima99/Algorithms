package oopsAssignment;
import java.util.*;

public class Fraction {
	private int numerator;
	private int denominator;
	
	//constructor for Fraction class
	Fraction(int numerator, int denominator)
	{
		int Gcd = gcd(numerator, denominator);
		this.numerator = numerator/Gcd;
		this.denominator = denominator/Gcd;
	}
	
	//gcd function to make a valid fraction
	private int gcd(int n1, int n2)
	{
		if(n2==0)
		{
			return n1;
		}
		return gcd(n2, n1%n2);
	}
	
	//accessor methods
	public int getNumerator()
	{
		return this.numerator;
	}
	public int getDenominator()
	{
		return this.denominator;
	}
	
	//mutator methods
	public void setNumerator(int num)
	{
		this.numerator = num;
	}
	public void setDenominator(int den)
	{
		this.denominator = den;
	}
	
	//get the value of fraction
	public double getValue()
	{
		return (double)numerator/denominator;
	}
	
	//getting the value in string format
	public String toString()
	{
		return numerator + "/" + denominator;
	}
	
	//checking if two fraction are equal or not
	public void isEqual(Fraction F2)
	{
		int Gcd = gcd(F2.numerator, F2.denominator);
		if(F2.numerator/Gcd == this.numerator && F2.denominator/Gcd == this.denominator)
		{
			System.out.println("Both the fractions are equal.....");
		}
		else {
			System.out.println("Both the fractions are not equal.....");
		}
	}
	
	//addition operation between two fraction objects
	public Fraction addFraction(Fraction f1, Fraction f2)
	{
		Fraction f3 = new Fraction(f1.numerator*f2.denominator + f2.numerator*f1.denominator, f1.denominator*f2.denominator);
		int Gcd = gcd(f3.numerator, f3.denominator);
		f3.numerator /= Gcd;
		f3.denominator /= Gcd;
		return f3;
	}

	//subtraction operation between two fraction objects
	public Fraction subtractFraction(Fraction f1, Fraction f2)
	{
		Fraction f3 = new Fraction(f1.numerator*f2.denominator - f2.numerator*f1.denominator, f1.denominator*f2.denominator);
		int Gcd = gcd(f3.numerator, f3.denominator);
		f3.numerator /= Gcd;
		f3.denominator /= Gcd;
		return f3;
	}
	
	//multiply operation between two fraction objects
	public Fraction multiplyFraction(Fraction f1, Fraction f2)
	{
		Fraction f3 = new Fraction(f1.numerator*f2.numerator, f1.denominator*f2.denominator);
		int Gcd = gcd(f3.numerator, f3.denominator);
		f3.numerator /= Gcd;
		f3.denominator /= Gcd;
		return f3;
	}
	
	//addition operation between two fraction objects
	public Fraction divideFraction(Fraction f1, Fraction f2)
	{
		Fraction f3 = new Fraction(f1.numerator*f2.denominator, f1.denominator*f2.numerator);
		int Gcd = gcd(f3.numerator, f3.denominator);
		f3.numerator /= Gcd;
		f3.denominator /= Gcd;
		return f3;
	}
	
	public static void main(String[] args)
	{
		int num, den;
		Scanner input = new Scanner(System.in);
		System.out.println("Inputs for fraction 1 : ");
		System.out.println("Enter the numerator for fraction 1 : ");
		num = input.nextInt();
		System.out.println("Enter the denominator for fraction 1 : ");
		den = input.nextInt();
		Fraction f1 = new Fraction(num, den);
		System.out.println("Inputs for fraction 2 : ");
		System.out.println("Enter the numerator for fraction 2 : ");
		num = input.nextInt();
		System.out.println("Enter the denominator for fraction 2 : ");
		den = input.nextInt();
		Fraction f2 = new Fraction(num, den);
		Fraction f3;
		
		System.out.println("-----Your input fractions are : -----------");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println("Adding two fraction...........");
		f3 = f1.addFraction(f1, f2);
		System.out.println(f3.toString());
		
		System.out.println("Subtracting two fraction...........");
		f3 = f1.subtractFraction(f1, f2);
		System.out.println(f3.toString());
		
		System.out.println("Multiplying two fraction...........");
		f3 = f1.multiplyFraction(f1, f2);
		System.out.println(f3.toString());
		
		System.out.println("Dividing two fraction...........");
		f3 = f1.divideFraction(f1, f2);
		System.out.println(f3.toString());
		
		System.out.println("Checking if fraction 1 and fraction 2 are equal or not.......");
		
		if(f1.equals(f2))
		{
			System.out.println("Both the fraction are equal.....");
		}
		else {
			System.out.println("Both the fractions are unequal.......");
		}
		input.close();
	}
}

class DriverFraction
{
	
}
/*
 	Output =>
	Enter the denominator for fraction 2 : 
	16
	-----Your input fractions are : -----------
	12/13
	15/16
	Adding two fraction...........
	387/208
	Subtracting two fraction...........
	-3/208
	Multiplying two fraction...........
	45/52
	Dividing two fraction...........
	64/65
	Checking if fraction 1 and fraction 2 are equal or not.......
	Both the fractions are unequal.......
*/