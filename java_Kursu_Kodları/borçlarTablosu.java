package java_Kursu_Kodlarý;

public class borçlarTablosu {
	public static void main(String[] args) {

		int[][] borclar = { { 0, 100, 200 }, { 350, 0, 250 }, { 150, 500, 0 } };
		String[] isimler = { "emre", " hasan", "ali" };

		for (int satir = 0; satir < isimler.length; satir++) {
			for (int sutun = 0; sutun < isimler.length; sutun++) {
				if (satir != sutun) {
					int toplamalacagim = borclar[satir][sutun] - borclar[sutun][satir];
					if (toplamalacagim < 0) {
						System.out.println(
								isimler[satir] + " ' nin " + isimler[sutun] + " 'den alacagi :" + (-toplamalacagim));
					}

				}

			}

		}

	}

}
