package kdvtutarı;

import java.util.Scanner;

public class alistirma2 {
     // kullanıcıdan para değeri al kdvli ve kdvsiz tutarını hesapla
	public static void main(String[] args) {
		
		  
		 double para, kdvoran=0.18;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Tutarı giriniz:");
		 para = input.nextDouble();
		 
		 double kdvTutar = para*kdvoran;
		 System.out.println("KDV Tutarı:"+kdvTutar);
		 
		 double kdvliTutar = para+kdvTutar;
		 System.out.println("KDV\'li Tutar:"+kdvliTutar);
		 
		if(para<=1000 && para>0) {
			kdvoran=0.18;
			System.out.println("KDV Oranı:"+kdvoran);
		}
		else {
			kdvoran=0.08;
			System.out.println("KDV Oranı:"+kdvoran);
		}
		 
		 
		 
		 

	}

}
