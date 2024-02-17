package java_Kursu_Kodlarý;

public class selection_Sort {

	public static void main(String[] args) {
		int dizi[] = { 8, 4, 6, 15, 32, 56, 31, 155, 36, 7, 9, 255, 1, 22 };

		for (int i = 0; i < dizi.length; i++) {
			int oAnkiEnKucukDeger = dizi[i];
			int oAnkiEnKucukDegerIndexi = i;
			for (int j = i + 1; j < dizi.length; j++) {

				if (oAnkiEnKucukDeger > dizi[j]) {
					oAnkiEnKucukDeger = dizi[j];
					oAnkiEnKucukDegerIndexi = j;
				}

			}
			if (oAnkiEnKucukDegerIndexi != i) {
				dizi[oAnkiEnKucukDegerIndexi] = dizi[i];
				dizi[i] = oAnkiEnKucukDeger;
			}

		}

		for (int i : dizi) {
			System.out.print(i + "  ");

		}

	}

}
