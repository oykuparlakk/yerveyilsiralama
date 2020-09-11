import java.util.ArrayList;
import java.util.Comparator;

public class YilaGoreSirala implements Comparable<Kisi>{

	public static ArrayList<Kisi> kisilistesi = new ArrayList<>();

	public YilaGoreSirala(ArrayList list) {
		this.kisilistesi=list;
	}
	public static Comparator<Kisi> DOGUMYILI =new Comparator<Kisi>() {
		public int compare(Kisi bir,Kisi iki) {
			Integer oYear1 = bir.yil;
			Integer oYear2 = iki.yil;
			return oYear1.compareTo(oYear2);
		}
	};
	public int compareTo(Kisi o) {
		return 0;
	}
}
