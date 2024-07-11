import java.util.Scanner;

public class WorkSpace_NotHesaplama2 {
		public static void main(String[] args) {
			
			// Öğrenci Notu'nun Hesaplanması
			// Else if kullanarak çoklu koşuk kullanımı 
			
			// 80-100 A
			// 60-80 B 
			// 50-60 C
			// 40-49 F Kaldı
			// Vize1'in %30'u Vize2'nin %30'u Final'in %40'ı alınacak ve ortalama not hesaplanacak
			
			Scanner input = new Scanner(System.in); // Kullanıcıdan veri almak için
			
			System.out.print("Vize1 Notunuzu Giriniz : ");
			double vize1 = input.nextDouble();
			System.out.print("Vize2 Notunuzu Giriniz : ");
			double vize2 = input.nextDouble();
			System.out.print("Final Notunuzu Giriniz : ");
			double final_not = input.nextDouble();
			
			double ortalama = (vize1*0.3) + (vize2*0.3) + (final_not*0.4);
			
			if (ortalama>=80 && ortalama<=100) {
					System.out.println("Notunuz : A " + ortalama );
				} 
			else if (ortalama>=60 && ortalama<80) {
				System.out.println("Notunuz : B " + ortalama);
			}
			else if (ortalama>=50 && ortalama<60) {
				System.out.print("Notunuz : C " + ortalama);
			}
			else if (ortalama>=40 && ortalama<=49) {
				System.out.println("Notunuz F Ders'ten kaldınız :/ " + ortalama);
			}
			else {
				System.out.println("GEÇERLİ BİR NOT GİRİNİZ LÜTFEN !!!");
			}
			
			input.close();
			
			
			
			
		}
}
