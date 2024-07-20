package java_Kursu_Kodlarý;

import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("lütfen sayi giriniz: ");
        int sayi= sc.nextInt();
        
        for (int i = 2; i <= sayi; i++) { 
            boolean asalMi = true;
            double karakok = Math.sqrt(i);
            
            for (int j = 2; j <= karakok; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break; 
                }
            }
            
            if (asalMi) {
                System.out.println(i);
            }
        }
    }
}
		
        

	


