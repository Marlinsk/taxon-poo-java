package codex.dados;

import app.entidades.Taxon;
import negocio.Registros;

public class Aves implements Registros {

	@Override
	public void RegistroA() {
		
		Taxon AraraCaninde = new Taxon("Arara-canindé", "Ara ararauna", "Ara", "Psittacidae", "Psittaciformes", "Aves", "Chordata", "Animalia");
		Taxon AraraAzulGrande = new Taxon("Arara-azul-grande", "Anodorhynchus hyacinthinus", "Anodorhynchus", "Psittacidae", "Psittaciformes", "Aves", "Chordata", "Animalia");
		Taxon AraraVermelha = new Taxon("Arara-vermelha", "Ara chloropterus", "Ara", "Psittacidae", "Psittaciformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { AraraCaninde, AraraAzulGrande, AraraVermelha };
		
		System.out.println("Registros de nomes de aves que começam com a letra A: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroB() {
		
		Taxon BemTeVi = new Taxon("Bem-te-vi", "Pitangus sulphuratus", "Pitangus", "Tyrannidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon Beija_flor_cinza = new Taxon("Beija-flor-cinza", "Aphantochroa cirrochloris", "Aphantochroa", "Trochilidae", "Apodiformes", "Aves", "Chordata", "Animalia");
		Taxon Beija_flor_de_veste_preta = new Taxon("Beija-flor de-veste-preta", "Anthracothorax nigricollis", "Anthracothorax", "Trochilidae", "Apodiformes", "Aves", "Chordata", "Animalia");
		Taxon Beija_flor_tesoura = new Taxon("Beija-flor-tesoura", "Eupetomena macroura", "Eupetomena", "Trochilidae", "Apodiformes", "Aves", "Chordata", "Animalia");
		
		Taxon Besourinho_de_bico_vermelho = new Taxon("Besourinho-de-bico-vermelho", "Chlorostilbon lucidus", "Chlorostilbon", "Trochilidae", "Apodiformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { BemTeVi, Beija_flor_cinza, Beija_flor_de_veste_preta, Beija_flor_tesoura, Besourinho_de_bico_vermelho };
		
		System.out.println("Registros de nomes de aves que começam com a letra B: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroC() {
		
		Taxon Carcara = new Taxon("Carcará", "Caracara plancus", "Caracara", "Falconidae", "Falconiformes", "Aves", "Chordata", "Animalia");
		
		Taxon Cardinal_do_norte = new Taxon("Cardinal-do-norte", "Cardinalis cardinalis", "Cardinalis", "Cardinalidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon Cegonha_de_abdim = new Taxon("Cegonha-de-abdim", "Ciconia abdimii", "Ciconia", "Ciconiidae", "Ciconiiformes", "Aves", "Chordata", "Animalia");
		
		Taxon ChapimReal = new Taxon("Chapim-real", "Parus major", "Parus", "Paridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon Coleirinho = new Taxon("Coleirinho", "Sporophila caerulescens", "Sporophila", "Emberizidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon CorujaListrada = new Taxon("Coruja-listrada", "Strix hylophila", "Strix", "Strigidae", "Strigiformes", "Aves", "Chordata", "Animalia");
		Taxon Coruja_do_mato = new Taxon("Coruja-do-mato", "Strix virgata", "Strix", "Strigidae", "Strigiformes", "Aves", "Chordata", "Animalia");
		Taxon CorujaOrelhuda = new Taxon("Coruja-orelhuda", "Asio clamator", "Asio", "Strigidae", "Strigiformes", "Aves", "Chordata", "Animalia");
		Taxon Coruja_das_torres = new Taxon("Coruja-das-torres", "Tyto furcata", "Tyto", "Tytonidae", "Strigiformes", "Aves", "Chordata", "Animalia");
		
		Taxon CorvoAmericano = new Taxon("Corvo-americano", "Corvus brachyrhynchos", "Corvus", "Corvidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon CorvoComum = new Taxon("Corvo-comum", "Corvus corax", "Corvus", "Corvidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Carcara, Cardinal_do_norte, Cegonha_de_abdim, ChapimReal, Coleirinho, CorujaListrada, Coruja_do_mato, CorujaOrelhuda, Coruja_das_torres, CorvoAmericano, CorvoComum };
		
		System.out.println("Registros de nomes de aves que começam com a letra C: " + "\n");
		
		for (Taxon t: aves) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroF() {
		
		Taxon FalcaoAmericano = new Taxon("Falcão-americano", "Falco sparverius", "Falco", "Falconidae", "Falconiformes", "Aves", "Chordata", "Animalia");
		Taxon Falcão_de_coleira = new Taxon("Falcão-de-coleira", "Falco femoralis", "Falco", "Falconidae", "Falconiformes", "Aves", "Chordata", "Animalia");
		Taxon FalcaoPeregrino = new Taxon("Falcão-peregrino", "Falco peregrinus", "Falco", "Falconidae", "Falconiformes", "Aves", "Chordata", "Animalia");
		Taxon Falcão_de_peito_laranja = new Taxon("Falcão-de-peito-laranja", "Falco deiroleucusI", "Falco", "Falconidae", "Falconiformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { FalcaoAmericano, Falcão_de_coleira, FalcaoPeregrino, Falcão_de_peito_laranja };
		
		System.out.println("Registros de nomes de aves que começam com a letra F: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroG() {
		
		Taxon GaioAzul = new Taxon("Gaio-azul", "Cyanocitta cristata", "Cyanocitta", "Corvidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon GaviaoBelo = new Taxon("Gavião-belo", "Busarellus nigricollis", "Busarellus", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon GaviaoBranco = new Taxon("Gavião-branco", "Pseudastur albicollis", "Pseudastur", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon Gaviaozinho = new Taxon("Gaviãozinho", "Gampsonyx swainsonii", "Gampsonyx", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon Gaviao_pombo_pequeno = new Taxon("Gavião-pombo-pequeno", "Amadonastur lacernulatus", "Amadonastur", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon Gaviao_asa_de_telha = new Taxon("Gavião-asa-de-telha", "Parabuteo unicinctus", "Parabuteo", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon Gaviao_peneira = new Taxon("Gavião-peneira", "Elanus leucurus", "Elanus", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { GaioAzul, GaviaoBelo, GaviaoBranco, Gaviaozinho, Gaviao_pombo_pequeno, Gaviao_asa_de_telha, Gaviao_peneira };
		
		System.out.println("Registros de nomes de aves que começam com a letra G: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroH() {
		
		Taxon Harpia = new Taxon("Harpia", "Harpia harpyja", "Harpia", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Harpia };
		
		System.out.println("Registros de nomes de aves que começam com a letra H: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
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
		// TODO Auto-generated method stub
		
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
		
		Taxon Pardal_domestico = new Taxon("Pardal-doméstico", "Passer domesticus", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon Pardal_do_deserto = new Taxon("Pardal do deserto", "Passer simplex", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon Pardal_de_nuca_preta = new Taxon("Pardal-de-nuca-preta", "Passer ammodendri", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon PardalEspanhol = new Taxon("Pardal-espanhol", "Passer hispaniolensis", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon Pardal_de_cabo_verde = new Taxon("Pardal-de-cabo-verde", "Passer iagoensis", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon Pardal_do_quenia = new Taxon("Pardal-do-quênia", "Passer rufocinctus", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon PapagaioCampeiro = new Taxon("Papagaio-campeiro", "Amazona ochrocephala", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon PapagaioComum = new Taxon("Papagaio-comum", "Amazona aestiva", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon Papagaio_da_serra = new Taxon("Papagaio-da-serra", "Amazona pretrei", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon Papagaio_da_varzea = new Taxon("Papagaio-da-várzea", "Amazona festiva", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon Papagaio_de_Cabeça_Amarela = new Taxon("Papagaio-de-Cabeça-Amarela", "Amazona oratrix", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon Papagaio_de_peito_roxo = new Taxon("Papagaio-de-peito-roxo", "Amazona vinacea", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon PapagaioDiadema = new Taxon("Papagaio-diadema", "Amazona autumnalis", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon PapagaioMoleiro = new Taxon("Papagaio-moleiro", "Amazona farinosa", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		
		Taxon PapaFigos = new Taxon("Papa-figos", "Oriolus oriolus", "Oriolus", "Oriolidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon PatoMandarim = new Taxon("Pato-mandarim", "Aix galericulata", "Aix", "Anatidae", "Anseriformes", "Aves", "Chordata", "Animalia");
		
		Taxon PavaoIndiano = new Taxon("Pavão-indiano", "Pavo cristatus", "Pavo", "Phasianidae", "Galliformes", "Aves", "Chordata", "Animalia");
		
		Taxon Pelicano_Australiano = new Taxon("Pelicano-australiano", "Pelecanus conspicillatus", "Pelecanus", "Pelecanidae", "Pelecaniformes", "Aves", "Chordata", "Animalia");
		Taxon PelicanoBranco = new Taxon("Pelicano-branco", "Pelecanus onocrotalus", "Pelecanus", "Pelecanidae", "Pelecaniformes", "Aves", "Chordata", "Animalia");
		Taxon Pelicano_branco_americano = new Taxon("Pelicano-branco-americano", "Pelecanus erythrorhynchos", "Pelecanus", "Pelecanidae", "Pelecaniformes", "Aves", "Chordata", "Animalia");
		Taxon Pelicano_pardo = new Taxon("Pelicano-pardo", "Pelecanus occidentalis", "Pelecanus", "Pelecanidae", "Pelecaniformes", "Aves", "Chordata", "Animalia");
		
		Taxon Pica_pau_de_banda_branca = new Taxon("Pica-pau-de-banda-branca", "Dryocopus lineatus", "Dryocopus", "Picidae", "Piciformes", "Aves", "Chordata", "Animalia");
		
		Taxon PomboComum = new Taxon("Pombo-comum", "Columba livia", "Columba", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Pardal_domestico, Pardal_do_deserto, Pardal_de_nuca_preta, PardalEspanhol, Pardal_de_cabo_verde, Pardal_do_quenia, PapagaioCampeiro, PapagaioComum, Papagaio_da_serra, Papagaio_da_varzea, Papagaio_de_Cabeça_Amarela, Papagaio_de_peito_roxo, PapagaioDiadema, PapagaioMoleiro, PapaFigos, PatoMandarim, PavaoIndiano, Pelicano_Australiano, PelicanoBranco, Pelicano_branco_americano, Pelicano_pardo, Pica_pau_de_banda_branca, PomboComum };
		
		System.out.println("Registros de nomes de aves que começam com a letra P: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroQ() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroR() {
		
		Taxon RolaComum = new Taxon("Rola-comum", "Streptopelia turtur", "Streptopelia", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		Taxon Rola_de_amadoa = new Taxon("Rola-de-amadoa", "Streptopelia hypopyrrha", "Streptopelia", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		Taxon Rola_de_olhos_vermelhos = new Taxon("Rola-de-olhos-vermelhos", "Streptopelia semitorquata", "Streptopelia", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		Taxon Rola_do_senegal = new Taxon("Rola-do-senegal", "Streptopelia senegalensis", "Streptopelia", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		Taxon RolaVinacea = new Taxon("Rola-vinácea", "Streptopelia vinacea", "Streptopelia", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		
		Taxon Rouxinol = new Taxon("Pombo-comum", "Luscinia megarhynchos", "Luscinia", "Muscicapidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { RolaComum, Rola_de_amadoa, Rola_de_olhos_vermelhos, Rola_do_senegal, RolaVinacea, Rouxinol };
		
		System.out.println("Registros de nomes de aves que começam com a letra R: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroS() {
		
		Taxon SabiaLaranjeira = new Taxon("Sabiá-laranjeira", "Turdus rufiventris", "Turdus", "Turdidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon SabiaRuivo = new Taxon("Sabiá-ruivo", "Turdus iliacus", "Turdus", "Turdidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { SabiaLaranjeira, SabiaRuivo };
		
		System.out.println("Registros de nomes de aves que começam com a letra S: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroT() {
		
		Taxon TordoAfricano = new Taxon("Tordo-africano", "Turdus pelios", "Turdus", "Turdidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon TordoAmericano = new Taxon("Tordo-americano", "Turdus migratorius", "Turdus", "Turdidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon TordoComum = new Taxon("Tordo-comum", "Turdus philomelos", "Turdus", "Turdidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon Tordo_de_garganta_preta = new Taxon("Tordo-de-garganta-preta", "Turdus atrogularis", "Turdus", "Turdidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon TordoEscuro = new Taxon("Tordo-escuro", "Turdus obscurus", "Turdus", "Turdidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon TucanoToco = new Taxon("Tucano-toco", "Ramphastos toco", "Ramphastos", "Ramphastidae", "Piciformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { TordoAfricano, TordoAmericano, TordoComum, Tordo_de_garganta_preta, TordoEscuro, TucanoToco };
		
		System.out.println("Registros de nomes de aves que começam com a letra T: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroU() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroV() {
		// TODO Auto-generated method stub
		
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
