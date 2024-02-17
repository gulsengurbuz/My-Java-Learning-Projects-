package java_Kursu_Kodları;

import java.util.Arrays;

public class bölümSonuSoru2 {

	public static void main(String[] args) {
		int maxdeger = 0;
		int mindeger = 0;
		int i = 0;

		int[][] Dizi = new int[3][2];
		int toplam = 0;

		for (int satir = 0; satir < Dizi.length; satir++) {
			for (int sutun = 0; sutun < Dizi[satir].length; sutun++) {
				Dizi[satir][sutun] = (int) (Math.random() * 100);

				toplam = toplam + Dizi[satir][sutun];
				int gecicidegisken = Dizi[satir][sutun];
				if (maxdeger < gecicidegisken) {
					maxdeger = gecicidegisken;

				}
				if (i == 0) {
					mindeger = Dizi[0][0];
				}

				if (mindeger > gecicidegisken) {
					mindeger = gecicidegisken;
				}
				i++;
				System.out.println(Dizi[satir][sutun]);
			}
		}
		System.out.println("Matristeki sayilarin toplami : " + toplam);
		System.out.println("Matristeki en buyuk deger : " + maxdeger);
		System.out.println("Matristeki en kucuk deger : " + mindeger);

	}

}
