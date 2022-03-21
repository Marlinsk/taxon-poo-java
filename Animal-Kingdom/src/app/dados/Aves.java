package app.dados;

import app.entidades.Taxon;
import app.negocio.Registros;

public class Aves implements Registros {

	@Override
	public void RegistroA() {
		
		Taxon AraraCaninde = new Taxon("Arara-canind�", "Ara ararauna", "Ara", "Psittacidae", "Psittaciformes", "Aves", "Chordata", "Animalia");
		Taxon AraraAzulGrande = new Taxon("Arara-azul-grande", "Anodorhynchus hyacinthinus", "Anodorhynchus", "Psittacidae", "Psittaciformes", "Aves", "Chordata", "Animalia");
		Taxon AraraVermelha = new Taxon("Arara-vermelha", "Ara chloropterus", "Ara", "Psittacidae", "Psittaciformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { AraraCaninde, AraraAzulGrande, AraraVermelha };
		
		System.out.println("Registros de nomes de aves que come�am com a letra A: " + "\n");
		
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
		
		System.out.println("Registros de nomes de aves que come�am com a letra B: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroC() {
		
		Taxon Carcara = new Taxon("Carcar�", "Caracara plancus", "Caracara", "Falconidae", "Falconiformes", "Aves", "Chordata", "Animalia");
		
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
		
		System.out.println("Registros de nomes de aves que come�am com a letra C: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
	}

	@Override
	public void RegistroD() {
		
		Taxon Dan�ador_de_cauda_graduada = new Taxon("Dan�ador-de-cauda-graduada", "Ceratopipra chloromeros", "Ceratopipra", "Pipridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Dan�ador_de_cauda_graduada };
		
		System.out.println("Registros de nomes de aves que come�am com a letra D: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroE() {
		
		Taxon Estalador_do_norte = new Taxon("Estalador-do-norte", "Corythopis torquatus", "Corythopis", "Tyrannidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Estalador_do_norte };
		
		System.out.println("Registros de nomes de aves que come�am com a letra E: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroF() {
		
		Taxon FalcaoAmericano = new Taxon("Falc�o-americano", "Falco sparverius", "Falco", "Falconidae", "Falconiformes", "Aves", "Chordata", "Animalia");
		Taxon Falc�o_de_coleira = new Taxon("Falc�o-de-coleira", "Falco femoralis", "Falco", "Falconidae", "Falconiformes", "Aves", "Chordata", "Animalia");
		Taxon FalcaoPeregrino = new Taxon("Falc�o-peregrino", "Falco peregrinus", "Falco", "Falconidae", "Falconiformes", "Aves", "Chordata", "Animalia");
		Taxon Falc�o_de_peito_laranja = new Taxon("Falc�o-de-peito-laranja", "Falco deiroleucusI", "Falco", "Falconidae", "Falconiformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { FalcaoAmericano, Falc�o_de_coleira, FalcaoPeregrino, Falc�o_de_peito_laranja };
		
		System.out.println("Registros de nomes de aves que come�am com a letra F: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroG() {
		
		Taxon GaioAzul = new Taxon("Gaio-azul", "Cyanocitta cristata", "Cyanocitta", "Corvidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon GaviaoBelo = new Taxon("Gavi�o-belo", "Busarellus nigricollis", "Busarellus", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon GaviaoBranco = new Taxon("Gavi�o-branco", "Pseudastur albicollis", "Pseudastur", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon Gaviaozinho = new Taxon("Gavi�ozinho", "Gampsonyx swainsonii", "Gampsonyx", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon Gaviao_pombo_pequeno = new Taxon("Gavi�o-pombo-pequeno", "Amadonastur lacernulatus", "Amadonastur", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon Gaviao_asa_de_telha = new Taxon("Gavi�o-asa-de-telha", "Parabuteo unicinctus", "Parabuteo", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon Gaviao_peneira = new Taxon("Gavi�o-peneira", "Elanus leucurus", "Elanus", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		
		Taxon Gralha_preta = new Taxon("Gralha-preta", "Corvus corone", "Corvus", "Corvidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { GaioAzul, GaviaoBelo, GaviaoBranco, Gaviaozinho, Gaviao_pombo_pequeno, Gaviao_asa_de_telha, Gaviao_peneira, Gralha_preta };
		
		System.out.println("Registros de nomes de aves que come�am com a letra G: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroH() {
		
		Taxon Harpia = new Taxon("Harpia", "Harpia harpyja", "Harpia", "Accipitridae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Harpia };
		
		System.out.println("Registros de nomes de aves que come�am com a letra H: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroI() {
		
		Taxon Irre = new Taxon("Irr�", "Myiarchus swainsoni", "Myiarchus", "Tyrannidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Irre };
		
		System.out.println("Registros de nomes de aves que come�am com a letra I: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroJ() {
		
		Taxon Joao_de_barro = new Taxon("Jo�o-de-barro", "Furnarius rufus", "Furnarius", "Furnariidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Joao_de_barro };
		
		System.out.println("Registros de nomes de aves que come�am com a letra J: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroK() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroL() {
		
		Taxon Lenheiro_da_serra_do_cipo = new Taxon("Lenheiro-da-serra-do-cip�", "Asthenes luizae", "Asthenes", "Furnariidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Lenheiro_da_serra_do_cipo };
		
		System.out.println("Registros de nomes de aves que come�am com a letra L: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroM() {
		
		Taxon Mineirinho = new Taxon("Mineirinho", "Charitospiza eucosma", "Charitospiza", "Thraupidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Mineirinho };
		
		System.out.println("Registros de nomes de aves que come�am com a letra M: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroN() {
		
		Taxon Neinei = new Taxon("Neinei", "Megarynchus pitangua", "Megarynchus", "Tyrannidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Neinei };
		
		System.out.println("Registros de nomes de aves que come�am com a letra N: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
	}

	@Override
	public void RegistroO() {
		
		Taxon Olho_falso = new Taxon("Olho-falso", "Hemitriccus diops", "Hemitriccus", "Tyrannidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Olho_falso };
		
		System.out.println("Registros de nomes de aves que come�am com a letra O: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroP() {
		
		Taxon Pardal_domestico = new Taxon("Pardal-dom�stico", "Passer domesticus", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon Pardal_do_deserto = new Taxon("Pardal do deserto", "Passer simplex", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon Pardal_de_nuca_preta = new Taxon("Pardal-de-nuca-preta", "Passer ammodendri", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon PardalEspanhol = new Taxon("Pardal-espanhol", "Passer hispaniolensis", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon Pardal_de_cabo_verde = new Taxon("Pardal-de-cabo-verde", "Passer iagoensis", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon Pardal_do_quenia = new Taxon("Pardal-do-qu�nia", "Passer rufocinctus", "Passer", "Passeridae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon PapagaioCampeiro = new Taxon("Papagaio-campeiro", "Amazona ochrocephala", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon PapagaioComum = new Taxon("Papagaio-comum", "Amazona aestiva", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon Papagaio_da_serra = new Taxon("Papagaio-da-serra", "Amazona pretrei", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon Papagaio_da_varzea = new Taxon("Papagaio-da-v�rzea", "Amazona festiva", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon Papagaio_de_Cabe�a_Amarela = new Taxon("Papagaio-de-Cabe�a-Amarela", "Amazona oratrix", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon Papagaio_de_peito_roxo = new Taxon("Papagaio-de-peito-roxo", "Amazona vinacea", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon PapagaioDiadema = new Taxon("Papagaio-diadema", "Amazona autumnalis", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		Taxon PapagaioMoleiro = new Taxon("Papagaio-moleiro", "Amazona farinosa", "Amazona", "Psittacidae", "Psitaciformes", "Aves", "Chordata", "Animalia");
		
		Taxon PapaFigos = new Taxon("Papa-figos", "Oriolus oriolus", "Oriolus", "Oriolidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon PatoMandarim = new Taxon("Pato-mandarim", "Aix galericulata", "Aix", "Anatidae", "Anseriformes", "Aves", "Chordata", "Animalia");
		
		Taxon PavaoIndiano = new Taxon("Pav�o-indiano", "Pavo cristatus", "Pavo", "Phasianidae", "Galliformes", "Aves", "Chordata", "Animalia");
		
		Taxon Pelicano_Australiano = new Taxon("Pelicano-australiano", "Pelecanus conspicillatus", "Pelecanus", "Pelecanidae", "Pelecaniformes", "Aves", "Chordata", "Animalia");
		Taxon PelicanoBranco = new Taxon("Pelicano-branco", "Pelecanus onocrotalus", "Pelecanus", "Pelecanidae", "Pelecaniformes", "Aves", "Chordata", "Animalia");
		Taxon Pelicano_branco_americano = new Taxon("Pelicano-branco-americano", "Pelecanus erythrorhynchos", "Pelecanus", "Pelecanidae", "Pelecaniformes", "Aves", "Chordata", "Animalia");
		Taxon Pelicano_pardo = new Taxon("Pelicano-pardo", "Pelecanus occidentalis", "Pelecanus", "Pelecanidae", "Pelecaniformes", "Aves", "Chordata", "Animalia");
		
		Taxon Pica_pau_de_banda_branca = new Taxon("Pica-pau-de-banda-branca", "Dryocopus lineatus", "Dryocopus", "Picidae", "Piciformes", "Aves", "Chordata", "Animalia");
		
		Taxon PomboComum = new Taxon("Pombo-comum", "Columba livia", "Columba", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Pardal_domestico, Pardal_do_deserto, Pardal_de_nuca_preta, PardalEspanhol, Pardal_de_cabo_verde, Pardal_do_quenia, PapagaioCampeiro, PapagaioComum, Papagaio_da_serra, Papagaio_da_varzea, Papagaio_de_Cabe�a_Amarela, Papagaio_de_peito_roxo, PapagaioDiadema, PapagaioMoleiro, PapaFigos, PatoMandarim, PavaoIndiano, Pelicano_Australiano, PelicanoBranco, Pelicano_branco_americano, Pelicano_pardo, Pica_pau_de_banda_branca, PomboComum };
		
		System.out.println("Registros de nomes de aves que come�am com a letra P: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroQ() {
		
		Taxon Quebra_nozes = new Taxon("Quebra-nozes", "Nucifraga", "Nucifraga", "Corvidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Quebra_nozes };
		
		System.out.println("Registros de nomes de aves que come�am com a letra Q: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroR() {
		
		Taxon RolaComum = new Taxon("Rola-comum", "Streptopelia turtur", "Streptopelia", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		Taxon Rola_de_amadoa = new Taxon("Rola-de-amadoa", "Streptopelia hypopyrrha", "Streptopelia", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		Taxon Rola_de_olhos_vermelhos = new Taxon("Rola-de-olhos-vermelhos", "Streptopelia semitorquata", "Streptopelia", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		Taxon Rola_do_senegal = new Taxon("Rola-do-senegal", "Streptopelia senegalensis", "Streptopelia", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		Taxon RolaVinacea = new Taxon("Rola-vin�cea", "Streptopelia vinacea", "Streptopelia", "Columbidae", "Columbiformes", "Aves", "Chordata", "Animalia");
		
		Taxon Rouxinol = new Taxon("Pombo-comum", "Luscinia megarhynchos", "Luscinia", "Muscicapidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { RolaComum, Rola_de_amadoa, Rola_de_olhos_vermelhos, Rola_do_senegal, RolaVinacea, Rouxinol };
		
		System.out.println("Registros de nomes de aves que come�am com a letra R: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroS() {
		
		Taxon SabiaLaranjeira = new Taxon("Sabi�-laranjeira", "Turdus rufiventris", "Turdus", "Turdidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		Taxon SabiaRuivo = new Taxon("Sabi�-ruivo", "Turdus iliacus", "Turdus", "Turdidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { SabiaLaranjeira, SabiaRuivo };
		
		System.out.println("Registros de nomes de aves que come�am com a letra S: " + "\n");
		
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
		
		System.out.println("Registros de nomes de aves que come�am com a letra T: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroU() {
		
		Taxon Urubu_de_cabe�a_amarela = new Taxon("Urubu-de-cabe�a-amarela", "Cathartes burrovianus", "Cathartes", "Cathartidae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon Urubu_de_cabe�a_vermelha = new Taxon("Urubu-de-cabe�a-vermelha", "Cathartes  aura", "Cathartes", "Cathartidae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		Taxon Urubu_rei = new Taxon("Urubu-rei", "Sarcoramphus papa", "Sarcoramphus", "Cathartidae", "Accipitriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Urubu_de_cabe�a_amarela, Urubu_de_cabe�a_vermelha, Urubu_rei };
		
		System.out.println("Registros de nomes de aves que come�am com a letra U: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroV() {
		
		Taxon Verdilhao = new Taxon("Verdilh�o", "Chloris chloris", "Chloris", "Fringillidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Verdilhao };
		
		System.out.println("Registros de nomes de aves que come�am com a letra V: " + "\n");
		
		for (Taxon t: aves) {
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
		
		Taxon Zaragateiro_da_china = new Taxon("Zaragateiro-da-china", "Garrulax canorus", "Garrulax", "Leiothrichidae", "Passeriformes", "Aves", "Chordata", "Animalia");
		
		Taxon[] aves = { Zaragateiro_da_china };
		
		System.out.println("Registros de nomes de aves que come�am com a letra Z: " + "\n");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}
}
