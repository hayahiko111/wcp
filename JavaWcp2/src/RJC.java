
public class RJC {
	public static void main(String[] args) {
		for (int number1 = 10; number1 >= 1; number1--) {
			if (number1 % 2 == 1) {
				continue;
			}
			System.out.println(number1);
		}
	}
}