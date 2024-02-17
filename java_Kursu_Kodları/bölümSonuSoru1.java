package java_Kursu_Kodlarý;

import java.util.Arrays;
import java.util.Random;

public class bölümSonuSoru1 {

	public static void main(String[] args) {

		int dizi[] = new int[100];
		int toplam = 0;

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
			toplam = toplam + dizi[i];
			System.out.println(dizi[i]);
		}
		double ortalama = (double) (toplam / dizi.length);
		System.out.println("Dizinin Ortalamasi : " + ortalama);
		int ortalamadegerinaltindakidegerler = 0;
		Arrays.sort(dizi);

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] < ortalama) {

				ortalamadegerinaltindakidegerler++;
			}
		}

		System.out.println("Ortalmanin altindaki eleman sayisi : " + ortalamadegerinaltindakidegerler);

	}

}
