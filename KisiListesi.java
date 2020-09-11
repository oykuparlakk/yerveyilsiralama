import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class KisiListesi {

	public static ArrayList<Kisi> arrayofContacs = new ArrayList<>();
	String YER="YER";
	String YIL="YIL";
	String YERYIL="YERYIL";
	String adSoyad;
	String yer;
	int yil;
	public void kisiEkle(String adSoyad,String yer,int yil) {
		this.adSoyad=adSoyad;
		this.yer=yer;
		this.yil=yil;
		arrayofContacs.add(new Kisi(adSoyad,yer,yil));
	}
	public void Goster(Object arrayList) {
		
		for(Kisi kisi:arrayofContacs) {
			System.out.println(kisi.writeContacs());
		}
	}
	
	void kisiEkle(String siralama) {
		if(siralama=="YER") {
			YereGoreSirala siralamaYer = new YereGoreSirala();
			Collections.sort(YereGoreSirala.arrayList,YereGoreSirala.MEMLEKET);
			Goster(YereGoreSirala.arrayList);
		}
		
		if(siralama=="YIL") {
			Collections.sort(arrayofContacs,YilaGoreSirala.DOGUMYILI);
			Goster(YilaGoreSirala.kisilistesi);
		}
		if(siralama=="YERYIL") {
			
			Collections.sort(arrayofContacs,YereGoreSirala.MEMLEKET);
			System.out.println("yere göre siralaniyor..");
			Goster(YilaGoreSirala.kisilistesi);
			Collections.sort(arrayofContacs,YilaGoreSirala.DOGUMYILI);
			System.out.println("yila göre siralaniyor..");
			Goster(YilaGoreSirala.kisilistesi);
			
		}
	}
	
	
	
	
}