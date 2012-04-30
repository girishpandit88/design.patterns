package designpatterns.flyweight;

import java.util.HashMap;

public class CharacterFactory {
	HashMap<String, FlyweightCharacter> map = new HashMap<String, FlyweightCharacter>();

	public FlyweightCharacter getCharacter(String font, char ch, int size) {
		String key = font + ch + size;
		FlyweightCharacter c = null;
		if (map.containsKey(key))
			return map.get(key);
		else {
			c = new FlyweightCharacter(font, size, ch);
			map.put(key, c);
		}
		return c;
	}
}
