public class GenericMethodTest {
	
	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = {0, 1, 2, 3, 4, 5};
		Double[] doubleArray = {0.0, 1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] charArray = {'H','e', 'l', 'l', 'o'};

		System.out.println("Array integerArray contains:");        
		GenericMethodTest.printArray(intArray);
        
		System.out.println("\nArray doubleArray contains:" );
		GenericMethodTest.printArray(doubleArray);
        
		System.out.println("\nArray characterArray contains:");
		printArray(charArray);
	}
}