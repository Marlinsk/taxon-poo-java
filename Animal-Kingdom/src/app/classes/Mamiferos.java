package app.classes;

import java.util.ArrayList;
import java.util.List;

import app.LerArquivo;
import app.entidades.Taxon;

public class Mamiferos {
	
	public static void secaoMamiferos() throws Exception {
		List<Taxon> Mamiferos = new ArrayList<>();
		LerArquivo.LerArquivoAvesCSV(Mamiferos);
	}
}
