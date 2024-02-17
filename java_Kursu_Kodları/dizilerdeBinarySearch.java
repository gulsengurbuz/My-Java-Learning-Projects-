package java_Kursu_Kodlarý;

public class dizilerdeBinarySearch {

	public static void main(String[] args) {
		int dizi[] = { 1, 4, 6, 7, 8, 9, 15, 22, 31, 32, 36, 56, 58, 155, 255 };
		int arananIndex = 2;
		int minIndex = 0;
		int maxIndex = dizi.length - 1;

		while (maxIndex >= minIndex) {
			int ortancaIndex = (maxIndex + minIndex) / 2;
			int ortanca = dizi[ortancaIndex];
			if (ortanca < arananIndex) {
				minIndex = ortancaIndex + 1;

			} else if (ortanca > arananIndex) {

				maxIndex = ortancaIndex - 1;
			} else if (ortanca == arananIndex) {
				System.out.println("bulundu");
				maxIndex = -1;

			}

		}
		if (maxIndex != -1)
			System.out.println("sonuc bulunamadi");

	}

}
