package java_Kursu_Kodlar�;

import java.util.Scanner;

public class Fakt�riyel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Bir sayi giriniz :");
		int hesaplanacakSayi = sc.nextInt();
		
		int fakt�riyel= 1;
		if(hesaplanacakSayi == 0) {
			fakt�riyel =1;
		}
		else {
			for (int i = 1; i <= hesaplanacakSayi; i++) {
				
				fakt�riyel = fakt�riyel*i;
			}
		}
		
		System.out.println(hesaplanacakSayi+"' say�s�n�n fakt�riyeli :"+fakt�riyel);
		
	}

}
