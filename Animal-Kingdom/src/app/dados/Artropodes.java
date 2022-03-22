package app.dados;

import app.entidades.Taxon;
import app.negocio.Registros;

public class Artropodes implements Registros {

	@Override
	public void RegistroA() {
		
		Taxon Abelha_europeia = new Taxon("Abelha-europeia", "Apis mellifera", "Apis", "Apidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Abelha_gigante_asiatica = new Taxon("Abelha-gigante-asiática", "Apis dorsata", "Apis", "Apidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Abelha_melifera_asiatica = new Taxon("Abelha-melífera-asiática", "Apis cerana", "Apis", "Apidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		
		Taxon[] arthropoda = { Abelha_europeia, Abelha_gigante_asiatica, Abelha_melifera_asiatica };
		
		System.out.println("Registros de nomes de artrópodes que começam com a letra A: " + "\n");
		
		for (Taxon t: arthropoda) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroB() {
		
		Taxon Borboleta_azul = new Taxon("Borboleta-azul", "Maculinea alcon", "Maculinea", "Lycaenidae", "Lepidoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Borboleta_cauda_de_andorinha = new Taxon("Borboleta-cauda-de-andorinha", "Papilio machaon", "Papilio", "Papilionidae", "Lepidoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Borboleta_do_manaca = new Taxon("Borboleta-do-manacá", "Methona themisto", "Methona", "Nymphalidae", "Lepidoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Borboleta_monarca = new Taxon("Borboleta-monarca", "Danaus plexippus", "Danaus", "Nymphalidae", "Lepidoptera", "Insecta", "Arthropoda", "Animalia");
		
		Taxon[] arthropoda = { Borboleta_azul, Borboleta_cauda_de_andorinha, Borboleta_do_manaca, Borboleta_monarca };
		
		System.out.println("Registros de nomes de artrópodes que começam com a letra B: " + "\n");
		
		for (Taxon t: arthropoda) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroC() {
		
		Taxon Cigarra_do_cafeeiro = new Taxon("Cigarra-do-cafeeiro", "Carineta fasciculata", "Carineta", "Cicadidae", "Hemiptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Cigarra_marrom_asiatica = new Taxon("Cigarra-marrom-asiática", "Graptopsaltria nigrofuscata", "Graptopsaltria", "Cicadidae", "Hemiptera", "Insecta", "Arthropoda", "Animalia");
		
		Taxon[] arthropoda = { Cigarra_do_cafeeiro, Cigarra_marrom_asiatica };
		
		System.out.println("Registros de nomes de artrópodes que começam com a letra C: " + "\n");
		
		for (Taxon t: arthropoda) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroD() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroE() {
		
		Taxon Escaravelho_vermelho = new Taxon("Escaravelho-vermelho", "Rhynchophorus ferrugineus", "Rhynchophorus", "Curculionidae", "Coleoptera", "Insecta", "Arthropoda", "Animalia");
		
		Taxon[] arthropoda = { Escaravelho_vermelho };
		
		System.out.println("Registros de nomes de artrópodes que começam com a letra E: " + "\n");
		
		for (Taxon t: arthropoda) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroF() {
		
		Taxon Formiga_cabo_verde = new Taxon("Formiga-cabo-verde", "Paraponera clavata", "Paraponera", "Formicidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Formiga_Carpinteira = new Taxon("Formiga-Carpinteira", "Camponotus cruentatus", "Camponotus", "Formicidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Formiga_da_madeira = new Taxon("Formiga-da-madeira", "Formica paralugubris", "Formica", "Formicidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Formiga_de_fogo = new Taxon("Formiga-de-fogo", "Solenopsis invicta", "Solenopsis", "Formicidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Formiga_farao = new Taxon("Formiga-faraó", "Monomorium pharaonis", "Monomorium", "Formicidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		
		Taxon[] arthropoda = { Formiga_cabo_verde, Formiga_Carpinteira, Formiga_da_madeira, Formiga_de_fogo, Formiga_farao };
		
		System.out.println("Registros de nomes de artrópodes que começam com a letra F: " + "\n");
		
		for (Taxon t: arthropoda) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroG() {
		
		Taxon Gafanhoto_do_campo = new Taxon("Gafanhoto-do-campo", "Chorthippus paralellus", "Chorthippus", "Acrididae", "Orthoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Gafanhoto_gigante = new Taxon("Gafanhoto-gigante", "Tropidacris dux", "Tropidacris", "Romaleidaee", "Orthoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Gafanhoto_migratório = new Taxon("Gafanhoto-migratório", "Locusta migratoria", "Locusta", "Acrididae", "Orthoptera", "Insecta", "Arthropoda", "Animalia");
		
		Taxon[] arthropoda = { Gafanhoto_do_campo, Gafanhoto_gigante, Gafanhoto_migratório };
		
		System.out.println("Registros de nomes de artrópodes que começam com a letra G: " + "\n");
		
		for (Taxon t: arthropoda) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroH() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroI() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroJ() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroK() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroL() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroM() {
		
		Taxon Mariposa_atlas = new Taxon("Mariposa-atlas", "Attacus atlas", "Attacus", "Saturniidae", "Lepidoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Mariposa_espelho = new Taxon("Mariposa-espelho", "Rosthschildia aurota", "Rosthschildia", "Saturniidae", "Lepidoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Mariposa_Leopardo = new Taxon("Mariposa-Leopardo", "Hypercompe escribonia", "Hypercompe", "Erebidae", "Lepidoptera", "Insecta", "Arthropoda", "Animalia");
		
		Taxon[] arthropoda = { Mariposa_atlas, Mariposa_espelho, Mariposa_Leopardo };
		
		System.out.println("Registros de nomes de artrópodes que começam com a letra M: " + "\n");
		
		for (Taxon t: arthropoda) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroN() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroO() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroQ() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroR() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroT() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroU() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroV() {
		
		Taxon Vespa_comum = new Taxon("Vespa-comum", "Vespula vulgaris", "Vespula", "Vespidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Vespa_europeia = new Taxon("Vespa-europeia", "Vespa crabro", "Vespa", "Vespidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		Taxon Vespa_gigante_asiatica = new Taxon("Vespa-gigante-asiática", "Vespa mandarinia", "Vespa", "Vespidae", "Hymenoptera", "Insecta", "Arthropoda", "Animalia");
		
		Taxon[] arthropoda = { Vespa_comum, Vespa_europeia, Vespa_gigante_asiatica };
		
		System.out.println("Registros de nomes de artrópodes que começam com a letra V: " + "\n");
		
		for (Taxon t: arthropoda) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroW() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroX() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroY() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroZ() {
		// TODO Auto-generated method stub
		
	}

}
