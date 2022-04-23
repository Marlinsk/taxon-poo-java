package app;

import java.util.ArrayList;
import java.util.List;

import app.entidades.Codex;
import app.entidades.Taxon;

public class Main {

	public static void main(String[] args) throws Exception { 
		
		Codex codex = new Codex();
		List<Taxon> Aves = new ArrayList<>();
		
		LerArquivo.LerArquivoAvesCSV(Aves);
		codex.getRegistros().todosRegistros(Aves);
		codex.getFiltros().filtrarNomejuntoEspecie(Aves);
		
	}
}
