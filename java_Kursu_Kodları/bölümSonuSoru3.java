package java_Kursu_Kodlarý;

import java.util.Arrays;

public class bölümSonuSoru3 {

	public static void main(String[] args) {
		String kartTurleri[] = { "kupa", "karo", "sinek", "maca" };
		String kartNumaralari[] = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", };
		int[] iskambilDestesi = new int[52];

		desteyiOlustur(iskambilDestesi);
		desteyiKaristir(iskambilDestesi);
		desteyiGOSTER(iskambilDestesi, kartTurleri, kartNumaralari);

	}

	private static void desteyiKaristir(int[] iskambilDestesi) {
		for (int i = 0; i < iskambilDestesi.length; i++) {
			int rastgeleIndex = (int) (Math.random() * iskambilDestesi.length);
			int geciciDeste = iskambilDestesi[i];
			iskambilDestesi[i] = geciciDeste;
			iskambilDestesi[rastgeleIndex] = geciciDeste;
		}

	}

	private static void desteyiGOSTER(int[] iskambilDestesi, String[] kartTurleri, String[] kartNumaralari) {
		for (int i = 0; i < 4; i++) {
			String kartTuru = kartTurleri[iskambilDestesi[i] / 13];
			String kartNumarasi = kartNumaralari[iskambilDestesi[i] % 13];
			System.out.println(kartNumarasi + " " + kartTuru);
		}

	}

	private static void desteyiOlustur(int[] iskambilDestesi) {
		for (int i = 0; i < iskambilDestesi.length; i++) {
			iskambilDestesi[i] = i;
		}
	}

}
