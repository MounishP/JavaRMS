package dec4;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Unary
		double a = 10;
		double b = 20;
//		a++;
//		System.out.println(a);
//		System.out.println(a);
		
		//Arithmetic
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Conditional
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//Assignment
		double v = 34;
		v+=10; // v = v + 10; -> 34 + 10 =44 -> v = 44
		System.out.println(v);
		
		//Logical
		System.out.println((a<b) && (b<v));
		System.out.println((a>b) || (b>v));

	}

}
