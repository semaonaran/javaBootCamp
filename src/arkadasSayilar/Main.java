package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		int number1 = 220;
		int number2 = 284;
		int arkadasSayi1 = 0;
		int arkadasSayi2 = 0;
		
		for (int i = 1; i < number1; i++) {

			if (number1 % i == 0) {
				arkadasSayi1 += i;
			}
		}
		for (int j = 1; j < number2; j++) {

			if (number2 % j == 0) {
				arkadasSayi2 += j;
			}
		}
		if (arkadasSayi1 == number2 && arkadasSayi2 == number1) {
			
				System.out.println(number1 + "ve" + number2 + "Sayıları arkadaş sayılardır.");}
			else {
				System.out.println(number1 + "ve" + number2 + "Arkadaş sayı değiller.");
			}
	}

}
