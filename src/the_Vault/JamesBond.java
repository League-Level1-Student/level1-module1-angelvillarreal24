package the_Vault;

public class JamesBond {
	public int findCode(Vault b) {
		for(int i = 1;i <= 1000000; i++) {
			boolean c = b.tryCode(i);
			if(c) {
				return i;
			}
			
		}
		return -1;
		
	}
	public JamesBond() {
	}
		
	
}
