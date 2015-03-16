/**
 * Java's Generic Classes:
 * These classes are known as parameterized classes or parameterized types because they accept one or more parameters.
*/

public class Box<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();

		integerBox.set(new Integer(0));
		integerBox.set(new Integer(2015));
		stringBox.set(new String("two thousand fifteen"));
		
		System.out.printf("As Integer: %d\n", integerBox.get());
		System.out.printf("As String: %s\n", stringBox.get());		
	}
}
