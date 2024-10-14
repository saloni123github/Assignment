package second.assignment;

public class Que16 {

	public static void main(String[] args) {

		int n = 7;
		boolean isPrime = true;
		if (n < 2) {

		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;

			}
		}
		if (isPrime) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");

		}
	}

}
