package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		char harf='O';
		System.out.println("----------  1. Methot---------------");
		
		char[] sesliHarf={'E','A','I','İ','O','Ö','U','Ü'};
		boolean sonuc=false;
	for (int i = 0; i < sesliHarf.length; i++) {
		
	if(harf == sesliHarf[i]) {
		sonuc=true;	}}
	if (sonuc) {System.out.println("harf seslidir");
		
	}else {
		System.out.println("harf sessizdir.");
	}
	
	System.out.println("----------  2. Methot---------------");
	
	switch (harf) {
	case 'A':
	case 'E':
	case 'I':	
	case 'İ':
	case 'O':
	case 'Ö':
	case 'U':
	case 'Ü':
		System.out.println("harf seslidir");
		break;
	default:
		System.out.println("harf sessizdir.");
	}
	
	}

}
