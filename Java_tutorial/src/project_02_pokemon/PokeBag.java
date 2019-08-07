package project_02_pokemon;

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
			ArrayList<Pokemon> cur_pokemon_list = new ArrayList<Pokemon>();
			cur_pokemon_list.add(_pokemon);
			this.pokemons.put(cur_pokemon_name, cur_pokemon_list);
		}
	}
	
	
	public Pokemon getStrongest(String _name) {
		Set<String> key = this.pokemons.keySet();
		Iterator<String> iterator = key.iterator();
		
		ArrayList<Pokemon> temp_pokemons = null;
		
		int max_cp = 0;
		Pokemon max_cp_pokemon = null;
		
		while(iterator.hasNext()) {
			max_cp = 0;
			max_cp_pokemon = null;
			temp_pokemons = this.pokemons.get(iterator.next());
			
			if(temp_pokemons.get(0) != null && temp_pokemons.get(0).name == _name) {
				for(Pokemon i : temp_pokemons) {
					if(max_cp < i.cp) {
						max_cp_pokemon = i;
						max_cp = i.cp;
					}
				}
				
				break;
			}
		}
		
		return max_cp_pokemon; 
	}
	
	
	public Pokemon getStrongest() {
		ArrayList<Pokemon> cur_pokemon_group = null;
		Pokemon strongest_pokemon = null;
		Pokemon group_strongest_pokemon = null;
		String cur_pokemon_name = "";
		
		boolean isFirstStep = true;
		
		Set<String> key = this.pokemons.keySet();
		Iterator<String> iterator = key.iterator();
		
		while(iterator.hasNext()) {
			 cur_pokemon_group = this.pokemons.get(iterator.next());
			 cur_pokemon_name = cur_pokemon_group.get(0).name;
			 
			 group_strongest_pokemon = getStrongest(cur_pokemon_name);
			 
			 if(isFirstStep) {
				 strongest_pokemon = group_strongest_pokemon;
				 
			 } else {
				 if(strongest_pokemon.cp < group_strongest_pokemon.cp) {
					 strongest_pokemon = group_strongest_pokemon;
				 }
			 }
		}
		
		return strongest_pokemon;
	}
}
