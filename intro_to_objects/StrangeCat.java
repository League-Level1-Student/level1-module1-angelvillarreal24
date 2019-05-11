package intro_to_objects;

public class StrangeCat {
	int howMuchFood;
	String hobby;
	String name;

	public StrangeCat(int howMuchFood, String hobby, String name) {
		this.howMuchFood = howMuchFood;
		this.hobby = hobby;
		this.name = name;
	}

	public void meow() {
		System.out.println("Meow!");
	}

	public void purr() {
		System.out.println("purr...purr");
	}

	public void eat() {
		System.out.println("NomNom!");
	}

	public void sleep() {
		System.out.println(
				"zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
	}

	public void intro() {
		System.out.println("His name is "+name+ "!");
	}

}

/*
 * 
 * Cat
 * 
 * int howMuchFood String hobby String name
 * 
 * void meow() void purr() void eat() void sleep()
 * 
 */