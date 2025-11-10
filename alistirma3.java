package dikucgenhipo;

import java.util.Scanner;

public class alistirma3 {
 //dik üçgende hipotenüsü bul
	public static void main(String[] args) {
		  
		double hipo;
		int kısaDik,uzunDik;
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Kısa dik kenarı giriniz:");
		kısaDik=input.nextInt(); 
		System.out.print("Uzun dik kenarı giriniz:");
		uzunDik=input.nextInt();
		
		 hipo=Math.sqrt(kısaDik*kısaDik + uzunDik*uzunDik);
		 System.out.println("Hipotenüs:"+hipo);
		
		
	

	}

}
