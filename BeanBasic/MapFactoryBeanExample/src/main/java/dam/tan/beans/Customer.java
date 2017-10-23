package dam.tan.beans;

import java.util.Map;

public class Customer {
	private Map<String, Person> maps;

	public Map<String, Person> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Person> maps) {
		this.maps = maps;
	}

	@Override
	public String toString() {
		String str = "";
		for(Map.Entry<String, Person> entry : maps.entrySet()) {
			str+=" Key: "+entry.getKey()+", Value: "+entry.getValue();
		}
		return str;
	}
}
