package designpatterns.prototype;

public class PrototypeTest {
	public static void main(String args[]) {
		MonsterRegistry rm = new MonsterRegistry();
		try {
			UsingPrototype(rm);
			UsingPrototypeManager(rm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void UsingPrototypeManager(MonsterRegistry rm) throws Exception {
		rm.RegisterMonster("Alien", new Alien());
		rm.RegisterMonster("Cyborg", new Cyborg());
		rm.RegisterMonster("Geth", new Geth());

		System.out.println("Getting instances of monsters through clonning");

		Monster cyborg1 = rm.GetMonster("Cyborg");
		cyborg1.Attack();

		Monster alien1 = rm.GetMonster("Alien");
		alien1.Attack();

		Monster geth1 = rm.GetMonster("Geth");
		geth1.Attack();

		System.out.println("Getting clones of monsters");

		Monster cyborg2 = cyborg1.Clone();
		cyborg2.Attack();

		Monster alien2 = alien1.Clone();
		alien2.Attack();

		Monster geth2 = geth1.Clone();
		geth2.Attack();
	}

	private static void UsingPrototype(MonsterRegistry rm) throws CloneNotSupportedException {
		Monster cyborg = rm.CreateMonster("Cyborg");
		cyborg.Attack();
		Monster alien = rm.CreateMonster("Alien");
		alien.Attack();
		Monster geth = rm.CreateMonster("Geth");
		geth.Attack();

		System.out.println("Clonning monsters...");

		Monster cyborg1 = cyborg.Clone();
		cyborg1.Attack();
		Monster alien1 = alien.Clone();
		alien1.Attack();
		Monster geth1 = geth.Clone();
		geth1.Attack();

	}
}
