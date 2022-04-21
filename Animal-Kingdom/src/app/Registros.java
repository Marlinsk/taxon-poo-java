package app;

import java.util.List;

import app.entidades.Taxon;

public class Registros {
	
	public static void todosRegistros(List<Taxon> classe) throws Exception {
		SelectSort.ordemAlfabeticaNome(classe);
		Colecao.dadosCompletos(classe);
	}
}	
