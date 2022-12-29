package sayiBulma;

public class Main {

	public static void main(String[] args) {
	
		int[] sayilar= new int[] {1,2,5,7,9,0};
		int aranacak=10;
		boolean varMi=false;

		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak==i) {
				varMi=true;
				break;
			}
		}
		if (varMi==true) {
			System.out.println("ifade dizide vardır.");
		}else {
			System.out.println("ifade dizide yokdur.");
		}
	}

}
