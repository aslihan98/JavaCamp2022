package BirinciHafta;

public class intro {

	public static void main(String[] args) {
		System.out.println("Hello Java!");
		
		//değişken isimlendirme = camelCase
		//
		String message = "İlginizi çekebilir";
		
		System.out.println(message);
		
		int vade=12;
		
		double dolarDun =17.45;
		double dolarBugun =18.50;
		boolean dolarDustuMu= false;
		
		if (dolarDun<dolarBugun) {
			System.out.println("Yukarı Oku");
		}else if (dolarDun>dolarBugun) {
			System.out.println("Aşağı Oku");
		} else {
			System.out.println("Eşittiroku");
		}
		
		
		String[] krediler= {"Hızlı Kredi", "Maaşını Halkbanktan Alan","Mutlu Emekli"};
		System.out.println(krediler[1]);
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	
	
	}

}
