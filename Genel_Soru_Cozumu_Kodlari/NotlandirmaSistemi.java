package java_Kursu_Kodlarý;

import java.util.Scanner;

public class NotlandirmaSistemi {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Lütfen Notunuzu Giriniz :");
		
		int girilenNot = sc.nextInt();
		
			if((girilenNot<100)&& girilenNot>=90) {
				System.out.println("Kullanýcýnýn harf notu : AA");
			}
			else if((girilenNot<90)&& girilenNot>=80) {
				System.out.println("Kullanýcýnýn harf notu : BB");
			}
			else if((girilenNot<80)&& girilenNot>=70) {
				System.out.println("Kullanýcýnýn harf notu : CC");
			}
			else if((girilenNot<70)&& girilenNot>=60) {
				System.out.println("Kullanýcýnýn harf notu : CD");
			}
			else if((girilenNot<60)&& girilenNot>=50) {
				System.out.println("Kullanýcýnýn harf notu : DD");
			}
			else if(girilenNot<50 ) {
				System.out.println("Kullanýcýnýn harf notu : FF");
			}
			else {
				System.out.println(" Geçerli bir not giriniz!!!");
			}
	}

}
