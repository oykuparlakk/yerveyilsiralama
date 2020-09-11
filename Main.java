import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("oyku parlak/18360859019");
		

		KisiListesi liste = new KisiListesi();
		
		liste.kisiEkle("arzu parlak", "istanbul", 1979);
		liste.kisiEkle("aysenur temel", "mardin", 2000);
		liste.kisiEkle("dilay gokarslan", "manisa", 2000);
		liste.kisiEkle("melisa atilla", "istanbul", 2000);
		liste.kisiEkle("ecem ozturk", "tekirdag", 1998);
		liste.kisiEkle("ceyda tekin", "mugla", 1999);
		liste.kisiEkle("betul kanmaz", "bursa", 2000);
		liste.kisiEkle("fatih es", "tarsus", 1998);
		liste.kisiEkle("mahmut ogutcu", "bursa", 1998);
		liste.kisiEkle("faruk kayaduman", "istanbul", 2000);
		
		
		System.out.println("Hnagi siralmayi kullanmak istiyorsunuz:");
		System.out.println("a- Yere gore siralama yap"+"\n"
		                  +"b-Yila gore siralama yap"+"\n"
				          +"c-Yere ve yila gore siralama yap"+"\n");
		
		Scanner scanner= new Scanner(System.in);
		
		char deger;
		deger=scanner.next().charAt(0);
		
		switch(deger) {
		
		case 'a':
			liste.kisiEkle("YIL");
			break;
			
		case 'b':
			liste.kisiEkle("YER");
			break;
		case 'c':
			liste.kisiEkle("YERYIL");
		    break;
		}
		
	}
}
