package the_Vault;

public class JamesBond {
	public void findCode(Vault a) {
		for(int i = 1;i <= 1000000; i++) {
			a.tryCode(i);
		}
	}
}
