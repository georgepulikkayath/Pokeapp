package com.revature.db;

import java.util.HashMap;
import java.util.Map;

import com.revature.model.Pokemon;

public class FakeDB {

	public static Map<Integer, Pokemon> team = new HashMap<Integer, Pokemon>();
	
	//static block is code that executes the very first time a class is loaded.
	//
	static {
		Pokemon p1 = new Pokemon(1, "Bulbasaur", "Grass/Poison");
		Pokemon p2 = new Pokemon(25, "Pikachu", "Electric");
		Pokemon p3 = new Pokemon(19, "Jigglypuff", "Fairy");
		
		team.put(1, p1);
		team.put(25, p2);
		team.put(19, p3);
	}
	
}
