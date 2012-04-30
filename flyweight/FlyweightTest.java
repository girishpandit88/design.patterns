package designpatterns.flyweight;

import java.util.Random;

public class FlyweightTest {
	public static int MAX_OBJECTS = 10000;

	public static void main(String args[]) {
		WithoutFlyweight();
		WithFlyweight();
	}

	private static void WithFlyweight() {
		System.out.println("With flyweight...");
		FlyweightCharacter[] ch = new FlyweightCharacter[MAX_OBJECTS];
		CharacterFactory cf = new CharacterFactory();
		for (int i = 0; i < MAX_OBJECTS; ++i) {
			ch[i] = cf.getCharacter("Arial", (char) RandomNumber.GetRandomNumber(65, 122),
					RandomNumber.GetRandomNumber(8, 12));
		}
		System.out.println("Total object created: " + FlyweightCharacter.getCount());
	}

	private static void WithoutFlyweight() {
		System.out.println("Without flyweight");
		Character[] ch = new Character[MAX_OBJECTS];
		Random r = new Random();
		for (int i = 0; i < MAX_OBJECTS; ++i) {
			ch[i] = new Character("Arial", (char) r.nextInt(90), RandomNumber.GetRandomNumber(8, 12),
					new Position(1, 1));
		}
		System.out.println("Total object created: " + Character.getCount());
	}
}

class RandomNumber {
	static Random rand = new Random();

	public static int GetRandomNumber(int low, int high) {
		return rand.nextInt(high - low + 1);
	}
}
