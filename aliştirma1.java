package nothesaplama;

import java.util.Scanner;

public class aliştirma1 {
    // derslerin notlarını kullanıcıdan al ve ortalamayı hesapla
	public static void main(String[] args) {
		
		 int turkce,mat,fizik;
		 Scanner input =new Scanner(System.in);
		 
		 System.out.print("Türkçe notunuzu giriniz:");
		 turkce = input.nextInt(); 
		 
		 System.out.print("Mat notunuzu giriniz:");
		 mat= input.nextInt(); 
		 
		 System.out.print("Fizik notunuzu giriniz:");
		 fizik = input.nextInt(); 
		 
		 float ort= (turkce + mat + fizik)/3f;
		 System.out.println("Not Ortalamanız:"+ort);
		 
		 if(ort>60) {
			 System.out.println("Sınıfı geçti");
		 }
		 else {
			 System.out.println("Sınıfta kaldı");
		 }
	}

}
