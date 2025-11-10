package ödev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("İsminizi giriniz: ");
        String isim = scanner.nextLine();

        // Oyuncu nesnesi oluşturuluyor
        Oyuncu oyuncu = new Oyuncu(isim, 7);

        String menu = """
                Hoşgeldin Sevgili %s!
                Bu bir sayı tahmin oyunudur.
                Bu oyunda %d tahmin hakkın bulunmaktadır.
                Tahminlerin 1-100 aralığında olmalıdır.
                İYİ ŞANSLAR!
                """.formatted(oyuncu.getIsim(), oyuncu.getTahminHakki());

        System.out.println(menu);

        Random rnd = new Random();
        int tutulanSayi = rnd.nextInt(100) + 1; // 1–100 arası sayı

        int[] sayiArray = new int[oyuncu.getTahminHakki()];
        int tahminSayisi = 0;

        while (oyuncu.getTahminHakki() > 0) {
            tahminSayisi += 1;
            System.out.println(" ");
            System.out.print("Tahmininiz: ");

            // 🔹 Eğer sayı değilse hata mesajı göster ve tekrar iste
            if (!input.hasNextInt()) {
                System.out.println("Lütfen sadece sayı giriniz!");
                input.next(); // hatalı girdiyi temizle
                continue;
            }

            int sayi = input.nextInt();

            if (sayi > 100 || sayi < 1) {
                System.out.println("Değer aralığının dışına çıktınız. Lütfen 1-100 aralığında bir değer giriniz.");
                oyuncu.hakAzalt();
                System.out.println("Kalan hakkınız: " + oyuncu.getTahminHakki());
                System.out.println(" ");
                continue;
            }

            if (tutulanSayi != sayi) {
                sayiArray[7 - oyuncu.getTahminHakki()] = sayi;
                oyuncu.hakAzalt();
                System.out.println("Yanlış Tahmin! Kalan Hakkınız: " + oyuncu.getTahminHakki());
            }
            
            if(sayi<tutulanSayi) {
            	System.out.println("Tutulan sayı tahmininizden daha büyük ");
            	sayi--;
            }
            else {
            	System.out.println("Tutulan sayı tahmininizden daha küçük");
            }

            if (oyuncu.getTahminHakki() == 0) {
                System.out.println(" ");
                System.out.println("Tahmin hakkınız bitti!");
                System.out.println("Tutulan Sayı: " + tutulanSayi);
                System.out.println("Tahminleriniz: " + Arrays.toString(sayiArray));
            }

            if (sayi == tutulanSayi) {
                System.out.println("TEBRİKLER! DOĞRU TAHMİN");
                System.out.println("Tutulan Sayı: " + tutulanSayi);
                break;
            }
        }
    }

    static class Oyuncu {
        private String isim;
        private int tahminHakki;

        public Oyuncu(String isim, int tahminHakki) {
            this.isim = isim;
            this.tahminHakki = tahminHakki;
        }

        public String getIsim() {
            return isim;
        }

        public int getTahminHakki() {
            return tahminHakki;
        }

        public void hakAzalt() {
            if (tahminHakki > 0) {
                tahminHakki--;
            }
        }
    }
}
