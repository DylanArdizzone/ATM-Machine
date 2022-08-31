import java.util.HashMap;

public class ATM {
	private HashMap<Integer, Double> accounts;

	public ATM() {
		accounts = new HashMap<Integer, Double>();
	}
	
	public void openAccount(Integer accNum) {
		accounts.put(accNum, 0.0);
	}
	
	public void openAccount(Integer accNum, double deposit) {
		accounts.put(accNum, deposit);
	}
	
	public void closeAccount(Integer accNum) {
		accounts.remove(accNum);
	}
	
	public double checkBalance(Integer accNum) {
		if(accounts.get(accNum) == null) {
			return 0.0;
		}
		return accounts.get(accNum);
	}
	
	public boolean depositMoney(Integer accNum, double deposit) {
		if(accounts.get(accNum) == null) {
			return false;
		}
		if(deposit <0) {
			return false;
		}
		double k = accounts.get(accNum) + deposit;
		accounts.put(accNum, k);
		return true;
	}
	
	public boolean withdrawMoney(Integer accNum, double withdraw) {
		if(accounts.get(accNum) == null) {
			return false;
		}
		if(withdraw <0) {
			return false;
		}
		if(withdraw > accounts.get(accNum)) {
			return false;
		}
		double k = accounts.get(accNum) - withdraw;
		accounts.put(accNum, k);
		return true;
	}
	
}
