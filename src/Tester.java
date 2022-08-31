
public class Tester {
	public static void main(String[] args) {
		ATM k = new ATM();
		k.openAccount(5);
		k.openAccount(6, 109.84);
		k.closeAccount(5);
		k.closeAccount(6);
		System.out.println(k.checkBalance(5));
		System.out.println(k.checkBalance(6));
		System.out.println(k.checkBalance(7));
		
		System.out.println(k.hasAccount(5));
		System.out.println(k.hasAccount(7));

	}

}
