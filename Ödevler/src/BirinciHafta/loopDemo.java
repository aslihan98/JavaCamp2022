package BirinciHafta;

public class loopDemo {

	public static void main(String[] args) {
		
		String message ="Döngü bitti.";
		
		System.out.println("***********for*******************");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println(message);
		
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println(message);
		
		System.out.println("************while******************");
		int i = 1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println(message);
	}

}
