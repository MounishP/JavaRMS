package dec3;

public class HelloWorld {
	
	static int b = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main method");          //sysout -> Crtl + Space
		call();   //function call
		System.out.println("inside main after call method");
		add();
		System.out.println("inside main after add method");
//		System.out.println(a);
		System.out.println(b);
	}

	private static void add() {
		// TODO Auto-generated method stub
		System.out.println("inside add method");
		System.out.println(5+9);
		
		int a = 10;
		System.out.println(a);
	}

	private static void call() {
		// TODO Auto-generated method stub
		System.out.println("inside call method");
//		System.out.println(a);
	}

}
