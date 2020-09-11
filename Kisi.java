
public class Kisi {

	public String adSoyad;
	public String yer;
	public int yil;
	public Kisi(String adSoyad, String yer, int yil) {
		
		this.adSoyad = adSoyad;
		this.yer = yer;
		this.yil = yil;
	}
	
	public String writeContacs() {
		return"Kisi bigileri: AD SOYAD:"+this.adSoyad+"MEMLEKET:"+this.yer+"DOGUM YILI:"+this.yil;
	}

}