package java_Kursu_Kodlarý;

import java.util.Scanner;

public class palidromeSayi {

	public static void main(String[] args) {
		int sayac =0;
		Scanner sc = new Scanner (System.in);
		System.out.println("lütfen kelime giriniz: ");
        String kelime = sc.nextLine();
        
        for (int i = 0; i < kelime.length(); i++) {
        	
        		if(kelime.charAt(i)==kelime.charAt(kelime.length()-1-i)) {
        			sayac++;
        			
        			continue;
        		}
        		else {
        			break;
        		}
			}
        if(sayac==kelime.length()) {
        	System.out.println(kelime+" kelimesi palidromedir.");
        }
        else {
        	System.out.println(kelime+" kelimesi palidrome deðildir.");
        }
	}

}
