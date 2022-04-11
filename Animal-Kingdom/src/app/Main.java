package app;

import java.util.ArrayList;
import java.util.List;

import app.entidades.Taxon;

public class Main {

	public static void main(String[] args) throws Exception { 
		List<Taxon> artropodes = new ArrayList<>();
		LerArquivos.LerArquivoArtropodes(artropodes);
		for(int i = 0; i < artropodes.size(); i++) {
			System.out.println(artropodes.get(i).toString());
		}
	}
}
