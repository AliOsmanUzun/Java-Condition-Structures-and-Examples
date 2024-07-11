

public class WorkSpace_KoşulYapıları {

	public static void main(String[] args) {

		// if - else koşul yapıları
		
		// if'den sonra bir koşul belirtiyorum
		// eğer bu koşul sağlanıyorsa if'den sonraki kod bloğu çalışır
		// eğer koşulum sağlanmıyorsa else'den sonraki kod bloğu çalışır.
		// if veya else bloğundan sadece 1 tanesi çalışır 
		// çalıştıktan sonra compiler diğer koda geçer 
		
		int x = 58;
		int y = 34; 
		if (x>y) {
			System.out.println("58 , 34'ten büyüktür...");
		} else {
				System.out.println("58 , 34'ten küçüktür...");
		}
		
		// Burada da else yapısını çalıştıralım
		int a = 20; 
		int b = 55;
		
		if (a>b) {
				System.out.println("20 , 50'den büyüktür...");
		} else {
				System.out.println("20 , 50'den küçüktür...");
		}
	}
}
