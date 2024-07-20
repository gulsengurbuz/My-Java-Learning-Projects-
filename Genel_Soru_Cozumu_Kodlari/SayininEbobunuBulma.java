package java_Kursu_Kodlarý;

import java.util.Scanner;

public class SayininEbobunuBulma {

	public static void main(String[] args) {
		int fark =0;
		int buyukSayi=0;
		int kucukSayi=0;
		int ebob =0;
		Scanner sc = new Scanner(System.in) ;
		System.out.println(" 1.Sayiyi giriniz: ");
		int sayi1 = sc.nextInt();
		System.out.println("2.Sayiyi giriniz : ");
		int sayi2 = sc.nextInt();
		
		if(sayi1>sayi2) {
			
			buyukSayi=sayi1;
			kucukSayi=sayi2;
		}
		else {
			buyukSayi = sayi2;
			kucukSayi=sayi1;
		}
		while (buyukSayi != kucukSayi) {
            System.out.println("Buyuk Sayý: " + buyukSayi + " Küçük Sayý: " + kucukSayi);
            fark = buyukSayi - kucukSayi;
            
            if (fark > kucukSayi) {
                buyukSayi = fark;
            } else {
                
                buyukSayi = kucukSayi;
                kucukSayi = fark;
            }
        }
        
        ebob = buyukSayi; 
        System.out.println("EBOB: " + ebob);
    }
		
		

	}
	
	


