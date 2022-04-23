package app;

import java.util.List;

import app.entidades.Taxon;

public class Filtros {
	
	public static void filtrarNomejuntoEspecie(List<Taxon> classe) {
		SelectSort.ordemAlfabeticaNomeEspecie(classe);
		System.out.println("\nFitro com Nome e Esp�cie:");
		for(int i = 0; i < classe.size(); i++) {
			System.out.println("Nome: " + classe.get(i).getNome() + ", Esp�cie: " + classe.get(i).getEspecie());
		}
	}
}
