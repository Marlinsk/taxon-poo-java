package app.codex;

import java.util.ArrayList;
import java.util.List;

import app.LerArquivo;
import app.entidades.Taxon;

public class Codex implements Classes {

	@Override
	public void Artropodes() throws Exception {
		List<Taxon> Artropodes = new ArrayList<>();
		LerArquivo.LerArquivoArtropodesCSV(Artropodes);
	}

	@Override
	public void Aves() throws Exception {
		List<Taxon> Aves = new ArrayList<>();
		LerArquivo.LerArquivoAvesCSV(Aves);
	}

	@Override
	public void Mamiferos() throws Exception {
		List<Taxon> Mamiferos = new ArrayList<>();
		LerArquivo.LerArquivoMamiferosCSV(Mamiferos);
	}

	@Override
	public void Repteis() throws Exception {
		List<Taxon> Repteis = new ArrayList<>();
		LerArquivo.LerArquivoRepteisCSV(Repteis);
	}
}
