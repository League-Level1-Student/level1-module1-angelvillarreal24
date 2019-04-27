package the_Vault;

public class Vault {
	static int secretCode = 4000;
	public static void main(String[] args) {
		Vault a = new Vault();
		a.tryCode(4000);
	}
	
	public Vault() { 
		
	}
	public boolean tryCode(int code) {
		
		if(code == secretCode) {
			System.out.println("ol");
			return true;  
		}else{
			return false;
		}
	}
	
}
