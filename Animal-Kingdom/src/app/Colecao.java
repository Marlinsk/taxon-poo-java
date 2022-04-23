package app;

import java.util.List;

import app.entidades.Taxon;

public class Colecao {
	
	public static void todosDados(List<Taxon> classe) {
		System.out.println("Todos os dados disponíveis:");
		for(int i = 0; i < classe.size(); i++) {
			System.out.println(classe.get(i).toString());
		}
	}
}
