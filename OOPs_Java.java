//complex numbers
import java.util.Scanner;

class ComplexNumbers {
	
	int real, imaginary; 

	public ComplexNumbers(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}

	public void plus(ComplexNumbers C2){
		this.real += C2.real; 
		this.imaginary += C2.imaginary; 
		print(this.real, this.imaginary);
	}

	public void multiply(ComplexNumbers C2){
		int newReal = this.real * C2.real - this.imaginary * C2.imaginary;
		int newImaginary = this.real * C2.imaginary + this.imaginary * C2.real;
		print(newReal, newImaginary);
	}

	public void print(int real, int imaginary){
		System.out.println(real + " + i" + imaginary);
	}
}

class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Input
		int real1 = sc.nextInt();
		int imaginary1 = sc.nextInt();
		int real2 = sc.nextInt();
		int imaginary2 = sc.nextInt();
		int operation = sc.nextInt();
		
		// Creating complex numbers
		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		// Performing operations based on input
		if (operation == 1) {
			c1.plus(c2);
		} else if (operation == 2) {
			c1.multiply(c2);
		}
	}
}


//Polynomial class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Polynomial{
    public int[] coef;  // coefficients
    public int deg;     // degree of polynomial (0 for the zero polynomial)

    // a * x^b
    public Polynomial( int a, int b ){
        coef = new int[ b + 1 ];
        coef[ b ] = a;
        deg = degree();
    }


    public Polynomial( Polynomial p ){
        coef = new int[ p.coef.length ];
        for( int i = 0; i < p.coef.length; i++ ){
            coef[ i ] = p.coef[ i ];
        }//end for
        deg = p.degree();
    }


    // return the degree of this polynomial (0 for the zero polynomial)
    public int degree(){
        int d = 0;
        for( int i = 0; i < coef.length; i++ )
            if( coef[ i ] != 0 ) d = i;
        return d;
    }


    // return c = a + b
    public Polynomial plus( Polynomial b ){
        Polynomial a = this;
        Polynomial c = new Polynomial( 0, Math.max( a.deg, b.deg ) );
        for( int i = 0; i <= a.deg; i++ ) c.coef[ i ] += a.coef[ i ];
        for( int i = 0; i <= b.deg; i++ ) c.coef[ i ] += b.coef[ i ];
        c.deg = c.degree();
        return c;
    }


    // return (a - b)
    public Polynomial minus( Polynomial b ){
        Polynomial a = this;
        Polynomial c = new Polynomial( 0, Math.max( a.deg, b.deg ) );
        for( int i = 0; i <= a.deg; i++ ) c.coef[ i ] += a.coef[ i ];
        for( int i = 0; i <= b.deg; i++ ) c.coef[ i ] -= b.coef[ i ];
        c.deg = c.degree();
        return c;
    }


    // return (a * b)
    public Polynomial times( Polynomial b ){
        Polynomial a = this;
        Polynomial c = new Polynomial( 0, a.deg + b.deg );
        for( int i = 0; i <= a.deg; i++ )
            for( int j = 0; j <= b.deg; j++ )
                c.coef[ i + j ] += ( a.coef[ i ] * b.coef[ j ] );
        c.deg = c.degree();
        return c;
    }


    // get the coefficient for the highest degree
    public int coeff(){return coeff( degree() ); }


    // get the coefficient for degree d
    public int coeff( int degree ){
        if( degree > this.degree() ) throw new RuntimeException( "bad degree" );
        return coef[ degree ];
    }


    // convert to string representation
    public String toString(){
        if( deg == 0 ) return "" + coef[ 0 ];
        StringBuilder s = new StringBuilder();
        for( int i = 0; i <= deg; i++){
            if( coef[ i ] == 0 ){
                continue;
            }else if( coef[ i ] > 0 ){
                s = s.append(( coef[ i ] ));
            }else if( coef[ i ] < 0 ) s .append("-" + ( -coef[ i ] ));

            if( i == 1 ){
                s.append("x1");
            }else if( i > 1 ) s.append("x" + i);
            s.append(" ");
        }
        return s.toString();
    }



}

public class Solution {
    // test client
    public static void main( String[] args ) throws IOException {

        int count1, count2, choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count1 = Integer.parseInt(br.readLine().split(" ")[0]);

        int[] degree1 = new int[count1];
        int[] coeff1 = new int[count1];

        String nm[] = br.readLine().split(" ");
        for (int i = 0; i < count1; i++) {
            degree1[i] = Integer.parseInt(nm[i]);
        }

        nm = br.readLine().split(" ");
        for (int i = 0; i < count1; i++) {
            coeff1[i] = Integer.parseInt(nm[i]);
        }

        Polynomial first = new Polynomial(0,0);
        for (int i = 0; i < count1; i++) {
            first = first.plus(new Polynomial(coeff1[i],degree1[i]));
        }

        count2 = Integer.parseInt(br.readLine().split(" ")[0]);

        int[] degree2 = new int[count2];
        int[] coeff2 = new int[count2];

        nm = br.readLine().split(" ");
        for (int i = 0; i < count2; i++) {
            degree2[i] = Integer.parseInt(nm[i]);
        }

        nm = br.readLine().split(" ");
        for (int i = 0; i < count2; i++) {
            coeff2[i] = Integer.parseInt(nm[i]);
        }

        Polynomial second = new Polynomial(0,0);
        for (int i = 0; i < count2; i++) {
            second = second.plus(new Polynomial(coeff2[i],degree2[i]));
        }

        choice = Integer.parseInt(br.readLine().split(" ")[0]);

        Polynomial result = new Polynomial(0,0);
        switch (choice) {
            // Add
            case 1 : {
                result = first.plus(second);
                System.out.println(result);
                break;
            }
            // Subtract
            case 2 : {
                result = first.minus(second);
                System.out.println(result);
                break;
            }
            // Multiply
            case 3 : {
                result = first.times(second);
                System.out.println(result);
                break;
            }
            case 4 : // Copy constructor
            {
                Polynomial third = new Polynomial(first);
                if (third.coef == first.coef) {
                    System.out.println("false");
                } else {
                    System.out.println("true");
                }
                break;
            }
            case 5 : // Copy assignment operator
            {
                Polynomial fourth = new Polynomial(first);
                if (fourth.coef == first.coef) {
                    System.out.println("false");
                } else {
                    System.out.println("true");
                }
                break;
            }
        }
    }
}


//Fraction class 
import java.util.Scanner;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        int queries = sc.nextInt();

        Fraction fraction = new Fraction(numerator, denominator);

        for (int i = 0; i < queries; i++) {
            int type = sc.nextInt();
            int num = sc.nextInt();
            int den = sc.nextInt();

            Fraction other = new Fraction(num, den);

            if (type == 1) {
                fraction = fraction.add(other);
            } else if (type == 2) {
                fraction = fraction.multiply(other);
            }
            System.out.println(fraction);
        }
    }
}

//Person class 
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("The name of the person is " + name + " and the age is " + age + ".");
    }
}

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        String name = sc.nextLine();
        int age = sc.nextInt();

        // Creating a Person object
        Person person = new Person(name, age);

        // Printing details
        person.printDetails();
    }
}
//Area of rectangle 
import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public int getArea() {
        return length * breadth;
    }
}

