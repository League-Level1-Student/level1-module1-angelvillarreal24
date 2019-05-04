package the_Vault;

public class Vault {
	static int secretCode = 7596809;
	public static void main(String[] args) {
		JamesBond a = new JamesBond();
		Vault b = new Vault();
		int d = a.findCode(b);
		System.out.println(d);
	}

	public Vault() { 
		
	}
	public boolean tryCode(int code) {
		
		if(code == secretCode) {
			
			return true; 
		}else{
			return false;
		}
	}
	
}
