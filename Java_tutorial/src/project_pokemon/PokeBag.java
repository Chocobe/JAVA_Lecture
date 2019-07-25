package project_pokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PokeBag {
	private final HashMap<String, ArrayList<Pokemon>>  pokemons = 
			new HashMap<String, ArrayList<Pokemon>>();
	
	public ArrayList<Pokemon> getPokemons(String _name) {
		return this.pokemons.get(_name);
	}
	
	
	public void add(Pokemon _pokemon) {
		String cur_pokemon_name = _pokemon.name;
		ArrayList<Pokemon> cur_pokemon = this.getPokemons(cur_pokemon_name);
		
		if(cur_pokemon != null) {
			cur_pokemon.add(_pokemon);
			
		} else {
			pokemons.put(cur_pokemon_name, cur_pokemon);
		}
	}
	
	
	public Pokemon getStrongest(String _name) {
		Set<String> key = this.pokemons.keySet();
		Iterator<String> iterator = key.iterator();
		
		
		
		
		return new Pokemon("", 12);
	}
	
	
	public Pokemon getStrongest() {
		
		
		return new Pokemon("", 12);
	}
}
