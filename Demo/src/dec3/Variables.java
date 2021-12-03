package dec3;

public class Variables {

	static int b = 10;

	public static void main(String[] args) {
//		int b = 5;
		add(b);
		System.out.println(b); //10

	}

	private static void add(int b) {
		// TODO Auto-generated method stub
		int a = 10;
		b = b + a;
		System.out.println(b);   //20

	}

}
