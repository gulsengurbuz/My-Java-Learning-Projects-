package java_Kursu_Kodlarý;

import java.util.Scanner;

public class Faktöriyel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Bir sayi giriniz :");
		int hesaplanacakSayi = sc.nextInt();
		
		int faktöriyel= 1;
		if(hesaplanacakSayi == 0) {
			faktöriyel =1;
		}
		else {
			for (int i = 1; i <= hesaplanacakSayi; i++) {
				
				faktöriyel = faktöriyel*i;
			}
		}
		
		System.out.println(hesaplanacakSayi+"' sayýsýnýn faktöriyeli :"+faktöriyel);
		
	}

}
