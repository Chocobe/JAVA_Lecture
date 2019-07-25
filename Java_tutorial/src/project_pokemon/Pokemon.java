package project_pokemon;

public class Pokemon {
	public final String name;
	public final int cp;
	
	
	public Pokemon(String _name, int _cp) {
		this.name = _name;
		this.cp = _cp;
	}
	
	
	@Override
	public String toString() {
		return name + "(" + this.cp + ")";
	}
}
