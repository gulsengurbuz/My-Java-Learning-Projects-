package java_Kursu_Kodlar�;

import java.util.Random;
import java.util.Scanner;

public class PiyangoOyunu {

	public static void main(String[] args) {
	
		Random rnd = new Random();
		
		int uretilenSayi = rnd.nextInt(99) + 10;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Iki basamakli sayi tahmininiz nedir ? ");
		int tahmin=sc.nextInt();
		int basamak1 = uretilenSayi /10;
	    int basamak2 = uretilenSayi % 10;
	    int thmbasamak1 = tahmin/10;
	    int thmbasamak2 = tahmin % 10;
	    
		
	    if(uretilenSayi == tahmin) {
	    	System.out.println("Do�ru cevap! Tebrikler 10000 TL kazand�n�z.sansl� say�:"+uretilenSayi + " sizin tahmininiz :"+tahmin);
	    }
	    else if (((uretilenSayi% 10)== (tahmin/10))&&((uretilenSayi/10)==(tahmin%10))) {
	    	System.out.println("Tebrikler 5000TL kazand�n�z!sansl� say�:"+uretilenSayi + " sizin tahmininiz :"+tahmin);
	    }
	    else if ((basamak1==thmbasamak1)|| (basamak1==thmbasamak2) || (basamak2==thmbasamak1)|| (basamak2==thmbasamak2)) {
	    	 System.out.println("Tebrikler 1000TL kazand�n�z!sansl� say�:"+uretilenSayi + " sizin tahmininiz :"+tahmin);
	    }
	    else {
	    	System.out.println("Malesef �d�l kazanamad�n�z sansl� say�:"+uretilenSayi + " sizin tahmininiz :"+tahmin );
	    }
	
	}

}
