package designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class MonsterRegistry {

	private Map<String, Monster> registry = new HashMap<String, Monster>();

	public Monster CreateMonster(String monster_name) {
		Monster m = null;
		if (monster_name.equals("Geth"))
			m = new Geth();
		else if (monster_name.equals("Alien"))
			m = new Alien();
		else if (monster_name.equals("Cyborg"))
			m = new Cyborg();

		m.LoadSound();
		m.LoadTextures();

		return m;
	}

	public void RegisterMonster(String name, Monster monster) {
		if (!registry.containsKey(name)) {
			monster.LoadSound();
			monster.LoadTextures();
			registry.put(name, monster);
		}
	}

	public Monster GetMonster(String name) throws Exception {
		if (registry.containsKey(name))
			return registry.get(name).Clone();
		throw new Exception("Monster not registered");
	}
}
