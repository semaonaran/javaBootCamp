package stringsDemo;



public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı :" + mesaj.length());
		System.out.println("5. eleman:" + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!")); // Mesaj değişkenine yaşasın metinini birleştirmeye yarar.
		System.out.println(mesaj);

		System.out.println("---------------");
		String mesaj2;

		System.out.println(mesaj2 = mesaj.concat("Yaşasın!"));
		System.out.println(mesaj2);

		System.out.println(mesaj.startsWith("B")); // Mesaj değişkeni B ile başlıyor mu diye true false değer ekrana
		                                         // yazdır.
		System.out.println(mesaj.endsWith(".")); // Mesaj değişkeni . ile bitiyor mu diye true false değer ekrana
		                                         // yazdır.

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));// Mesaj değişkeninin içerisindeki baştan başlayarak ilk bulduğu av
		// harfinin indexini verir.
		System.out.println(mesaj.lastIndexOf("a"));// Mesaj değişkeninin içerisindeki sondan başlayarak ilk bulduğu a
		// harfinin indexini verir.

		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5));// 2 ve 5. index aralarını kesip ekrana yazmamızı sağlar.

		for (String kelime : mesaj.split(" ")) {// kelimeleri çıktı olarak alt alta yazmayı sağlar.
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());// kelimelerin hepsini küçük hafle çıktı olarak yazmayı sağlar.
		System.out.println(mesaj.toUpperCase());// kelimelerin hepsini büyük hafle çıktı olarak yazmayı sağlar.
		System.out.println(mesaj.trim());// mesaj karakter dizisindeki, başta ve son da farketmediğimiz boşlukları
											// silmeye yarar.

	}

}
