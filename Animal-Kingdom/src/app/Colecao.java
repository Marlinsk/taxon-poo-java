package app;

import java.util.List;

import app.entidades.Taxon;

public class Colecao {
	
	public static void dadosCompletos(List<Taxon> classe) {
		for(int i = 0; i < classe.size(); i++) {
			System.out.println(classe.get(i).toString());
		}
	}
}
