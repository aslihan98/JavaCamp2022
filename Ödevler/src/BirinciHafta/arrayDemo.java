package BirinciHafta;

public class arrayDemo {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Melih";
		ogrenciler[1]="Serdar";
		ogrenciler[2]="Tuğçe";
		ogrenciler[3]="Rengin";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
		
	}
	

}
