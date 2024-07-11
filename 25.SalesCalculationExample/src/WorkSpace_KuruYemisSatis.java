
public class WorkSpace_KuruYemisSatis {
	public static void main(String[] args) {
			
				/*
				  Bir kuruyemişçi toptancıdan ; 
				  12 kilo leblebiyi , k1unu 3.5 Tl
				  25 kilo fındık , kilosunu  15.7 Tl
				  40 kilo badem , kilosunu 22 Tl den almıştır
				  
				  Bu ürünleri satarken , 
				  --> Leblebinin kilosunu %50 fazlasına satmış 
				  --> Fındık ise , %40 fazlasına 
				  --> Badem ise , %60 fazlasına satılmıştır.
				  
				  Kuruyemişçi o günkü kazandığı para ile dükkanının kirasını ödemek istemektedir.
				  
				  Kira Tutarı : 500 Tl
				  Kazandığı para 500 Tl den yüksek ise kirayi ödeyebilsin değilse ödeyemesin...
		        */
		
		// Değeri stabil olmayan bir şeyi değişken içinde tanımlamak her zaman daha faydalıdır.
		
		double leblebi = 3.5 ;
		double findik = 15.7;
		double badem = 22 ; 
		
		double maaliyetTutar = (leblebi*12) + (findik*25)+(badem*40) ;
		
		double satisTutar = ((leblebi*1.5)*12) + ((findik*1.4)*25) + ((badem*1.6)*40) ;
		
		double karTutar = satisTutar - maaliyetTutar ;
		
		if (karTutar>500) {
				System.out.println("Bugünkü kiranızı ödeyebilirsiniz ");
		} else {
				System.out.println("Bugünkü kirayı ödemek için yeterli bakiyeniz bulunmamaktadır");
		}
		
		System.out.println("Maaliyet Tutarınız : " + maaliyetTutar);
		System.out.println("Satış Tutarınız : " + satisTutar);
		System.out.println("Kar Tutarınız : "+karTutar);
			
			
	}
}
