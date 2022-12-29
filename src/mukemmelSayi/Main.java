package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int number=5;
		int mukemmelSayi=0;
		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				mukemmelSayi += i;
			}
		}
		
		if (mukemmelSayi == number) {
			System.out.println(number + " mükemmel sayıdır.");
		} else {
			System.out.println(number + " mükemmel sayı değildir.");
		}
			
		
	}

}
