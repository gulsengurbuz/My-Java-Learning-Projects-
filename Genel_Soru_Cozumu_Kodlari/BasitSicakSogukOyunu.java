package java_Kursu_Kodlar�;

import java.util.Random;
import java.util.Scanner;

public class BasitSicakSogukOyunu {
	

	public static void main(String[] args) {
		Random rnd = new Random();
		int sayi = rnd.nextInt(100)+1;
		Scanner sc = new Scanner(System.in);
		
		int sayac =0;
		etiket1:
		while(sayi>0) {
			System.out.println(" Bir sayi tahmininde bulunun : ");
			int tahmin = sc.nextInt();
			if(tahmin < sayi) {
				System.out.println(" say�y� artt�r.");
			}
			else if(tahmin > sayi) {
				System.out.println(" say�y� azalt.");
			}
		   else if ( sayi == tahmin ) {
			   System.out.println(sayac+".denemede say�y� buldunuz.");
			   break etiket1;
		   }
		   sayac++;
		}
	}

}
