import java.util.Comparator;

public class YereGoreSirala {

	public class YereGoreSirala implements Comparable<Kisi>{
		public static ArrayList<Kisi> arrayList = new ArrayList<Kisi>();
		public YereGoreSirala(ArrayList list) {
			this.arrayList=list;
			}
			public static Comparator<Kisi> MEMLEKET =new Comparator<Kisi>() {
				
				public int compare(Kisi bir,Kisi iki) {
					return bir.yer.compareTo(iki.yer);
				}
			};
			public int compareTo(Kisi o) {
				return 0;
			}
		}



	
}

