package cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat a = new Cat("whiskers");
		a.meow();
		a.printName();
		for(int i = 1; i <= 9; i++) {
			a.kill();
		}
	}
}
