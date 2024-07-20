package java_Kursu_Kodlarý;

import java.util.Scanner;

public class SayilarinCarpimi {
	public static void main (String[]args) {
		Scanner sc = new Scanner ( System.in);
		int carpim = 1;
		int durdurma=1;
		while(durdurma !=0) {
		System.out.println("Bir sayi giriniz :");
		int sayi =sc.nextInt();
			
			if(sayi ==0) {
				break;
			}
			else if(sayi>0) {
				carpim *= sayi;
			}
		}
		System.out.println("Kullanicinin girdiði sayilerin carpimi : "+carpim);
	}

}
