package app.classes;

import java.util.ArrayList;
import java.util.List;

import app.LerArquivo;
import app.entidades.Taxon;

public class Repteis {
	
	public static void secaoRepteis() throws Exception {
		List<Taxon> Repteis = new ArrayList<>();
		LerArquivo.LerArquivoAvesCSV(Repteis);
	}
}
