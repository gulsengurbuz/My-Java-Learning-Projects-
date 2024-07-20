package java_Kursu_Kodlarý;

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Boyunuzu giriniz:");
	    int boy = sc.nextInt();
		System.out.println(" Kilonuzu giriniz : ");
	     double  kilo= sc.nextDouble();
	     
		double boyu = (double)boy/100;
		double boyunKaresi=Math.pow(boyu,2);
		double VucutKitleIndeksi=0;
		
		VucutKitleIndeksi = kilo / boyunKaresi;
		System.out.println(VucutKitleIndeksi );
		
		if(VucutKitleIndeksi < 15)
			System.out.println("Çok ciddi derecede düþük kiloludur.");
		else if(VucutKitleIndeksi >15 && VucutKitleIndeksi < 16 )
			System.out.println("Ciddi derecede düþük kiloludur.");
		else if(VucutKitleIndeksi >=16 && VucutKitleIndeksi < 18.5 )
			System.out.println("Düþük kiloludur.");
		else if(VucutKitleIndeksi >=18.5 && VucutKitleIndeksi < 25 )
			System.out.println("Normal kiloludur.");
		else if(VucutKitleIndeksi >=25 && VucutKitleIndeksi < 30 )
			System.out.println("Fazla kiloludur.");
		else if(VucutKitleIndeksi >=30 && VucutKitleIndeksi < 35 )
			System.out.println("1.derece obezdir. ");
		else if(VucutKitleIndeksi >=35 && VucutKitleIndeksi < 40 )
			System.out.println("2.derece obezdir.");
		else 
			System.out.println("3.derece obezdir.");
	
	}
}


