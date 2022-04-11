package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import app.entidades.Taxon;
import app.funcoes.LerArquivos;

public class Main {

	public static void main(String[] args) throws Exception { 
		
		try {
			List<Taxon> artropodes = new ArrayList<>();
			LerArquivos.LerArquivoArtropodesCSV(artropodes);
			
			for(int i = 0; i < artropodes.size(); i++) {
				System.out.println(artropodes.get(i).toString());
			}
			
		}catch (Exception e) {
			throw e;
		}
		
	}
}
