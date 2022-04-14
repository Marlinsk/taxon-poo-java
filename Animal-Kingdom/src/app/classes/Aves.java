package app.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import app.LerArquivos;
import app.entidades.Taxon;

public class Aves {

	public static void listarAves(List<Taxon> aves) throws Exception {
		LerArquivos.LerArquivoAvesCSV(aves);
		ordenarParaAlfabetica(aves);
		for(int i = 0; i < aves.size(); i++) {
			System.out.println(aves.get(i).toString());
		}
	}

	public static void ordenarParaAlfabetica(List<Taxon> aves) {
		for (int i = 0; i < aves.size(); i++) {
			for (int j = i + 1; j < aves.size(); j++) {
				String listaA = aves.get(j).getNome();
				String listaB = aves.get(i).getNome();
				if (listaA.compareTo(listaB) < 1) {
					Taxon temp = aves.get(i);
					aves.set(i, aves.get(j));
					aves.set(j, temp);
				}
			}
		}
	}
}
