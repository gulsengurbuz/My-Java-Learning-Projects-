package java_Kursu_Kodlar�;

import java.util.Scanner;

public class NotlandirmaSistemi {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("L�tfen Notunuzu Giriniz :");
		
		int girilenNot = sc.nextInt();
		
			if((girilenNot<100)&& girilenNot>=90) {
				System.out.println("Kullan�c�n�n harf notu : AA");
			}
			else if((girilenNot<90)&& girilenNot>=80) {
				System.out.println("Kullan�c�n�n harf notu : BB");
			}
			else if((girilenNot<80)&& girilenNot>=70) {
				System.out.println("Kullan�c�n�n harf notu : CC");
			}
			else if((girilenNot<70)&& girilenNot>=60) {
				System.out.println("Kullan�c�n�n harf notu : CD");
			}
			else if((girilenNot<60)&& girilenNot>=50) {
				System.out.println("Kullan�c�n�n harf notu : DD");
			}
			else if(girilenNot<50 ) {
				System.out.println("Kullan�c�n�n harf notu : FF");
			}
			else {
				System.out.println(" Ge�erli bir not giriniz!!!");
			}
	}

}
