package app;

import java.util.List;

import app.entidades.Taxon;

public class Filtros {
	
	public static void filtrarNomejuntoEspecie(List<Taxon> classe) {
		SelectSort.ordemAlfabeticaNomeEspecie(classe);
		for(int i = 0; i < classe.size(); i++) {
			System.out.println("nome: " + classe.get(i).getNome() + ", espécie: " + classe.get(i).getEspecie());
		}
	}
}
