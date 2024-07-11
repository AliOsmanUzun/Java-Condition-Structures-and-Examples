import java.util.Scanner;

public class WorkSpace_NotHesaplamaOrnegi {
	public static void main(String[] args) {

		// Not Hesaplama Programı

		// Ad soyad , Ders adı girilsin
		// Kriterler
		// vize1 %30 -- vize2 %30 -- final %40
		// Geçme Notu 60 olsun

		Scanner input = new Scanner(System.in);

		System.out.print("Adınızı Giriniz : ");

		String ogrenci_ad = input.nextLine();

		System.out.print("Soyadınızı Giriniz : ");

		String ogrenci_soyad = input.nextLine();

		System.out.print("Ders adınızı giriniz lütfen : ");

		String ders_adi = input.nextLine();

		System.out.print("Vize1 notunuzu giriniz : ");

		double vize1 = input.nextDouble();

		System.out.print("Vize2 notunuzu giriniz : ");

		double vize2 = input.nextDouble();

		System.out.print("Final notunuzu giriniz : ");

		double final1 = input.nextDouble();

		double sinavlar_sonuc = (vize1 * 0.3) + (vize2 * 0.3) + (final1 * 0.4);

		if (sinavlar_sonuc >= 60) {
			System.out.println("Tebrikler" + " " + ogrenci_ad + " " + ogrenci_soyad + " " + ders_adi + " " + "Dersinden"
					+ " " + sinavlar_sonuc + " " + " ortalama ile başarıyla geçtiniz");
		} else {
			System.out.println("Maalesef" + " " + ogrenci_ad + " " + ogrenci_soyad + " " + ders_adi + " " + "Dersinden"
					+ " " + sinavlar_sonuc + " " + " ortalama ile kaldınız");
		}
   
		input.close();

	}
}
