package intro_to_objects;

public class RunningCat {
	public static void main(String[] args) {
		StrangeCat a = new StrangeCat(3847, "meowing","kitty");
		a.intro();
		a.meow();
		a.eat();
		a.purr();
		a.sleep();
		StrangeCat b = new StrangeCat(34847, "leaving","Strange");
		b.intro();
		b.meow();
		b.eat();
		b.purr();
		b.sleep();
	}
}
