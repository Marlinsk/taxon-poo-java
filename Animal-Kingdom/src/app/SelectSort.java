package app;

import java.util.List;

import app.entidades.Taxon;

public class SelectSort {
	
	public static void ordemAlfabeticaNome(List<Taxon> classe) {
		for (int i = 0; i < classe.size(); i++) {
			for (int j = i + 1; j < classe.size(); j++) {
				String listaNome1 = classe.get(i).getNome();
				String listaNome2 = classe.get(j).getNome();
				if (listaNome1.compareTo(listaNome2) < 1) {
					Taxon temp = classe.get(i);
					classe.set(i, classe.get(j));
					classe.set(j, temp);
				}
			}
		}
	}
	
	public static void ordemAlfabeticaNomeEspecie(List<Taxon> classe) {
		for (int i = 0; i < classe.size(); i++) {
			for (int j = i + 1; j < classe.size(); j++) {
				String listaNome1 = classe.get(i).getNome();
				String listaEspecie1 = classe.get(i).getEspecie();
				String listaNome2 = classe.get(j).getNome();
				String listaEspecie2 = classe.get(j).getEspecie();
				if (listaNome1.compareTo(listaNome2) < 1 && listaEspecie1.equals(listaEspecie2)) {
					Taxon temp = classe.get(i);
					classe.set(i, classe.get(j));
					classe.set(j, temp);
				}
			}
		}
	}
}
