package com.revature.serf;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.webservice.PokemonWebService;

public class RequestHelper {

	public static void process(HttpServletRequest request, HttpServletResponse response) {
		
		String uri = request.getRequestURI();
		
		switch(uri) {
		
		case "/PokeApp/getPokemon.do": {
			PokemonWebService.getPokemon(request, response);
			break;
		}
		
		case "/PokeApp/addPokemon.do": {
			PokemonWebService.addPokemon(request, response);
			break;
		}
		
		default: {
			try {
				response.sendError(451);
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}
		
		}
		
	}
	
}
