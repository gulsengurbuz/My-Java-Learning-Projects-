package java_Kursu_Kodlarý;

import java.util.Scanner;

public class bölümSonuSoru4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ogrenci sayisi : ");
		int ogrenciSayisi = sc.nextInt();
		System.out.println("Toplam soru sayisi : ");
		int soruSayisi = sc.nextInt();

		String cevapKagidi[][] = new String[ogrenciSayisi][soruSayisi];
		String siklar[] = { "A", "B", "C", "D", "E" };
		String cevapAnahtari[] = new String[soruSayisi];
		cevapAnahtariniOlustur(cevapAnahtari, siklar);
		ogrenciCevaplariniYerlestir(cevapKagidi, siklar, soruSayisi);
		ogrencileriDegerlendir(cevapKagidi, cevapAnahtari);

	}

	private static void ogrencileriDegerlendir(String[][] cevapKagidi, String[] cevapAnahtari) {
		int dogruSayisi = 0;
		int yanlisSayisi = 0;
		for (int i = 0; i < cevapKagidi.length; i++) {
			for (int j = 0; j < cevapAnahtari.length; j++) {
				if (cevapKagidi[i][j] == cevapAnahtari[j]) 
					dogruSayisi++;
				 else 
					yanlisSayisi++;
			}
			System.out.println(
					"\n" + (i + 1) + ". ogrencinin dogru sayisi : " + dogruSayisi + " yanlis sayisi : " + yanlisSayisi);
			dogruSayisi = 0;
			yanlisSayisi = 0;
		}

	}

	private static void ogrenciCevaplariniYerlestir(String[][] cevapKagidi, String[] siklar, int soruSayisi) {
		for (int i = 0; i < cevapKagidi.length; i++) {
			for (int j = 0; j < soruSayisi; j++) {
				int cevaplar = (int) (Math.random() * siklar.length);
				cevapKagidi[i][j] = siklar[cevaplar];

			}

		}

	}

	private static void cevapAnahtariniOlustur(String[] cevapAnahtari, String siklar[]) {
		for (int i = 0; i < cevapAnahtari.length; i++) {

			int cevaplar = (int) (Math.random() * siklar.length);
			cevapAnahtari[i] = siklar[cevaplar];

		}

	}

}
