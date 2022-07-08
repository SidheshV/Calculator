class Functions{
	private int a;
	private int b;
	private int result;

	public Functions(){
	}

	public Functions(int a,int b){
		System.out.println( "Hello this was printed from Through Jenkins build " );
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + "]";
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b){
		return a-b;
	}
	
	public int multiply(int a,int b){
		return a*b;
	}

	public int divide(int a,int b){
		return a/b;
	}

}

public class Calculator {

	
public static void main(String args[]){
	Functions fnc = new Functions();
	System.out.println("Addition :"+fnc.add(3, 7));
	System.out.println("Subtraction :"+fnc.subtract(10, 5));
	System.out.println("Multiplication :"+fnc.multiply(5, 5));
	System.out.println("Division :"+fnc.divide(10, 5));
	
	System.out.println("Some changes done312131");
}
		
}
