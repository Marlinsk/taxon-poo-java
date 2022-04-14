package app;

import java.util.ArrayList;
import java.util.List;

import app.classes.Aves;
import app.entidades.Taxon;

public class Main {

	public static void main(String[] args) throws Exception { 
		List<Taxon> aves = new ArrayList<>();
		Aves.listarAves(aves);
	}
}
